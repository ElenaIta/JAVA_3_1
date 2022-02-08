public class BonusMilesService {
    public int calculate(int cost) {
        int bonus = 20; // 1 миля = 20 рублей
        int miles = cost / bonus;
        return miles;
    }
}
