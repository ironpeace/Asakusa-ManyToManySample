package teppeistudio.operator;
import com.asakusafw.vocabulary.flow.Operator;
import com.asakusafw.vocabulary.flow.Source;
import com.asakusafw.vocabulary.flow.graph.FlowBoundary;
import com.asakusafw.vocabulary.flow.graph.FlowElementResolver;
import com.asakusafw.vocabulary.flow.graph.ObservationCount;
import com.asakusafw.vocabulary.flow.graph.OperatorDescription;
import com.asakusafw.vocabulary.flow.graph.ShuffleKey;
import com.asakusafw.vocabulary.flow.processor.PartialAggregation;
import com.asakusafw.vocabulary.operator.Fold;
import com.asakusafw.vocabulary.operator.KeyInfo;
import com.asakusafw.vocabulary.operator.OperatorFactory;
import com.asakusafw.vocabulary.operator.OperatorInfo;
import java.util.Arrays;
import javax.annotation.Generated;
import teppeistudio.modelgen.dmdl.model.ModelAb;
/**
 * {@link MainOperator}に関する演算子ファクトリークラス。
 * @see MainOperator
 */
@Generated("OperatorFactoryClassGenerator:0.0.1")@OperatorFactory(MainOperator.class) public class MainOperatorFactory {
    /**
     */
    public static final class Folded implements Operator {
        private final FlowElementResolver $;
        /**
         * 畳み込みの結果
         */
        public final Source<ModelAb> out;
        Folded(Source<ModelAb> in) {
            OperatorDescription.Builder builder = new OperatorDescription.Builder(Fold.class);
            builder.declare(MainOperator.class, MainOperatorImpl.class, "folded");
            builder.declareParameter(ModelAb.class);
            builder.declareParameter(ModelAb.class);
            builder.addInput("in", in, new ShuffleKey(Arrays.asList(new String[]{"id"}), Arrays.asList(new ShuffleKey.
                    Order[]{})));
            builder.addOutput("out", in);
            builder.addAttribute(FlowBoundary.SHUFFLE);
            builder.addAttribute(ObservationCount.DONT_CARE);
            builder.addAttribute(PartialAggregation.DEFAULT);
            this.$ = builder.toResolver();
            this.$.resolveInput("in", in);
            this.out = this.$.resolveOutput("out");
        }
        /**
         * この演算子の名前を設定する。
         * @param newName 設定する名前
         * @return この演算子オブジェクト (this)
         * @throws IllegalArgumentException 引数に{@code null}が指定された場合
         */
        public MainOperatorFactory.Folded as(String newName) {
            this.$.setName(newName);
            return this;
        }
    }
    /**
     * @param in
     * @return 生成した演算子オブジェクト
     * @see MainOperator#folded(ModelAb, ModelAb)
     */
    @OperatorInfo(kind = Fold.class, input = {@OperatorInfo.Input(name = "in", type = ModelAb.class, position = 0)}, 
            output = {@OperatorInfo.Output(name = "out", type = ModelAb.class)}, parameter = {}) public 
            MainOperatorFactory.Folded folded(@KeyInfo(group = {@KeyInfo.Group(expression = "id")}, order = {}) Source<
            ModelAb> in) {
        return new MainOperatorFactory.Folded(in);
    }
}