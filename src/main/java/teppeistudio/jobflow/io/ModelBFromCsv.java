package teppeistudio.jobflow.io;

import teppeistudio.modelgen.dmdl.csv.AbstractModelBCsvInputDescription;

public class ModelBFromCsv extends AbstractModelBCsvInputDescription {

	@Override
	public String getBasePath() {
		return "/mms/input/";
	}

	@Override
	public String getResourcePattern() {
		return "model-B.csv";
	}

}
