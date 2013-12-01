package teppeistudio.modelgen.dmdl.csv;
import com.asakusafw.vocabulary.directio.DirectFileInputDescription;
import teppeistudio.modelgen.dmdl.model.ModelA;
/**
 * An abstract implementation of {@link ModelA} importer description using Direct I/O CSV.
 */
public abstract class AbstractModelACsvInputDescription extends DirectFileInputDescription {
    @Override public Class<? extends ModelA> getModelType() {
        return ModelA.class;
    }
    @Override public Class<ModelACsvFormat> getFormat() {
        return ModelACsvFormat.class;
    }
}