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
import teppeistudio.modelgen.dmdl.io.ModelAInput;
import teppeistudio.modelgen.dmdl.io.ModelAOutput;
/**
 * ModelAを表すデータモデルクラス。
 */
@DataModelKind("DMDL")@ModelInputLocation(ModelAInput.class)@ModelOutputLocation(ModelAOutput.class)@PropertyOrder({"id"
            , "name", "data_a"}) public class ModelA implements DataModel<ModelA>, Writable {
    private final IntOption id = new IntOption();
    private final StringOption name = new StringOption();
    private final DoubleOption dataA = new DoubleOption();
    @Override@SuppressWarnings("deprecation") public void reset() {
        this.id.setNull();
        this.name.setNull();
        this.dataA.setNull();
    }
    @Override@SuppressWarnings("deprecation") public void copyFrom(ModelA other) {
        this.id.copyFrom(other.id);
        this.name.copyFrom(other.name);
        this.dataA.copyFrom(other.dataA);
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
     * data_aを返す。
     * @return data_a
     * @throws NullPointerException data_aの値が<code>null</code>である場合
     */
    public double getDataA() {
        return this.dataA.get();
    }
    /**
     * data_aを設定する。
     * @param value 設定する値
     */
    @SuppressWarnings("deprecation") public void setDataA(double value) {
        this.dataA.modify(value);
    }
    /**
     * <code>null</code>を許すdata_aを返す。
     * @return data_a
     */
    public DoubleOption getDataAOption() {
        return this.dataA;
    }
    /**
     * data_aを設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setDataAOption(DoubleOption option) {
        this.dataA.copyFrom(option);
    }
    @Override public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("{");
        result.append("class=model_a");
        result.append(", id=");
        result.append(this.id);
        result.append(", name=");
        result.append(this.name);
        result.append(", dataA=");
        result.append(this.dataA);
        result.append("}");
        return result.toString();
    }
    @Override public int hashCode() {
        int prime = 31;
        int result = 1;
        result = prime * result + id.hashCode();
        result = prime * result + name.hashCode();
        result = prime * result + dataA.hashCode();
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
        ModelA other = (ModelA) obj;
        if(this.id.equals(other.id) == false) {
            return false;
        }
        if(this.name.equals(other.name) == false) {
            return false;
        }
        if(this.dataA.equals(other.dataA) == false) {
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
        dataA.write(out);
    }
    @Override public void readFields(DataInput in) throws IOException {
        id.readFields(in);
        name.readFields(in);
        dataA.readFields(in);
    }
}