package Replit_Solutions;

import java.util.*;

/*
We have a message variable already declared and assigned value in this format

Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}

Variables are already declared:

sender, phoneNumber, messageBody
- by using String methods:
retrieve related information from SMSmessage string and assign to those 3 variables.
-print each variable in separate line

Sender: Mike Smith
Phone Number: 202-123-3456
Message body: I love programing and problem solving
 */
public class R074_SMSmessage_StringMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //   Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}

        String message = "Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}";
        String sender;
        String phoneNumber;
        String messageBody;
        sender = message.substring(0, message.indexOf(">")).replace("<", " ");
        phoneNumber = "Phone Number: " + message.substring(message.indexOf("[") + 1, message.indexOf("]"));
        messageBody = "Message body: " + message.substring(message.indexOf("{") + 1, message.indexOf("}"));
        System.out.println(sender + "\n" + phoneNumber + "\n" + messageBody);
        // System.out.println(phoneNumber);
        // System.out.println(messageBody);


    }
}
