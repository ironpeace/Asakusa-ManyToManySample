package teppeistudio.modelgen.dmdl.csv;
import com.asakusafw.vocabulary.directio.DirectFileOutputDescription;
import teppeistudio.modelgen.dmdl.model.ModelAb;
/**
 * An abstract implementation of {@link ModelAb} exporter description using Direct I/O CSV.
 */
public abstract class AbstractModelAbCsvOutputDescription extends DirectFileOutputDescription {
    @Override public Class<? extends ModelAb> getModelType() {
        return ModelAb.class;
    }
    @Override public Class<ModelAbCsvFormat> getFormat() {
        return ModelAbCsvFormat.class;
    }
}