public class MobileOperator {
    public static void main(String[] args) {
        int account = 100;
        int toppingUp = 1100;
        int bonusMoney = 100;
        int bonusValue = 1;
        int finalBonus =0;
        if (toppingUp > 1000) {
            finalBonus = bonusMoney != 0 ? bonusValue * toppingUp / bonusMoney : 0;
        }
        account+=toppingUp+finalBonus;
        System.out.println("account: " + account);
        System.out.println("final bonus: " + finalBonus);
    }
}
