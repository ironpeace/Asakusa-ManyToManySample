package teppeistudio.jobflow.io;

import teppeistudio.modelgen.dmdl.csv.AbstractModelAbCsvOutputDescription;

public class ModelABtoCsv extends AbstractModelAbCsvOutputDescription {

	@Override
	public String getBasePath() {
		return "/mms/output/";
	}

	@Override
	public String getResourcePattern() {
		return "model-AB.csv";
	}

}
