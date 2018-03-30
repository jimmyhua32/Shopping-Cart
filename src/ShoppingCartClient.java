import java.util.Scanner;

public class ShoppingCartClient {
    public static void main(String[] args) {
        try {
            run();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Oops, something went wrong!");
            System.exit(2);
        }
        System.exit(1);
    }

    public static void run() {
        Scanner console = new Scanner(System.in);
        String input;
        String next = "";
        Cart shoppingCart = new Cart();
        showHelp();
        System.out.println();
        do {
            System.out.print("What would you like to do" + next + "? ");
            input = console.nextLine().toLowerCase();
            switch (input) {
                case "add":
                    add(console, shoppingCart);
                    System.out.println(shoppingCart);
                    break;
                case "remove":
                    remove(console, shoppingCart);
                    System.out.println(shoppingCart);
                    break;
                case "quit":
                case "view":
                    System.out.println(shoppingCart);
                    break;
                default:
                    System.out.println("Command not recognized.");
                    System.out.println();
                    showHelp();
            }
            System.out.println();
            next = " next";
        } while(!input.equals("quit"));
    }

    public static void add(Scanner console, Cart shoppingCart) {
        System.out.print("Adding ingredients: ");
        Scanner lineScan = new Scanner(console.nextLine());
        while (lineScan.hasNext()) {
            shoppingCart.add(lineScan.next());
        }
    }

    public static void remove(Scanner console, Cart shoppingCart) {
        System.out.print("Removing ingredient: ");
        String remove = console.nextLine();
        try {
            shoppingCart.remove(remove);
        } catch (IllegalArgumentException e) {
            System.out.println("No such ingredient exists!");
        }
    }

    public static void showHelp() {
        System.out.println("Command List:");
        System.out.println("add    -   Add ingredients. Enter ingredients separated by spaces.");
        System.out.println("remove -   Remove an ingredient.");
        System.out.println("view   -   View the current contents of the shopping cart.");
    }
}
