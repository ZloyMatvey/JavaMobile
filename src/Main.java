
public class Main {
    public static void main(String[] args) {
        int balans = 200; // Баланс клиента
        int sum = 5000; // Сумма пополнения
        int a = 100; // 100 рублей за которые начисляется 1 рубль
        if (sum <= 1000) {
            System.out.println("Ваш баланс = " + (balans + sum));
        } else {
            int b = sum / a;
            System.out.println("Поздравляю! вы получили " + b + " бонусов");
            System.out.println("Ваш баланс = " + (balans + sum + b));
        }
    }
}
