public class MobileOperator {
    public static void main(String[] args) {
        int account = 100;
        int toppingUp = 1100;
        int finalBonus = toppingUp > 1000? toppingUp / 100:0;
        account+=toppingUp+finalBonus;
        System.out.println("account: " + account);
        System.out.println("final bonus: " + finalBonus);
    }
}
