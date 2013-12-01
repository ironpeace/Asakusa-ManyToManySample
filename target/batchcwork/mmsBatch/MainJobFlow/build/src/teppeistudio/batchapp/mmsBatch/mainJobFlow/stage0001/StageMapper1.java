package teppeistudio.batchapp.mmsBatch.mainJobFlow.stage0001;
import com.asakusafw.runtime.flow.MapperWithRuntimeResource;
import com.asakusafw.runtime.trace.TraceLocation;
import java.io.IOException;
import org.apache.hadoop.io.NullWritable;
import teppeistudio.modelgen.dmdl.model.ModelB;
/**
 * {@code [in->extend(operator#1301353792){owner=FlowBlock&#64;141106670}]}の処理を担当するマッププログラム。
 */
@TraceLocation(batchId = "mmsBatch", flowId = "MainJobFlow", stageId = "stage0001", stageUnitId = "m1")@SuppressWarnings
        ("deprecation") public final class StageMapper1 extends MapperWithRuntimeResource<NullWritable, ModelB, 
        ShuffleKey, ShuffleValue> {
    private ModelB cache = new ModelB();
    private MapFragment1 line;
    @Override public void setup(Context context) throws IOException, InterruptedException {
        final MapOutputFragment1 shuffle = new MapOutputFragment1(context);
        this.line = new MapFragment1(shuffle);
    }
    @Override public void cleanup(Context context) throws IOException, InterruptedException {
        this.line = null;
    }
    @Override public void runInternal(Context context) throws IOException, InterruptedException {
        this.setup(context);
        while(context.nextKeyValue()) {
            cache.copyFrom(context.getCurrentValue());
            this.line.add(cache);
        }
        this.cleanup(context);
    }
}