package teppeistudio.operator;

import teppeistudio.modelgen.dmdl.model.ModelAb;

import com.asakusafw.vocabulary.model.Key;
import com.asakusafw.vocabulary.operator.Fold;

public abstract class MainOperator {

	@Fold
	public void folded(@Key(group="id")ModelAb left, ModelAb right){
		//leftにModelA、rightにModelBが入っている場合
		if(left.getDataBOption().isNull() && right.getDataAOption().isNull()){
			left.setDataB(right.getDataB());

		//leftにModelB、rightにModelAが入っている場合
		}else if(left.getDataAOption().isNull() && right.getDataBOption().isNull()){
			left.setDataA(right.getDataA());
			
		//どちらでもない（ModelA、ModelB両方入っている、あるいは入っていない）はありえない
		}else{
			throw new Error("ModelA、ModelB両方入っている、あるいは入っていない");
		}
	}
}
