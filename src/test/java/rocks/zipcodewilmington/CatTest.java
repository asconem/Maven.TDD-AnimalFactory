package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest() {
        Cat newCat = new Cat("Zula", null, null);
        String givenName = "Zula";

        newCat.setName(givenName);

        String catName = newCat.getName();
        Assert.assertEquals(catName, givenName);
    }

    @Test
    public void speakTest() {
        Cat newCat = new Cat(null, null, null);

        String expected = "meow!";
        String actual = newCat.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setBirthDateTest() {
        Cat newCat = new Cat(null, null, null);

        Date birthDate = new Date();
        newCat.setBirthDate(birthDate);

        Date expected = birthDate;
        Date actual = newCat.getBirthDate();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void eatTest() {
        Cat newCat = new Cat(null, null, null);
        Food banana = new Food();

        newCat.eat(banana);

        Integer expected = 1;
        Integer actual = newCat.getNumberOfMealsEaten();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getIdTest() {
        Cat newCat = new Cat(null, null, 52);

        Integer expected = 52;
        Integer actual = newCat.getId();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkAnimalInheritanceTest() {
        Cat newCat = new Cat(null, null, null);

        Assert.assertTrue(newCat instanceof Animal);
    }

    @Test
    public void checkMammalInheritanceTest() {
        Cat newCat = new Cat(null, null, null);

        Assert.assertTrue(newCat instanceof Mammal);
    }
}
