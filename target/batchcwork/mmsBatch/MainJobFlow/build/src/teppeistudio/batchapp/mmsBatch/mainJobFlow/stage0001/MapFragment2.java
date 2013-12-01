package teppeistudio.batchapp.mmsBatch.mainJobFlow.stage0001;
import com.asakusafw.runtime.core.Result;
import com.asakusafw.runtime.trace.TraceLocation;
import teppeistudio.modelgen.dmdl.model.ModelA;
import teppeistudio.modelgen.dmdl.model.ModelAb;
/**
 * {@code [in->extend(operator#1240775927)]}の処理を担当するマッププログラムの断片。
 */
@TraceLocation(batchId = "mmsBatch", flowId = "MainJobFlow", stageId = "stage0001", fragmentId = "2")@SuppressWarnings(
        "deprecation") public final class MapFragment2 implements Result<ModelA> {
    private final Result<ModelAb> out;
    private ModelAb cache = new ModelAb();
    /**
     * インスタンスを生成する。
     * @param out {@code extend#out}への出力
     */
    public MapFragment2(Result<ModelAb> out) {
        this.out = out;
    }
    @Override public void add(ModelA result) {
        this.cache.reset();
        this.cache.setIdOption(result.getIdOption());
        this.cache.setDataAOption(result.getDataAOption());
        this.cache.setNameOption(result.getNameOption());
        this.out.add(this.cache);
    }
}