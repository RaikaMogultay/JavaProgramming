package aaPractice;

public class StringFormat {

    public static void main(String[] args) {

        String name = "James Bond";
        String phoneNumber = "202-123-3456";
        String message = "I love programming and problem solving";

        System.out.println("Sender: " + name + "\n" + "Number: " + phoneNumber + "\n" + "Message: " + message);
    }
}

/*Given a String in the following format:
“Sender: <James Bond>. From Number: [202-123-3456]. +
Message: {“I love programming and problem solving}”
Separate these parts and print them separately:
Sender: "James Bond”
Number: "202-123-3456"
Message: "I love programming and problem solving"

 */
