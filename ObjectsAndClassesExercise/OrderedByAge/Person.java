package ObjectsAndClassesExercise.OrderedByName;

public class Person {
    String name;
    String ID;
    int age;

    public Person(String name,String ID,int age){
        this.name=name;
        this.ID=ID;
        this.age=age;
    }

    public String getName() {
        return name;
    }
    public String getID(){
        return ID;
    }
    public int getAge(){
        return  age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setID(String ID){
        this.ID=ID;
    }
    public void setAge(int age){
        this.age=age;
    }

    @Override
    public String toString() {
        return name + " with ID: " + ID + " is " + age +
                " years old.";
    }
}
