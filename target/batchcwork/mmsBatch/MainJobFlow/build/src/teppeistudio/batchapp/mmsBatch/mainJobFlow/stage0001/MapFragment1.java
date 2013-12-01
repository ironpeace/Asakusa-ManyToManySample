package teppeistudio.batchapp.mmsBatch.mainJobFlow.stage0001;
import com.asakusafw.runtime.core.Result;
import com.asakusafw.runtime.trace.TraceLocation;
import teppeistudio.modelgen.dmdl.model.ModelAb;
import teppeistudio.modelgen.dmdl.model.ModelB;
/**
 * {@code [in->extend(operator#1301353792)]}の処理を担当するマッププログラムの断片。
 */
@TraceLocation(batchId = "mmsBatch", flowId = "MainJobFlow", stageId = "stage0001", fragmentId = "1")@SuppressWarnings(
        "deprecation") public final class MapFragment1 implements Result<ModelB> {
    private final Result<ModelAb> out;
    private ModelAb cache = new ModelAb();
    /**
     * インスタンスを生成する。
     * @param out {@code extend#out}への出力
     */
    public MapFragment1(Result<ModelAb> out) {
        this.out = out;
    }
    @Override public void add(ModelB result) {
        this.cache.reset();
        this.cache.setIdOption(result.getIdOption());
        this.cache.setNameOption(result.getNameOption());
        this.cache.setDataBOption(result.getDataBOption());
        this.out.add(this.cache);
    }
}