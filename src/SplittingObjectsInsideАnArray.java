import java.util.ArrayList;
import java.util.List;

public class SplittingObjectsInsideАnArray {

    public static void main(String[] args) {

    }

    public static List<Fruit> splitBunches(List<Fruit> bunches) {
        List<Fruit> newList = new ArrayList<>();

        for(int i = 0; i < bunches.size(); i++) {

            if(bunches.get(i).getQuantity() != 1) {

                for(int j = 0; j <bunches.get(i).getQuantity(); j++) {

                    newList.add((new Fruit(bunches.get(i).getName(), 1)));
                }

            } else {
                newList.add(bunches.get(i));
            }
        }

        return newList;
    }

}

class Fruit {
    private String name;
    private int quantity;

    public Fruit(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return this.name;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public String toString() {
        return String.format("{name: %s, quantity: %d}", this.name, this.quantity);
    }
}
