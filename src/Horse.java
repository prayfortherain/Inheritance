public class Horse extends Animal{
    private String maneColor;
    Horse(String maneColor){
        super("сено", "конюшня");
        this.maneColor = maneColor;
    }

    @Override
    public void makeNoise() {
        System.out.println("игого");
    }

    @Override
    public void eat() {
        System.out.println("лошадка ест сено");
    }
}

