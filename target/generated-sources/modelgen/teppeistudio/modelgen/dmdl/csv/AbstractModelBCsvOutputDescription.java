package teppeistudio.modelgen.dmdl.csv;
import com.asakusafw.vocabulary.directio.DirectFileOutputDescription;
import teppeistudio.modelgen.dmdl.model.ModelB;
/**
 * An abstract implementation of {@link ModelB} exporter description using Direct I/O CSV.
 */
public abstract class AbstractModelBCsvOutputDescription extends DirectFileOutputDescription {
    @Override public Class<? extends ModelB> getModelType() {
        return ModelB.class;
    }
    @Override public Class<ModelBCsvFormat> getFormat() {
        return ModelBCsvFormat.class;
    }
}