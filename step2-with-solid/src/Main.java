import edu.sharif.selab.models.Message;
import edu.sharif.selab.services.MessageFactory;
import edu.sharif.selab.services.Sender;
import edu.sharif.selab.services.SenderFactory;

import java.util.Scanner;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to SOLID Messenger!");

        while (true) {
            System.out.println("\n1. Send SMS");
            System.out.println("2. Send Email");
            System.out.println("3. Send Telegram");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();
            if (choice == 0) {
                System.out.println("Exiting...");
                break;
            }

            try {
                // Get user input
                System.out.print("Enter source: ");
                String source = scanner.next();

                System.out.print("Enter target: ");
                String target = scanner.next();

                System.out.print("Enter content: ");
                // Use nextLine() to capture the rest of the line for content
                scanner.nextLine(); // Consume the leftover newline
                String content = scanner.nextLine();

                // Use factories to create objects without depending on concrete classes
                Message message = MessageFactory.createMessage(choice, source, target, content);
                Sender sender = SenderFactory.createSender(choice);

                // Send the message
                sender.send(message);

            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}