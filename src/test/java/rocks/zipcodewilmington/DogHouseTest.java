package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Before
    public void takeCareOfBeforeTest() {
        DogHouse.clear();
    }

    @Test
    public void addDogTest() {
        Dog newDog = new Dog("Roy", new Date(), 5);
        DogHouse.add(newDog);

        Assert.assertEquals(newDog, DogHouse.getDogById(5));
    }

    @Test
    public void removeDogTest() {
        Dog newDog = new Dog("Roy", new Date(), 5);
        DogHouse.add(newDog);
        DogHouse.remove(newDog);

        Assert.assertNotEquals(newDog, DogHouse.getDogById(5));
    }

    @Test
    public void removeDogById() {
        Dog newDog = new Dog("Roy", new Date(), 5);
        DogHouse.add(newDog);
        DogHouse.remove(5);

        Assert.assertNotEquals(newDog, DogHouse.getDogById(5));
    }

    @Test
    public void getDogByIdTest() {
        Dog newDog = new Dog("Roy", new Date(), 5);
        DogHouse.add(newDog);
        Dog testDog = DogHouse.getDogById(5);

        Assert.assertEquals(newDog, testDog);
    }

    @Test
    public void getNumberOfDogs() {
        Dog newDog = new Dog("Rob", new Date(), 7);
        DogHouse.add(newDog);
        Dog newDog2 = new Dog("Craig", new Date(), 9);
        DogHouse.add(newDog2);

        Integer expected = 2;
        Integer actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
