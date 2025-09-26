package Unit1CodingAssigments;

public class TextMessageSimulator {

    public static void main(String[] args){
        textMessage("What's shakin?");
        textMessage("What's for dinner?", "Mom");
        textMessage("I need a ride home", "Dad", true);
        textMessage("I will be home when I get home", "Mom", false);
    }

    public static void textMessage(String msg){
        System.out.println("Message: " + msg);
    }

    public static void textMessage(String msg, String recipient){
        System.out.println("Message for " + recipient +": " + msg);
    }

    public static void textMessage(String msg, String recipient, boolean isUrgent){
            if(isUrgent){
            System.out.print("URGENT ");
        }
        System.out.println("Message for " + recipient +": " + msg);
    }
}
