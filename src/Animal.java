public class Animal {
    private String food, location;
    Animal(String food, String location){
        this.food = food;
        this.location = location;
    }
    public void makeNoise(){    }
    public void eat(){    }
    public void sleep(){
        System.out.println("спит.");
    }

    public String getFood() {
        return food;
    }
    public String getLocation() {
        return location;
    }
}
