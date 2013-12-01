package teppeistudio.batchapp.mmsBatch.mainJobFlow.directio.epilogue;
import com.asakusafw.runtime.stage.AbstractStageClient;
import com.asakusafw.runtime.stage.StageInput;
import com.asakusafw.runtime.stage.StageOutput;
import com.asakusafw.runtime.stage.directio.DirectOutputReducer;
import com.asakusafw.runtime.stage.input.TemporaryInputFormat;
import com.asakusafw.runtime.stage.output.BridgeOutputFormat;
import com.asakusafw.runtime.trace.TraceLocation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.hadoop.io.NullWritable;
import teppeistudio.modelgen.dmdl.model.ModelAb;
/**
 * A client class for "directio".
 */
@TraceLocation(batchId = "mmsBatch", flowId = "MainJobFlow", stageId = "epilogue.directio") public final class 
        StageClient extends AbstractStageClient {
    @Override protected String getBatchId() {
        return "mmsBatch";
    }
    @Override protected String getFlowId() {
        return "MainJobFlow";
    }
    @Override protected String getStageId() {
        return "epilogue.directio";
    }
    @Override protected String getStageOutputPath() {
        return "target/hadoopwork/${execution_id}/mmsBatch/MainJobFlow/epilogue/directio";
    }
    @Override protected List<StageInput> getStageInputs() {
        List<StageInput> results = new ArrayList<StageInput>();
        Map<String, String> attributes = null;
        attributes = new HashMap<String, String>();
        results.add(new StageInput("target/hadoopwork/${execution_id}/mmsBatch/MainJobFlow/stage0001/result0-*", 
                TemporaryInputFormat.class, StageMapper0.class, attributes));
        return results;
    }
    @Override protected List<StageOutput> getStageOutputs() {
        List<StageOutput> results = new ArrayList<StageOutput>();
        Map<String, String> attributes = null;
        attributes = new HashMap<String, String>();
        results.add(new StageOutput("/mms/output/", NullWritable.class, ModelAb.class, BridgeOutputFormat.class, 
                attributes));
        return results;
    }
    @Override protected Class<ShuffleKey> getShuffleKeyClassOrNull() {
        return ShuffleKey.class;
    }
    @Override protected Class<ShuffleValue> getShuffleValueClassOrNull() {
        return ShuffleValue.class;
    }
    @Override protected Class<ShuffleGroupingComparator> getGroupingComparatorClassOrNull() {
        return ShuffleGroupingComparator.class;
    }
    @Override protected Class<ShuffleSortComparator> getSortComparatorClassOrNull() {
        return ShuffleSortComparator.class;
    }
    @Override protected Class<com.asakusafw.runtime.io.util.ShuffleKey.Partitioner> getPartitionerClassOrNull() {
        return com.asakusafw.runtime.io.util.ShuffleKey.Partitioner.class;
    }
    @Override protected Class<DirectOutputReducer> getReducerClassOrNull() {
        return DirectOutputReducer.class;
    }
}