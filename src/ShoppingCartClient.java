import java.util.Scanner;

public class ShoppingCartClient {
    public static void main(String[] args) {
        try {
            run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void run() {
        Scanner console = new Scanner(System.in);
        String input;
        String next = "";
        Cart shoppingCart = new Cart();
        do {
            System.out.print("What would you like to do" + next + "? ");
            input = console.nextLine();
            if (input.equalsIgnoreCase("add")) {
                System.out.print("Adding (\"stop\" to quit): ");
                input = console.nextLine();
                while (!input.equalsIgnoreCase("stop")) {
                    shoppingCart.add(input);
                    System.out.print("Adding (\"stop\" to quit): ");
                    input = console.nextLine();
                }
            } else if (input.equalsIgnoreCase("remove")) {
                System.out.print("Removing (\"stop\" to quit): ");
                input = console.nextLine();
                while (!input.equalsIgnoreCase("stop")) {
                    try {
                        shoppingCart.remove(input);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Cart does not contain that ingredient!");
                    }
                    System.out.print("Removing (\"stop\" to quit): ");
                    input = console.nextLine();
                }
            }
            next = " next";
        } while(!input.equalsIgnoreCase("quit"));
        System.out.println(shoppingCart);
        System.exit(1);
    }
}
