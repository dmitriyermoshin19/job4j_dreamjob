package ru.job4j.dream.store;

import ru.job4j.dream.model.City;

public class PsqlMain {
    public static void main(String[] args) {
        Store store = PsqlStore.instOf();

        System.out.println("store.findAllCity():");
        store.createCity(new City("SPB"));
        for (City c : store.findAllCity())  {
            System.out.println(c.getId() + " " + c.getNameCity());
        }
    }
}
