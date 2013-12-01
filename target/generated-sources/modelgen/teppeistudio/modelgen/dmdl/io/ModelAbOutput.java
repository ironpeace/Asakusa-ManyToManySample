package teppeistudio.modelgen.dmdl.io;
import com.asakusafw.runtime.io.ModelOutput;
import com.asakusafw.runtime.io.RecordEmitter;
import java.io.IOException;
import teppeistudio.modelgen.dmdl.model.ModelAb;
/**
 * <code>model_ab</code>をTSVなどのレコード形式で出力する。
 */
public final class ModelAbOutput implements ModelOutput<ModelAb> {
    private final RecordEmitter emitter;
    /**
     * インスタンスを生成する。
     * @param emitter 利用するエミッター
     * @throws IllegalArgumentException 引数にnullが指定された場合
     */
    public ModelAbOutput(RecordEmitter emitter) {
        if(emitter == null) {
            throw new IllegalArgumentException();
        }
        this.emitter = emitter;
    }
    @Override public void write(ModelAb model) throws IOException {
        emitter.emit(model.getIdOption());
        emitter.emit(model.getNameOption());
        emitter.emit(model.getDataAOption());
        emitter.emit(model.getDataBOption());
        emitter.endRecord();
    }
    @Override public void close() throws IOException {
        emitter.close();
    }
}