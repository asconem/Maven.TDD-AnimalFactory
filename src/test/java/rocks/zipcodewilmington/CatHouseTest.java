package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Before
    public void takeCareOfBeforeTest() {
        CatHouse.clear();
    }

    @Test
    public void addCatTest() {
       Cat newCat = new Cat("Roy", new Date(), 5);
       CatHouse.add(newCat);

       Assert.assertEquals(newCat, CatHouse.getCatById(5));
    }

    @Test
    public void removeCatTest() {
        Cat newCat = new Cat("Roy", new Date(), 5);
        CatHouse.add(newCat);
        CatHouse.remove(newCat);

        Assert.assertEquals(null, CatHouse.getCatById(5));
    }

    @Test
    public void removeCatById() {
        Cat newCat = new Cat("Roy", new Date(), 5);
        CatHouse.add(newCat);
        CatHouse.remove(5);

        Assert.assertEquals(null, CatHouse.getCatById(5));
    }

    @Test
    public void getCatByIdTest() {
        Cat newCat = new Cat("Roy", new Date(), 5);
        CatHouse.add(newCat);
        Cat testCat = CatHouse.getCatById(5);

        Assert.assertEquals(newCat, testCat);
    }

    @Test
    public void getNumberOfCats() {
        Cat newCat = new Cat("Rob", new Date(), 7);
        CatHouse.add(newCat);
        Cat newCat2 = new Cat("Craig", new Date(), 9);
        CatHouse.add(newCat2);

        Integer expected = 2;
        Integer actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);
    }
}

