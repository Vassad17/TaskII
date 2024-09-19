public class Main {
    public static void main(String[] args) {
        int account = 100;
        int amount = 2500;
        Boolean min  = amount > 999;
        int bonus = amount / 100;
        int i;
        if (min) {
            i = amount + bonus + account;}
        else {i = amount +account;}
        System.out.println("Итоговое пополнение:" + i);

    }
}
