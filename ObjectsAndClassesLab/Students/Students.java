package ObjectsAndClassesLab;

public class Students {
    private String firstName;
    private String lastName;
    private int age;
    private String homeTown;

    public Students(String firstName,String lastName, int age, String homeTown){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.homeTown=homeTown;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public String getHomeTown(){
        return homeTown;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setHomeTown(String homeTown){
        this.homeTown=homeTown;
    }

}
