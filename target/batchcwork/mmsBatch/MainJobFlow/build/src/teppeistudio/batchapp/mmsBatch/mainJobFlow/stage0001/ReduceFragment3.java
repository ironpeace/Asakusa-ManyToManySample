package teppeistudio.batchapp.mmsBatch.mainJobFlow.stage0001;
import com.asakusafw.runtime.core.Result;
import com.asakusafw.runtime.trace.TraceLocation;
import teppeistudio.modelgen.dmdl.model.ModelAb;
import teppeistudio.operator.MainOperatorImpl;
/**
 * {@code [in->MainOperator.folded(operator#1778276127)]}の処理を担当するマッププログラムの断片。
 */
@TraceLocation(batchId = "mmsBatch", flowId = "MainJobFlow", stageId = "stage0001", fragmentId = "3")@SuppressWarnings(
        "deprecation") public final class ReduceFragment3 extends com.asakusafw.runtime.flow.Rendezvous<ShuffleValue> {
    private final Result<ModelAb> out;
    private boolean initialized;
    private ModelAb cache = new ModelAb();
    private MainOperatorImpl op = new MainOperatorImpl();
    /**
     * インスタンスを生成する。
     * @param out {@code MainOperator.folded#out}への出力
     */
    public ReduceFragment3(Result<ModelAb> out) {
        this.out = out;
    }
    @Override public void process(ShuffleValue value) {
        switch(value.getSegmentId()) {
            case 1:
                this.process0001(value.getPort1());
                break;
            default:
                throw new AssertionError(value);
        }
    }
    @Override public void begin() {
        this.initialized = false;
    }
    @Override public void end() {
        this.out.add(this.cache);
    }
    private void process0001(ModelAb value) {
        if(this.initialized) {
            this.op.folded(this.cache, value);
        }
        else {
            this.cache.copyFrom(value);
            this.initialized = true;
        }
    }
}