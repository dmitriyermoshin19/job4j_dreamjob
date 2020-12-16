package ru.job4j.dream.store;

import ru.job4j.dream.model.Candidate;
import ru.job4j.dream.model.Post;

public class PsqlMain {
    public static void main(String[] args) {
        Store store = PsqlStore.instOf();
        for(int i = 0; i < 1000000; i++) {
            System.out.println(i);
        }

        System.out.println("store.findAllCandidates():");
        store.saveCandidate(new Candidate(0, "I am Middle Java Developer", 1));
        store.saveCandidate(new Candidate(1, "Senior Java Developer", 2));
        for (Candidate candidate : store.findAllCandidates())  {
            System.out.println(candidate.getId() + " " + candidate.getName());
        }
       // System.out.println("store.findCandidateById(3).getName():");
      //  System.out.println(store.findCandidateById(3).getName());
    }
}
