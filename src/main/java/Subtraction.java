/**
 * Created on 25.12.2020
 *
 * @author me
 */
public class Subtraction extends Operation {

    public Subtraction(SourceData sourceData) {
        super(sourceData);
    }

    /**
     * Вычисляет разность дробрых чисел.
     */
    public Subtraction calculate() {
        setResult(getFirst() - getSecond());
        return this;
    }
}
