import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Lottery {
    private static final int TICKET_COST = 100; // Стоимость билета
    private static final Random RANDOM = new Random();
    String a;
    /*private static Map map1 = new HashMap<String,Integer>() {
      put ("hello", 1 );
    };*/
    public static Map map2 = new HashMap<>();
    static {
        map2.put("1", 164);
        map2.put("2", new Date(1700588243709L));

    }
    public static int[] generateLotteryNumbers() {

        int[] numbers = new int[5]; // Лотерея состоит из 5 чисел

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = RANDOM.nextInt(50) + 1; // Числа от 1 до 50
        }

        return numbers;
    }
    public String adc () {
        a = "hello";
        return a;
    }
    // Метод для проведения лотереи
    public static void playLottery(BankAccount account) {
        if (account.getBalance() >= TICKET_COST) {
            account.withdraw(TICKET_COST); // Снимаем деньги за билет

            int[] lotteryNumbers = generateLotteryNumbers(); // Генерируем числа
            System.out.print("Ваши лотерейные числа: ");
            for (int num : lotteryNumbers) {
                System.out.print(num + " ");
            }
            System.out.println("\nОставшийся баланс: " + account.getBalance());
        } else {
            System.out.println("Недостаточно средств для участия в лотерее!");
        }
    }
}
