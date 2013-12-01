package teppeistudio.modelgen.dmdl.model;
import com.asakusafw.runtime.model.DataModel;
import com.asakusafw.runtime.model.DataModelKind;
import com.asakusafw.runtime.model.ModelInputLocation;
import com.asakusafw.runtime.model.ModelOutputLocation;
import com.asakusafw.runtime.model.PropertyOrder;
import com.asakusafw.runtime.value.DoubleOption;
import com.asakusafw.runtime.value.IntOption;
import com.asakusafw.runtime.value.StringOption;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import teppeistudio.modelgen.dmdl.io.ModelBInput;
import teppeistudio.modelgen.dmdl.io.ModelBOutput;
/**
 * ModelBを表すデータモデルクラス。
 */
@DataModelKind("DMDL")@ModelInputLocation(ModelBInput.class)@ModelOutputLocation(ModelBOutput.class)@PropertyOrder({"id"
            , "name", "data_b"}) public class ModelB implements DataModel<ModelB>, Writable {
    private final IntOption id = new IntOption();
    private final StringOption name = new StringOption();
    private final DoubleOption dataB = new DoubleOption();
    @Override@SuppressWarnings("deprecation") public void reset() {
        this.id.setNull();
        this.name.setNull();
        this.dataB.setNull();
    }
    @Override@SuppressWarnings("deprecation") public void copyFrom(ModelB other) {
        this.id.copyFrom(other.id);
        this.name.copyFrom(other.name);
        this.dataB.copyFrom(other.dataB);
    }
    /**
     * idを返す。
     * @return id
     * @throws NullPointerException idの値が<code>null</code>である場合
     */
    public int getId() {
        return this.id.get();
    }
    /**
     * idを設定する。
     * @param value 設定する値
     */
    @SuppressWarnings("deprecation") public void setId(int value) {
        this.id.modify(value);
    }
    /**
     * <code>null</code>を許すidを返す。
     * @return id
     */
    public IntOption getIdOption() {
        return this.id;
    }
    /**
     * idを設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setIdOption(IntOption option) {
        this.id.copyFrom(option);
    }
    /**
     * nameを返す。
     * @return name
     * @throws NullPointerException nameの値が<code>null</code>である場合
     */
    public Text getName() {
        return this.name.get();
    }
    /**
     * nameを設定する。
     * @param value 設定する値
     */
    @SuppressWarnings("deprecation") public void setName(Text value) {
        this.name.modify(value);
    }
    /**
     * <code>null</code>を許すnameを返す。
     * @return name
     */
    public StringOption getNameOption() {
        return this.name;
    }
    /**
     * nameを設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setNameOption(StringOption option) {
        this.name.copyFrom(option);
    }
    /**
     * data_bを返す。
     * @return data_b
     * @throws NullPointerException data_bの値が<code>null</code>である場合
     */
    public double getDataB() {
        return this.dataB.get();
    }
    /**
     * data_bを設定する。
     * @param value 設定する値
     */
    @SuppressWarnings("deprecation") public void setDataB(double value) {
        this.dataB.modify(value);
    }
    /**
     * <code>null</code>を許すdata_bを返す。
     * @return data_b
     */
    public DoubleOption getDataBOption() {
        return this.dataB;
    }
    /**
     * data_bを設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setDataBOption(DoubleOption option) {
        this.dataB.copyFrom(option);
    }
    @Override public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("{");
        result.append("class=model_b");
        result.append(", id=");
        result.append(this.id);
        result.append(", name=");
        result.append(this.name);
        result.append(", dataB=");
        result.append(this.dataB);
        result.append("}");
        return result.toString();
    }
    @Override public int hashCode() {
        int prime = 31;
        int result = 1;
        result = prime * result + id.hashCode();
        result = prime * result + name.hashCode();
        result = prime * result + dataB.hashCode();
        return result;
    }
    @Override public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj == null) {
            return false;
        }
        if(this.getClass() != obj.getClass()) {
            return false;
        }
        ModelB other = (ModelB) obj;
        if(this.id.equals(other.id) == false) {
            return false;
        }
        if(this.name.equals(other.name) == false) {
            return false;
        }
        if(this.dataB.equals(other.dataB) == false) {
            return false;
        }
        return true;
    }
    /**
     * nameを返す。
     * @return name
     * @throws NullPointerException nameの値が<code>null</code>である場合
     */
    public String getNameAsString() {
        return this.name.getAsString();
    }
    /**
     * nameを設定する。
     * @param name0 設定する値
     */
    @SuppressWarnings("deprecation") public void setNameAsString(String name0) {
        this.name.modify(name0);
    }
    @Override public void write(DataOutput out) throws IOException {
        id.write(out);
        name.write(out);
        dataB.write(out);
    }
    @Override public void readFields(DataInput in) throws IOException {
        id.readFields(in);
        name.readFields(in);
        dataB.readFields(in);
    }
}