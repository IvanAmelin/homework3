public class BonusMilesService {
    public int calculate(int cost) {
        int bonmiles = 20;
        int bonus = cost / bonmiles;
        return bonus;
    }
}
