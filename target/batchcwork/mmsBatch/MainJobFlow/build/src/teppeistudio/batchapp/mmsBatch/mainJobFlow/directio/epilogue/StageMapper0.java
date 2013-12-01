package teppeistudio.batchapp.mmsBatch.mainJobFlow.directio.epilogue;
import com.asakusafw.runtime.stage.directio.AbstractDirectOutputMapper;
import com.asakusafw.runtime.trace.TraceLocation;
import teppeistudio.modelgen.dmdl.model.ModelAb;
/**
 */
@TraceLocation(batchId = "mmsBatch", flowId = "MainJobFlow", stageId = "epilogue.directio") public final class 
        StageMapper0 extends AbstractDirectOutputMapper<ModelAb> {
    /**
     * Creates a new instance.
     */
    public StageMapper0() {
        super(0, ShuffleKey.class, ShuffleValue.class);
    }
}