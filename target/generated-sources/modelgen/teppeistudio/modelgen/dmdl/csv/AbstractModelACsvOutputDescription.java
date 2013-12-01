package teppeistudio.modelgen.dmdl.csv;
import com.asakusafw.vocabulary.directio.DirectFileOutputDescription;
import teppeistudio.modelgen.dmdl.model.ModelA;
/**
 * An abstract implementation of {@link ModelA} exporter description using Direct I/O CSV.
 */
public abstract class AbstractModelACsvOutputDescription extends DirectFileOutputDescription {
    @Override public Class<? extends ModelA> getModelType() {
        return ModelA.class;
    }
    @Override public Class<ModelACsvFormat> getFormat() {
        return ModelACsvFormat.class;
    }
}