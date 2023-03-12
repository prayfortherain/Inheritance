public class Cat extends Animal{
    private String furColor;
    Cat(String furColor){
        super("рыба", "дом");
        this.furColor = furColor;
    }

    @Override
    public void makeNoise() {
        System.out.println("мур");
    }

    @Override
    public void eat() {
        System.out.println("кошка ест рыбу");
    }
}
