package teppeistudio.jobflow.io;

import teppeistudio.modelgen.dmdl.csv.AbstractModelACsvInputDescription;

public class ModelAFromCsv extends AbstractModelACsvInputDescription {

	@Override
	public String getBasePath() {
		return "/mms/input/";
	}

	@Override
	public String getResourcePattern() {
		return "model-A.csv";
	}

}
