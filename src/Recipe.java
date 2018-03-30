import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Recipe {
    private BufferedReader reader;

    public Recipe() {
        try {
            reader = new BufferedReader(new FileReader("recipe.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Recipe file is missing!");
            System.exit(2);
        }
        test();
    }

    public void test() {
        try {
            System.out.println(reader.readLine());
            System.out.println(reader.readLine());
            System.out.println(reader.readLine());
            System.out.println(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
