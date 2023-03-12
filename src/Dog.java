public class Dog extends Animal{
    private String breed;
    Dog(String breed){
        super("мясо", "улица");
        this.breed = breed;
    }

    @Override
    public void makeNoise() {
        System.out.println("гав");
    }

    @Override
    public void eat() {
        System.out.println("собака ест мясо");
    }
}
