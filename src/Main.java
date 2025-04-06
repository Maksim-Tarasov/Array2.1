public class Main {
    public static void main(String[] args) {
        int[] payments = new int[]{15000, 23000, 18000, 27000, 19500};
        int sum = 0;
        for (int payment : payments) {
            sum += payment;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");


        int[] expenses = new int[]{4200, 7800, 3100, 5900, 9500};
        int min = expenses[0];
        int max = expenses[0];

        for (int expense : expenses) {
            if (expense < min) min = expense;
            if (expense > max) max = expense;
        }

        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей. " +
                "Максимальная сумма трат за неделю составила " + max + " рублей");


        int[] averageExpenses = {4200, 7800, 3100, 5900, 9500};
        double sumAverage = 0;
        for (int expense : averageExpenses) {
            sumAverage += expense;
        }
        double average = sumAverage/averageExpenses.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");


        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int left = 0;
        int right = reverseFullName.length - 1;
        while (left < right) {
            char temp = reverseFullName[left];
            reverseFullName[left] = reverseFullName[right];
            reverseFullName[right] = temp;
            left++;
            right--;
        }
        System.out.println(new String(reverseFullName));
    }
}