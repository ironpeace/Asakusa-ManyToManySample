package teppeistudio.batchapp.mmsBatch.mainJobFlow.directio.epilogue;
import com.asakusafw.runtime.stage.directio.DirectOutputOrder;
import teppeistudio.modelgen.dmdl.model.ModelAb;
/**
 * An ordering output "modelAB" class for "directio".
 */
public final class Ordering0001 extends DirectOutputOrder {
    /**
     * Creates a new instance.
     */
    public Ordering0001() {
        super();
    }
    @Override public void set(Object rawObject) {
        ModelAb object = (ModelAb) rawObject;
    }
}