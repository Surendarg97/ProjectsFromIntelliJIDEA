public class ConstructorLearning {


    private String customerName;
    private double creditLimit;
    private String customerEmailAddress;

    public ConstructorLearning(){
        this("Default name",100.00,"Default email address");
    }

    public ConstructorLearning(String customerName, double creditLimit) {
        this.customerName = customerName;
        this.creditLimit = creditLimit;
    }

    public ConstructorLearning(String customerName, double creditLimit, String customerEmailAddress) {
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }
}
