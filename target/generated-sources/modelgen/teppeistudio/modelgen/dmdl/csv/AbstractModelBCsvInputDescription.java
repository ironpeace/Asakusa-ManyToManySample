package teppeistudio.modelgen.dmdl.csv;
import com.asakusafw.vocabulary.directio.DirectFileInputDescription;
import teppeistudio.modelgen.dmdl.model.ModelB;
/**
 * An abstract implementation of {@link ModelB} importer description using Direct I/O CSV.
 */
public abstract class AbstractModelBCsvInputDescription extends DirectFileInputDescription {
    @Override public Class<? extends ModelB> getModelType() {
        return ModelB.class;
    }
    @Override public Class<ModelBCsvFormat> getFormat() {
        return ModelBCsvFormat.class;
    }
}