package com.keyin.exmple;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class ExampleTest {
    @Mock
    private PersonDB personDB;

    @Test
    public void testIsTrue() {
        Example exampleUnderTest = new Example();

        Assertions.assertTrue(exampleUnderTest.isTrue());
    }

    @Test
    public void testIncrement() {
        Example exampleUnderTest = new Example();

        Assertions.assertEquals(2, exampleUnderTest.incrementNumber(1));
        Assertions.assertNotEquals(3, exampleUnderTest.incrementNumber(1));
    }

    @Test
    public void testFindPersonByLastName() {
        List<Person> personList = new ArrayList<Person>();

        Person personToFind = new Person();
        personToFind.setFirstName("Jamie");
        personToFind.setLastName("Cornick");
        personList.add(personToFind);

        // fixed it!!
        Mockito.when(personDB.getPeople()).thenReturn(personList);

        Example exmapleUnderTest = new Example();
        exmapleUnderTest.setPersonDB(personDB);

        Assertions.assertNotNull(exmapleUnderTest.findPersonByLastName("C"));
    }

    @Test
    public void testInstanceCreation() {
        Example example1 = Example.getNewExample("Jamie");

        Example example2 = Example.getNewExample("Brad");

        Assertions.assertNotEquals(example1.getName(), example2.getName());
    }

}
