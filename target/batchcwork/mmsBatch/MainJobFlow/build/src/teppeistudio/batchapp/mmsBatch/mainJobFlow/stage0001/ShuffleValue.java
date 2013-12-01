package teppeistudio.batchapp.mmsBatch.mainJobFlow.stage0001;
import com.asakusafw.runtime.flow.SegmentedWritable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import teppeistudio.modelgen.dmdl.model.ModelAb;
/**
 * ステージ#1シャッフルで利用する値クラス。
 */
@SuppressWarnings("deprecation") public final class ShuffleValue implements SegmentedWritable {
    /**
     * セグメント番号。
     */
    public int segmentId = -1;
    @Override public int getSegmentId() {
        return this.segmentId;
    }
    /**
     * MainOperator.folded#inが利用するモデル (1)。
     */
    public ModelAb port0001 = new ModelAb();
    /**
     * MainOperator.folded#inのモデルオブジェクトを返す。
     */
    public ModelAb getPort1() {
        if(this.segmentId != 1) throw new AssertionError();
        return this.port0001;
    }
    /**
     * MainOperator.folded#inで使用するモデルオブジェクトを設定する。
     * @param model 設定するモデルオブジェクト
     */
    public void setPort1(ModelAb model) {
        this.segmentId = 1;
        this.port0001.copyFrom(model);
    }
    @Override public void write(DataOutput out) throws IOException {
        switch(this.segmentId) {
            case 1:
                out.writeInt(1);
                this.port0001.write(out);
                break;
            default:
                throw new AssertionError(this.segmentId);
        }
    }
    @Override public void readFields(DataInput in) throws IOException {
        this.segmentId = in.readInt();
        switch(this.segmentId) {
            case 1:
                this.port0001.readFields(in);
                break;
            default:
                throw new AssertionError(this.segmentId);
        }
    }
}