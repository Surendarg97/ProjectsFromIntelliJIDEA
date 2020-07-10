class Main1
{

    public static void main(String[] args) {

        Car car = new Car("Base car",4);
        System.out.println(car.accelerate());
        System.out.println(car.startEngine());
        System.out.println(car.brake());

        Swift swift = new Swift("Breeza",2);
        System.out.println(swift.accelerate());
        System.out.println(swift.startEngine());
        System.out.println(swift.brake());



       /* Printer printer=new Printer(50,true);
        System.out.println("Initial pages count "+printer.getPagesPrinted());
        System.out.println("Pages printed was "+ printer.printPages(4)+" new total print count for printer = "+ printer.getPagesPrinted());
        System.out.println("Pages printed was "+ printer.printPages(2)+" new total print count for printer = "+ printer.getPagesPrinted());
        Printer printer1=new Printer(50,false);
        System.out.println("Pages printed was "+ printer1.printPages(6)+" new total print count for printer = "+ printer1.getPagesPrinted());
    }*/
    }
}
class Car{

    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.engine=true;
        this.wheels=4;
        this.name = name;
        this.cylinders = cylinders;
    }

    public String startEngine(){
        return "Car-->startEngine";
    }
    public String accelerate(){
        return "Car-->accelerate";
    }
    public String brake(){
        return "Car-->brake";
    }
    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
}

class Swift extends Car{
    public Swift(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Car Swift-->startEngine";
    }

    @Override
    public String accelerate() {
        return "Car Swift-->accelerate";
    }

    @Override
    public String brake() {
        return "Car Swift-->brake";
    }
}