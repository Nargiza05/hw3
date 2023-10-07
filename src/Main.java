import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Создаем массив дробных чисел
        double[] numbers = {8, 2, -5.5, 3.3, 1.2, -4, 6.7, -2, 0.5, 9.1, -3, 7.2, -1, 4.4, -6};

        // Переменная для хранения суммы и количество положительных чисел
        double sum = 0;
        int count = 0;
        boolean negativeFound = false;

        // Цикл для расчета среднего арифметического положительных чисел после первого отрицательного
        for (double number : numbers) {
            if (negativeFound && number > 0) {
                sum += number;
                count++;
            }
            if (number < 0) {
                negativeFound = true;
            }
        }

        // Расчет и вывод среднего арифметического
        double average = count > 0 ? sum / count : 0;
        System.out.println("Среднее арифметическое положительных чисел после первого отрицательного: " + average);

        // Сортировка массива по возрастанию
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    // Обмен элементов
                    double temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
            // Вывод текущего состояния массива после каждой итерации
            System.out.println(Arrays.toString(numbers));
        }
    }
}