package U1ClassCoding;

public class BackpackTester {

    public static void main(String[] args) {
        Backpack bp1 = new Backpack("Blue", 4, 2.0);
        Backpack bp2 = new Backpack("Red");
        System.out.println(bp1.getDescription());
        bp1.addItem(1.5);
        bp1.removeItem(0.7);
        System.out.println(bp2.getDescription());
        bp2.addItem(0.8);
        System.out.println("Updated: " + bp2.getDescription());
    }

}
