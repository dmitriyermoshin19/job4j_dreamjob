package ru.job4j.dream.store;

import ru.job4j.dream.model.Candidate;
import ru.job4j.dream.model.Post;

public class PsqlMain {
    public static void main(String[] args) {
        Store store = PsqlStore.instOf();
        store.savePost(new Post(0, "Java Job"));
        store.savePost(new Post(3, "Middle"));
        System.out.println("store.findAllPosts():");
        for (Post post : store.findAllPosts()) {
            System.out.println(post.getId() + " " + post.getName());
        }
        System.out.println("store.findPostById(3).getName():");
        System.out.println(store.findPostById(3).getName());

        System.out.println("store.findAllCandidates():");
        store.saveCandidate(new Candidate(0, "I am Middle Java Developer"));
        store.saveCandidate(new Candidate(3, "Senior Java Developer"));
        for (Candidate candidate : store.findAllCandidates())  {
            System.out.println(candidate.getId() + " " + candidate.getName());
        }
        System.out.println("store.findCandidateById(3).getName():");
        System.out.println(store.findCandidateById(3).getName());
    }
}
