package teppeistudio.batchapp.mmsBatch.mainJobFlow.directio.epilogue;
import com.asakusafw.runtime.stage.directio.AbstractDirectOutputValue;
import com.asakusafw.runtime.stage.directio.DirectOutputSpec;
import com.asakusafw.runtime.trace.TraceLocation;
import teppeistudio.modelgen.dmdl.csv.ModelAbCsvFormat;
import teppeistudio.modelgen.dmdl.model.ModelAb;
/**
 */
@TraceLocation(batchId = "mmsBatch", flowId = "MainJobFlow", stageId = "epilogue.directio") public final class 
        ShuffleValue extends AbstractDirectOutputValue {
    /**
     * Creates a new instance.
     */
    public ShuffleValue() {
        super(new DirectOutputSpec[]{new DirectOutputSpec(ModelAb.class, "/mms/output/", ModelAbCsvFormat.class, 
                    Naming0001.class, Ordering0001.class)});
    }
}