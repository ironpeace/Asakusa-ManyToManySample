package teppeistudio.batchapp.mmsBatch.mainJobFlow.directio.epilogue;
import com.asakusafw.runtime.stage.directio.AbstractDirectOutputKey;
import com.asakusafw.runtime.stage.directio.DirectOutputSpec;
import com.asakusafw.runtime.trace.TraceLocation;
import teppeistudio.modelgen.dmdl.csv.ModelAbCsvFormat;
import teppeistudio.modelgen.dmdl.model.ModelAb;
/**
 */
@TraceLocation(batchId = "mmsBatch", flowId = "MainJobFlow", stageId = "epilogue.directio") public final class 
        ShuffleKey extends AbstractDirectOutputKey {
    /**
     * Creates a new instance.
     */
    public ShuffleKey() {
        super(new DirectOutputSpec[]{new DirectOutputSpec(ModelAb.class, "/mms/output/", ModelAbCsvFormat.class, 
                    Naming0001.class, Ordering0001.class)});
    }
}