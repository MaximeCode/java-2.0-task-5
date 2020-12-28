/**
 * Created on 25.12.2020
 *
 * @author me
 */
public class Division extends Operation {

    public Division(SourceData sourceData) {
        super(sourceData);
    }

    /**
     * Вычисляет результат деления дробрых чисел.
     */
    public Division calculate() {
        setResult(getFirst() / getSecond());
        return this;
    }
}
