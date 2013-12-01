package teppeistudio.batchapp.mmsBatch.mainJobFlow.directio.epilogue;
import com.asakusafw.runtime.trace.TraceLocation;
/**
 */
@TraceLocation(batchId = "mmsBatch", flowId = "MainJobFlow", stageId = "epilogue.directio") public final class 
        ShuffleSortComparator extends com.asakusafw.runtime.io.util.ShuffleKey.AbstractOrderComparator {
    /**
     * Creates a new instance.
     */
    public ShuffleSortComparator() {
        super(ShuffleKey.class);
    }
}