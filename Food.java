import java.util.Arrays;
import java.util.Random;

public class Food implements Comparable<Food> { // Interfaces AND Generics, OMG!


    // Do not remove something from this array, but you may add to it...
    private static final String[] TYPES = {"Apple", "Pear", "Cookie", "Grape"};
    String type;
    int calories;

    public Food(String type, int calories) {
        // TODO: only allow objects of types that are listed in TYPES

        for (int i = 0; i < TYPES.length; i++) {
            if (TYPES[i].equals(type)) {
                this.type = type;
                this.calories = calories;
                break;
            }
        }
    }

    public String toString() {
        // TODO: return a String with the attributes
        return "Type of food" + " " + type + ": " + "Calorie Count" + " " + calories;

    }

    public int compareTo(Food o) {
        // TODO: make the food comparable
        int foodscore = o.getType().length() * o.getCalories();
        int currentscore = this.getType().length() * this.getCalories();
        int scoredifference = currentscore - foodscore;
        return scoredifference;
    }

    public String getType() {
        // TODO: return type
        //String type;
        return type;
    }

    public int getCalories() {
        // TODO: return property
        //int calories;
        return calories;
    }

    public static Food[] createSortedRandomList(int n) {
        // TODO: create a list with n random instances and sort them
        Food[] foodlist = new Food[n];
        Random randomobj = new Random();
        String randomfoodnum = TYPES[randomobj.nextInt(TYPES.length)];
        int randomcalnum = randomobj.nextInt((350 - 250 + 1) + 250);
        for (int j = 0; j < n; j++) {
            foodlist[j] = new Food(randomfoodnum, randomcalnum);
        }
        Arrays.sort(foodlist);
        return foodlist;

    }

    public static void main(String[] args) {
        // TODO: your test cases
        Food[] foodvar = createSortedRandomList(8);
        for (int k = 0; k < foodvar.length; k++) {
            System.out.println(foodvar[k]);
        }
    }

}
