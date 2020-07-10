public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public boolean isTeen(){
     if(getAge()>12 && getAge()<20 ) {
         return true;
     }else
         return false;
    }

    public String getFullName(){
        if(firstName.isEmpty() && lastName.isEmpty()){
            return "";
        }else if (lastName.isEmpty()){
            return firstName;
        }else if (firstName.isEmpty()){
            return lastName;
        }else
            return firstName+" "+lastName;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0 || age>100)
            this.age=0;
        else
            this.age = age;
    }
}
