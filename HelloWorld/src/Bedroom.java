public class Bedroom {
    private String name;
    private Walll wall1;
    private Walll wall2;
    private Walll wall3;
    private Walll wall4;

    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    public Bedroom(String name, Walll wall1, Walll wall2, Walll wall3, Walll wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;

        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }
    public Lamp getLamp(){
        return this.lamp;
    }
    public void makeBed(){
        System.out.println("Bedrooms --> making bed");
        bed.make();
    }
}
