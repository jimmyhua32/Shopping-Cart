import java.util.*;

public class Cart {

    private Set<String> ingredients;

    public Cart() {
        ingredients = new HashSet<String>();
    }

    public void add(String ingredient) {
        ingredients.add(String ingredient);
    }

    public void remove(String ingredient) {
        if (!ingredients.contains(ingredient)) {
            throw new IllegalArgumentException();
        }
        ingredients.remove(ingredient);
    }

    public void checkRecipes(Map<String, Set<String>> recipes) {
        for (String s : recipes.keySet()) {
            if (ingredients.containsAll(recipes.get(s))) {
                System.out.println(s);
            }
        }
    }
}
