import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FruitBowl {
    public List<Fruits> fruitBowl;

    public FruitBowl() {
        fruitBowl = new ArrayList<Fruits>();
    }

    public void addFruit(Fruits fruit) {
        fruitBowl.add(fruit);
    }

    public List<Fruits> getFruitBowl() {
        return fruitBowl;
    }


    public List<Fruits> getAppleBowl(){
        List<Fruits> appleBowl = new ArrayList<Fruits>();
        for ( Fruits data : fruitBowl) {
            if (data  instanceof Apple) {
                appleBowl.add(data);
            }
        }
        return appleBowl;
    }

    public List<Fruits> getBananaBowl(){
        List<Fruits> bananaBowl = new ArrayList<Fruits>();
        for ( Fruits  data: fruitBowl) {
            if (data  instanceof Banana) {
                bananaBowl.add(data);
            }
        }
        return bananaBowl;
    }

    public List<Fruits> getOrangeBowl(){
        List<Fruits> orangeBowl = new ArrayList<Fruits>();
        for ( Fruits data : fruitBowl) {
            if (data  instanceof Orange) {
                orangeBowl.add(data);
            }
        }
        return orangeBowl;
    }


}
