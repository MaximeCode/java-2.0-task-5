import java.util.Scanner;

/**
 * Класс для получения исходных данных из командной строки.
 * <p>
 * Created on 28.12.2020
 *
 * @author me
 */
public class SourceData {

    private String operation;
    private final double first;
    private final double second;

    public SourceData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        first = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        second = scanner.nextDouble();
        scanner.nextLine();
        while (true) {
            System.out.print("Выберете операцию (\"+\", \"-\", \"*\", \"/\"): ");
            operation = scanner.nextLine();
            for (String operation : new String[]{"+", "-", "*", "/"}) {
                if (operation.equals(this.operation)) {
                    scanner.close();
                    return;
                }
            }
            System.out.print("Операция выбрана неверно. ");
        }
    }

    public double getFirst() {
        return first;
    }

    public double getSecond() {
        return second;
    }

    public String getOperation() {
        return operation;
    }
}
