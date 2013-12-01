package teppeistudio.jobflow;

import org.junit.Test;

import teppeistudio.modelgen.dmdl.model.ModelA;
import teppeistudio.modelgen.dmdl.model.ModelAb;
import teppeistudio.modelgen.dmdl.model.ModelB;

import com.asakusafw.testdriver.JobFlowTester;

public class MainJobFlowTest {

	@Test
	public void test(){
		JobFlowTester tester = new JobFlowTester(getClass());
		
		tester.input("modelA", ModelA.class).prepare("model_a.xls#input");
		tester.input("modelB", ModelB.class).prepare("model_b.xls#input");
		tester.output("modelAB", ModelAb.class).verify("model_ab.xls#output","model_ab.xls#rule");
		
		tester.runTest(MainJobFlow.class);
	}
}
