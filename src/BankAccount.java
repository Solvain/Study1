public class BankAccount {
    private double balance; // Приватное поле для хранения баланса
    private int accountNumber; // Уникальный номер счета
    public static int nextAccountNumber = 1; // Статическое поле для генерации номеров счетов

    // Конструктор
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
        this.accountNumber = nextAccountNumber; // Присваиваем текущий номер
        nextAccountNumber++; // Увеличиваем для следующего счета
    }

    // для номера счета
    public int getAccountNumber() {
        return accountNumber;
    }

    // для баланса
    public double getBalance() {
        return balance;
    }

    // пополнения счета
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Пополнено: " + amount);
        } else {
            System.out.println("Сумма должна быть положительной!");
        }
    }

    // Метод снятия денег
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Недостаточно средств или некорректная сумма!");
            return false;
        }
    }
}
