/**
 * Created on 25.12.2020
 *
 * @author me
 */
public abstract class Operation implements Calculative {

    private final double first;
    private final double second;
    private double result;

    public Operation(SourceData sourceData) {
        first = sourceData.getFirst();
        second = sourceData.getSecond();
    }

    public void setResult(double result) {
        this.result = result;
    }

    public double getFirst() {
        return first;
    }

    public double getSecond() {
        return second;
    }

    public abstract Operation calculate();

    /**
     * Возвращает объект операции конкретного вида в зависимости от знака операци.
     *
     * @param sourceData объект с исходными данными для операции
     * @return объект операции конкретного вида
     */
    public static Operation getOperation(SourceData sourceData) {
        String operation = sourceData.getOperation();
        if ("+".equals(operation)) {
            return new Addition(sourceData);
        }
        if ("-".equals(operation)) {
            return new Subtraction(sourceData);
        }
        if ("*".equals(operation)) {
            return new Multiplication(sourceData);
        }
        return new Division(sourceData);
    }

    public void printResult() {
        System.out.printf("%.4f", result);
    }
}
