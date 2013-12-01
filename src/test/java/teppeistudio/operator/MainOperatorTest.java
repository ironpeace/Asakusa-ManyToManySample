package teppeistudio.operator;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import teppeistudio.modelgen.dmdl.model.ModelAb;

public class MainOperatorTest {

	@Test
	public void left_is_A_and_right_is_B(){
		MainOperatorImpl op = new MainOperatorImpl();
		
		ModelAb left = new ModelAb();
		left.setId(1);
		left.setNameAsString("name");
		left.setDataA(1);

		ModelAb right = new ModelAb();
		right.setId(1);
		right.setNameAsString("name");
		right.setDataB(2);

		op.folded(left, right);
		
		assertThat(left.getId(), is(1));
		assertThat(left.getNameAsString(), is("name"));
		assertThat(left.getDataA(), is(1.0));
		assertThat(left.getDataB(), is(2.0));
	}

	@Test
	public void left_is_B_and_right_is_A(){
		MainOperatorImpl op = new MainOperatorImpl();
		
		ModelAb left = new ModelAb();
		left.setId(1);
		left.setNameAsString("name");
		left.setDataB(1);

		ModelAb right = new ModelAb();
		right.setId(1);
		right.setNameAsString("name");
		right.setDataA(2);

		op.folded(left, right);
		
		assertThat(left.getId(), is(1));
		assertThat(left.getNameAsString(), is("name"));
		assertThat(left.getDataA(), is(2.0));
		assertThat(left.getDataB(), is(1.0));
	}
}
