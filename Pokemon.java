import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

// --------------------------------------------------------------- //
public class Pokemon {
    //private static Object Pokemon;
    //private static Object Pokemon;
    String name;
    int index;
    float height;
    float weight;
    String category;
    int health;
    int attack;


    // TODO: implement Pokemon class with getters/setters
    public Pokemon(String name, int index, float height, float weight, String category, int health, int attack) {
        this.name = name;
        this.index = index;
        this.height = height;
        this.weight = weight;
        this.category = category;
        this.health = health;
        this.attack = attack;
    }

    public Pokemon() {

    }

    /**
     * public Pokemon(String name1, int index1, float height1, float weight1, String category1, int health1, int attack1)  {
     * }
     **/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    // ------------------------------------------------------------- //


    // TODO: implement more comparator classes
    static final class NameComparator implements Comparator<Pokemon> {
        // TODO: insert code here
        public int compare(Pokemon a, Pokemon b) {
            return a.getName().compareTo(b.getName());
        }
    }

    static final class IndexComparator implements Comparator<Pokemon> {
        public int compare(Pokemon a, Pokemon b) {
            return a.getIndex() - b.getIndex();
        }
    }

    static final class HeightComparator implements Comparator<Pokemon> {
        public int compare(Pokemon a, Pokemon b) {
            return Float.compare(a.getHeight(), b.getHeight());
        }
    }

    static final class WeightComparator implements Comparator<Pokemon> {
        public int compare(Pokemon a, Pokemon b) {
            return (int) (a.getWeight() - b.getWeight());
        }
    }

    static final class CategoryComparator implements Comparator<Pokemon> {
        // TODO: insert code here
        public int compare(Pokemon a, Pokemon b) {
            return a.getCategory().compareTo(b.getCategory());
        }
    }

    static final class HealthComparator implements Comparator<Pokemon> {
        public int compare(Pokemon a, Pokemon b) {
            return a.getHealth() - b.getHealth();
        }
    }

    static final class AttackComparator implements Comparator<Pokemon> {
        public int compare(Pokemon a, Pokemon b) {
            return a.getAttack() - b.getAttack();
        }
    }

    static final class FirstNameThenHealth implements Comparator<Pokemon> {
        public int compare(Pokemon a, Pokemon b) {

            int comparator = a.getName().compareTo(b.getName());
            if (comparator == 0) {
                comparator = a.getHealth() - b.getHealth();
            }
            return comparator;
        }
    }


    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", index=" + index +
                ", height=" + height +
                ", weight=" + weight +
                ", category='" + category + '\'' +
                ", health=" + health +
                ", attack=" + attack +
                '}';
    }

    public static void main(String[] args) {
        // TODO: create a Pokemon list and test your code
        ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
        /**Arrays[] p = new Arrays[4];

         p[0]= new Array(new Pokemon("Preetam",5,4.6,23,"sdf",6,7));
         p[1]= new Array(new Pokemon("abc",15,4.64,234,"sdsaf",61,7));
         p[2]= new Array(new Pokemon("acd",54,14.6,213,"sfdf",63,47));
         Arrays.sort(p,new FirstNamethenHealth());**/

        pokemons.add(new Pokemon("Jeffy", 5, (float) 5.8, 78, "sdf", 6, 7));
        pokemons.add(new Pokemon("dfuheif", 8, (float) 9.8, 78, "ejdjsd", 9, 97));
        pokemons.add(new Pokemon("ddvnjd", 7, (float) 0.8, 178, "ejdjsd", 19, 917));


        Collections.sort(pokemons, new FirstNameThenHealth());
        for (int i = 0; i < pokemons.size(); i++) {
            System.out.println(pokemons.get(i));
        }
    }
}