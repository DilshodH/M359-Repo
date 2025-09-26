package U1MiniLab;
import java.util.Scanner;
public class DiceRoll {
    public static void main(String[] args) {
        roll d1 = new roll(sides);
        roll d2 = new roll(sides);
        d1.rolls();
        d2.rolls();
        int result = d1 + d2;
        System.outprintln("The sum of " + d1 + d2 + "is " + result);
    }

    public static class roll{
        private int sides;

        public roll(int sides){
            this.sides = sides;
        }
    }
}
