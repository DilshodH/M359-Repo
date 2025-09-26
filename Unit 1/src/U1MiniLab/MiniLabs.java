package U1MiniLab;

public class MiniLabs {

    public static void check(String input){
        String first = input.substring(0,1);
        String last = input.substring(input.length()-1);
        System.out.println("The first letter: "+first);
        System.out.println("The last letter: "+last);

        boolean isSame = first.equals(last);
        System.outprintln(first + " equals " + last + " is" + isSame);

    }
}
