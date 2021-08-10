import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SegregateFruits {
    FruitBowl fruitBowl;
    Fruits fruit;

    @Test
    public void verifyFruitBowl() {
        fruitBowl= new FruitBowl();
        fruitBowl.addFruit( new Apple());
        fruitBowl.addFruit( new Apple());
        fruitBowl.addFruit( new Apple());
        fruitBowl.addFruit( new Banana());
        fruitBowl.addFruit( new Banana());
        fruitBowl.addFruit( new Orange());
        List<Fruits> fruitBowl1 = fruitBowl.getFruitBowl();
        for ( Fruits fruitBowl : fruitBowl1) {
            Assert.assertTrue(fruitBowl  instanceof Apple || fruitBowl instanceof Banana || fruitBowl instanceof Orange);
        }
    }
    @Test
    public void verifyCountofApples() {

        fruitBowl= new FruitBowl();
        fruitBowl.addFruit( new Apple());
        fruitBowl.addFruit( new Apple());
        fruitBowl.addFruit( new Apple());
        fruitBowl.addFruit( new Banana());
        fruitBowl.addFruit( new Banana());
        fruitBowl.addFruit( new Orange());

        Assert.assertEquals(fruitBowl.getAppleBowl().size(),3);

    }
    @Test
    public void verifyCountofBananas() {

        fruitBowl= new FruitBowl();
        fruitBowl.addFruit( new Apple());
        fruitBowl.addFruit( new Apple());
        fruitBowl.addFruit( new Apple());
        fruitBowl.addFruit( new Banana());
        fruitBowl.addFruit( new Banana());
        fruitBowl.addFruit( new Orange());

        Assert.assertEquals(fruitBowl.getBananaBowl().size(),2);

    }
    @Test
    public void verifyCountofOranges() {

        fruitBowl= new FruitBowl();
        fruitBowl.addFruit( new Apple());
        fruitBowl.addFruit( new Apple());
        fruitBowl.addFruit( new Apple());
        fruitBowl.addFruit( new Banana());
        fruitBowl.addFruit( new Banana());
        fruitBowl.addFruit( new Orange());

        Assert.assertEquals(fruitBowl.getOrangeBowl().size(),1);

    }

    @Test
    public void verifyAppleBowl(){

        fruitBowl= new FruitBowl();
        fruitBowl.addFruit( new Apple());
        fruitBowl.addFruit( new Apple());
        fruitBowl.addFruit( new Apple());
        fruitBowl.addFruit( new Banana());
        fruitBowl.addFruit( new Banana());
        fruitBowl.addFruit( new Orange());

        List<Fruits> appleBowl = fruitBowl.getAppleBowl();
        for ( Fruits fruitBowl : appleBowl) {
            Assert.assertTrue(fruitBowl  instanceof Apple);
        }
    }

    @Test
    public void verifyBananaBowl(){

        fruitBowl= new FruitBowl();
        fruitBowl.addFruit( new Apple());
        fruitBowl.addFruit( new Apple());
        fruitBowl.addFruit( new Apple());
        fruitBowl.addFruit( new Banana());
        fruitBowl.addFruit( new Banana());
        fruitBowl.addFruit( new Orange());
        List<Fruits> bananaBowl = fruitBowl.getBananaBowl();
        for ( Fruits fruitBowl : bananaBowl) {
            Assert.assertTrue(fruitBowl  instanceof Banana);
        }
    }

    @Test
    public void verifyOrangeBowl(){

        fruitBowl= new FruitBowl();
        fruitBowl.addFruit( new Apple());
        fruitBowl.addFruit( new Apple());
        fruitBowl.addFruit( new Apple());
        fruitBowl.addFruit( new Banana());
        fruitBowl.addFruit( new Banana());
        fruitBowl.addFruit( new Orange());
        List<Fruits> orangeBowl = fruitBowl.getOrangeBowl();
        for ( Fruits fruitBowl : orangeBowl) {
            Assert.assertTrue(fruitBowl  instanceof Orange);
        }
    }

}
