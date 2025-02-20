public class MethodDemo {
    // Method to greet the user
    public static void greet() {
        System.out.println("Hello from the greet method!");
    }

    // Method to print a custom message
    public static void printMessage(String message) {
        System.out.println(message);
    }

    // Main method: Entry point of the program
    public static void main(String[] args) {
        greet(); // Calling the greet method
        printMessage("This is my message!"); // Calling the printMessage method with a custom message
    }
}
