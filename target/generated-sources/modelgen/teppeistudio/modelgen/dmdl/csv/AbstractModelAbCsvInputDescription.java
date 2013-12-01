package teppeistudio.modelgen.dmdl.csv;
import com.asakusafw.vocabulary.directio.DirectFileInputDescription;
import teppeistudio.modelgen.dmdl.model.ModelAb;
/**
 * An abstract implementation of {@link ModelAb} importer description using Direct I/O CSV.
 */
public abstract class AbstractModelAbCsvInputDescription extends DirectFileInputDescription {
    @Override public Class<? extends ModelAb> getModelType() {
        return ModelAb.class;
    }
    @Override public Class<ModelAbCsvFormat> getFormat() {
        return ModelAbCsvFormat.class;
    }
}