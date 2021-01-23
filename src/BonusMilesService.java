public class BonusMilesService {
    public int calculate (int cost){
        int bonusmiles = 1;
        int rubles = 20;
        int totalbonus = cost * bonusmiles / rubles;

        return totalbonus;
        }
}
