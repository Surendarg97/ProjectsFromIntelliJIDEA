public class Humburgers {
    private String breadRollType;
    private String meatType;
    private int lettuce;
    private int tomato;
    private int carrot;
    private int maonese;
    private double breadRollTypePrice;
    private double meatTypePrice;
    private double lettucePrice;
    private double tomatoPrice;
    private double carrotPrice;
    private double maonesePrice;
    private double basePrice;
    private double finalPrice;
    private String burgerName;

    public Humburgers(String breadRollType, String meatType, double basePrice,String burgerName) {
        this.breadRollType = breadRollType;
        this.meatType = meatType;
        this.basePrice = basePrice;
        this.burgerName = burgerName;
    }
}
class HealthyHumburger extends Humburgers{

    public String breadType;
    public int ketchup;
    public int souce;
    public double ketchupPrice;
    public double soucePrice;

    public HealthyHumburger(String breadRollType, String meatType, double basePrice, String burgerName) {
        super(breadRollType, meatType, basePrice, burgerName);
    }
}
class DeluxeHumburger extends Humburgers{

    public double chipsPrice;
    public double drinksPrice;


    public DeluxeHumburger(String breadRollType, String meatType, double basePrice, String burgerName) {
        super(breadRollType, meatType, basePrice, burgerName);
    }
}
