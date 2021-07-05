package ObjectsAndClassesExercise.Students;

public class Students {
    String firstName;
    String lastNAme;
    double grade;

    public  Students (String firstName,String lastNAme,double grade){
        this.firstName=firstName;
        this.lastNAme=lastNAme;
        this.grade=grade;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastNAme(){
        return lastNAme;
    }
    public double getGrade(){
        return grade;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void  setLastNAme(String lastNAme){
        this.lastNAme = lastNAme;
    }
    public void  setGrade(double grade){
        this.grade=grade;
    }

    @Override
    public String toString() {
        return String.format("%s %s: %.2f", firstName,lastNAme,grade);
    }
}
