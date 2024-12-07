import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Создаем банковские счета
        System.out.println(Math.ceil(2.2));
        BankAccount account1 = new BankAccount(500.0); // Счет с балансом 500
        BankAccount account2 = new BankAccount(50.0);  // Счет с балансом 50
        BankAccount account3 = new BankAccount(200.0); // Счет с балансом 200

        Duck duck = new Duck();
        Penguin penguin = new Penguin();
        Sparrow sparrow = new Sparrow();
        duck.fly();
        duck.swim();
        penguin.swim();
        sparrow.fly();


        Random random = new Random();
        int i = random.nextInt(25);
        System.out.println(System.currentTimeMillis());
        System.out.println(Lottery.map2);

        System.out.println("Игрок 1 (Счет №" + account1.getAccountNumber() + "):");
        Lottery.playLottery(account1);

        System.out.println(BankAccount.nextAccountNumber);
        // Играем в лотерею со второго счета
        System.out.println("\nИгрок 2 (Счет №" + account2.getAccountNumber() + "):");
        Lottery.playLottery(account2);

        // Играем в лотерею с третьего счета
        System.out.println("\nИгрок 3 (Счет №" + account3.getAccountNumber() + "):");
        Lottery.playLottery(account3);

        // Пополняем баланс третьего счета и снова играем
        account3.deposit(100.0);
        System.out.println("\nИгрок 3 (Счет №" + account3.getAccountNumber() + ") снова играет:");
        Lottery.playLottery(account3);
    }

}
