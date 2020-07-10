public class Main {

    public static void main(String[] args) {

        Walll wall1 = new Walll("East");
        Walll wall2 = new Walll("West");
        Walll wall3 = new Walll("North");
        Walll wall4 = new Walll("South");

        Ceiling ceiling = new Ceiling(12,55);

        Bed bed = new Bed("Modern",4,3,2,1);

        Lamp lamp = new Lamp("Twinbulp",true,5);

        Bedroom bedroom = new Bedroom("Surendars bedroom",wall1,wall2,wall3,wall4,ceiling,bed,lamp);

        bedroom.makeBed();

        bedroom.getLamp().turnOn();






       /* Wall wall = new Wall(1.125,-1.00);
        System.out.println("width= "+wall.getWidth());
        System.out.println("height= "+wall.getHeight());

        System.out.println("area= "+wall.getArea());

        wall.setHeight(5);
        System.out.println("width= "+wall.getWidth());
        System.out.println("height= "+wall.getHeight());
        System.out.println("area= "+wall.getArea());*/

    /*  Age and Fullname program
        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("fullName= "+person.getFullName());
        System.out.println("teen= "+person.isTeen());
        person.setFirstName("John");
        person.setAge(18);
        System.out.println("fullName= "+person.getFullName());
        System.out.println("teen= "+person.isTeen());
        person.setLastName("Smith");
        System.out.println("fullName= "+person.getFullName());
*/

     /*   SimpleCalculator class program

        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= "+calculator.getAdditionResult());
        System.out.println("subtract= "+calculator.getSubtractionResult());
        calculator.setSecondNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= "+calculator.getMultiplicationResult());
        System.out.println("divide= "+calculator.getDivisionResult());
*/













     /*   ConstructorLearning vipPerson1 = new ConstructorLearning();
        System.out.println(vipPerson1.getCustomerName());

        ConstructorLearning vipPerson2 = new ConstructorLearning("Name check for 2 parameter",125.025);
        System.out.println(vipPerson2.getCustomerName());

        ConstructorLearning vipPerson3 = new ConstructorLearning("Name check for 3 parameter",1543.26,"mailing@gmail.com");
        System.out.println(vipPerson3.getCustomerName());*/

    }
}