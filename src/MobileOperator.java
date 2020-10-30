public class MobileOperator {
    public static void main(String[] args) {
        int account = 100;
        int toppingUp = 1100;
        int finalBonus =0;
        if (toppingUp > 1000) {
            finalBonus = toppingUp / 100;
        }
        account+=toppingUp+finalBonus;
        System.out.println("account: " + account);
        System.out.println("final bonus: " + finalBonus);
    }
}
