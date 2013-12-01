package teppeistudio.batchapp.mmsBatch.mainJobFlow.directio.epilogue;
import com.asakusafw.runtime.stage.directio.StringTemplate;
import teppeistudio.modelgen.dmdl.model.ModelAb;
/**
 * A naming output "modelAB" class for "directio".
 */
@SuppressWarnings("deprecation") public final class Naming0001 extends StringTemplate {
    /**
     * Creates a new instance.
     */
    public Naming0001() {
        super(new StringTemplate.FormatSpec(StringTemplate.Format.PLAIN, "model-AB.csv"));
    }
    @Override public void set(Object rawObject) {
        ModelAb object = (ModelAb) rawObject;
    }
}