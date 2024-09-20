public class Main {
    public static void main(String[] args) {
        int account = 100;
        int amount = 2500;
        Boolean min = amount > 999;
        int bonus = amount / 100;
        int sumAmount;
        if (min) {
            sumAmount = amount + bonus + account;
        } else {
            sumAmount = amount + account;
        }
        System.out.println("Итоговое пополнение:" + sumAmount);

    }
}
