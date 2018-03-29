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
            System.out.println("What would you like to do" + next + "?");
            input = console.nextLine();
            if (input.equalsIgnoreCase("add")) {
                while (!input.equalsIgnoreCase("stop")) {
                    input = console.nextLine();
                    shoppingCart.add(input);
                }
            } else if (input.equalsIgnoreCase("remove")) {
                while (!input.equalsIgnoreCase("stop")) {
                    input = console.nextLine();
                    shoppingCart.remove(input);
                }
            }
            next = " next";
        } while(!input.equalsIgnoreCase("quit"));
        System.out.println(shoppingCart);
        System.exit(1);
    }
}
