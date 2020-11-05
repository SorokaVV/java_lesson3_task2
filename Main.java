public class Main {
    public static void main(String[] args) {
        int balance = 10000;
        int deposite = 110000;
        int bonus = 0;
        if (deposite >= 100000) {
            bonus = (int) (deposite / 100);
        }
        balance = (balance + deposite + bonus) / 100;

        if (bonus > 0) {
            System.out.println("Пополнение - " + deposite / 100 + " рублей, бонус - " + bonus / 100 + " рублей, доступный остаток - " + balance  + " рублей");
        } else {
            System.out.println("Пополнение - " + deposite / 100 + " рублей, доступный остаток - " + balance + " рублей");
        }
    }
}