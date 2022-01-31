public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.teeth = teeth;
        this.coat = coat;
        // TODO Auto-generated constructor stub
    }

    private void chew() {
        System.out.println("Duver is chewing");
    }

    @Override
    public void eat() {
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Duver is walking, Good boy duver");
        move(1);
    }

    public void run() {
        System.out.println("OMG DUVER IS ZOOMING");
        move(2);
    }

    private void moveLegs(int speed) {
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }

    
}
