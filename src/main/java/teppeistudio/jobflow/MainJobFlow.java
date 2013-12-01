package teppeistudio.jobflow;

import teppeistudio.jobflow.io.ModelABtoCsv;
import teppeistudio.jobflow.io.ModelAFromCsv;
import teppeistudio.jobflow.io.ModelBFromCsv;
import teppeistudio.modelgen.dmdl.model.ModelA;
import teppeistudio.modelgen.dmdl.model.ModelAb;
import teppeistudio.modelgen.dmdl.model.ModelB;
import teppeistudio.operator.MainOperatorFactory;
import teppeistudio.operator.MainOperatorFactory.Folded;

import com.asakusafw.vocabulary.flow.Export;
import com.asakusafw.vocabulary.flow.FlowDescription;
import com.asakusafw.vocabulary.flow.Import;
import com.asakusafw.vocabulary.flow.In;
import com.asakusafw.vocabulary.flow.JobFlow;
import com.asakusafw.vocabulary.flow.Out;
import com.asakusafw.vocabulary.flow.util.CoreOperatorFactory;
import com.asakusafw.vocabulary.flow.util.CoreOperatorFactory.Confluent;
import com.asakusafw.vocabulary.flow.util.CoreOperatorFactory.Extend;

@JobFlow(name="MainJobFlow")
public class MainJobFlow extends FlowDescription {
	
	final In<ModelA> modelA;
	final In<ModelB> modelB;
	final Out<ModelAb> modelAB;
	
	public MainJobFlow(
			@Import(name="modelA", description=ModelAFromCsv.class)
			In<ModelA> modelA,
			@Import(name="modelB", description=ModelBFromCsv.class)
			In<ModelB> modelB,
			@Export(name="modelAB", description=ModelABtoCsv.class)
			Out<ModelAb> modelAB
			){
		this.modelA = modelA;
		this.modelB = modelB;
		this.modelAB = modelAB;
	}

	@Override
	protected void describe() {
		MainOperatorFactory op = new MainOperatorFactory();
		CoreOperatorFactory cp = new CoreOperatorFactory();
		
		//①まずはインプットしたModelAとModelBをそれぞれModelABにExtend（拡張）
		Extend<ModelAb> extendedA = cp.extend(modelA, ModelAb.class);
		Extend<ModelAb> extendedB = cp.extend(modelB, ModelAb.class);
		
		//②Extendした両モデルを、Confluent(合流)
		Confluent<ModelAb> confluented = cp.confluent(extendedA.out, extendedB.out);

		//③ConfluentしたモデルをFold（畳み込み）
		Folded folded = op.folded(confluented.out);
		
		modelAB.add(folded.out);
	}

}
