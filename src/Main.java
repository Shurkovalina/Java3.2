public class Main {
    public static void main(String[] args) {
        int balance = 20;
        int amount = 2947;
        int bonus = amount / 100;
        int limit = 1000;
        int finalamount;
        if (amount > limit) {
            finalamount = amount + bonus + balance;
        } else {
            finalamount = amount + balance;
        }
        System.out.println(finalamount);
    }
}

