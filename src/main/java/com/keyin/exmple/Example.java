package com.keyin.exmple;

import java.util.List;

public class Example {
    private PersonDB personDB;

    public Example() {
    }

    public Example(PersonDB personDB) {
        this.personDB = personDB;
    }

    public boolean isTrue() {
        return true;
    }

    public int incrementNumber(int number) {
        return ++number;
    }

    public Person findPersonByLastName(String searchString) {
        Person personFound = null;

        List<Person> personList = personDB.getPeople();

        for (Person p : personList) {
            if (p.getLastName().contains(searchString)) {
                personFound = p;
                break;
            }
        }

        return personFound;
    }

    public PersonDB getPersonDB() {
        return personDB;
    }

    public void setPersonDB(PersonDB personDB) {
        this.personDB = personDB;
    }
}
