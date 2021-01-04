package ru.job4j.dream.store;

import ru.job4j.dream.model.Post;

public class PsqlMain {
    public static void main(String[] args) {
        Store store = MemStore.instOf();
        for (Post p : store.findAllPosts())  {
            System.out.println(p.getId() + " " + p.getName());
        }
    }
}
