package ObjectsAndClassesExercise.VehicleCatalogue;

public class VehicleCatalogue {
    String typeOfVehicle;
    String model;
    String color;
    int horsepower;

    public VehicleCatalogue(String typeOfVehicle,String model,String color,int horsepower){
        this.typeOfVehicle=typeOfVehicle;
        this.model=model;
        this.color=color;
        this.horsepower=horsepower;
    }

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }
    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
    public int getHorsepower(){
        return  horsepower;
    }

    public void setTypeOfVehicle(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }
    public void setModel(String model){
        this.model=model;
    }
    public void  setColor(String color){
        this.color=color;
    }
    public void setHorsepower(int horsepower){
        this.horsepower=horsepower;
    }
    @Override
    public String toString(){
        return String.format("Type: %s\n" + "Model: %s\n" + "Color: %s\n" +
                "Horsepower: %d" , getTypeOfVehicle().toUpperCase().charAt(0)
        + this.getTypeOfVehicle().substring(1), getModel(), getColor(), getHorsepower());
    }
}
