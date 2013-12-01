package teppeistudio.modelgen.dmdl.io;
import com.asakusafw.runtime.io.ModelInput;
import com.asakusafw.runtime.io.RecordParser;
import java.io.IOException;
import teppeistudio.modelgen.dmdl.model.ModelB;
/**
 * TSVファイルなどのレコードを表すファイルを入力として<code>model_b</code>を読み出す
 */
public final class ModelBInput implements ModelInput<ModelB> {
    private final RecordParser parser;
    /**
     * インスタンスを生成する。
     * @param parser 利用するパーサー
     * @throws IllegalArgumentException 引数に<code>null</code>が指定された場合
     */
    public ModelBInput(RecordParser parser) {
        if(parser == null) {
            throw new IllegalArgumentException("parser");
        }
        this.parser = parser;
    }
    @Override public boolean readTo(ModelB model) throws IOException {
        if(parser.next() == false) {
            return false;
        }
        parser.fill(model.getIdOption());
        parser.fill(model.getNameOption());
        parser.fill(model.getDataBOption());
        parser.endRecord();
        return true;
    }
    @Override public void close() throws IOException {
        parser.close();
    }
}