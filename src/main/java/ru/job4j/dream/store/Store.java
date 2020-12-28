package ru.job4j.dream.store;

import ru.job4j.dream.model.*;

import java.util.Collection;

public interface  Store {
    Collection<Post> findAllPosts();
    Collection<Candidate> findAllCandidates();
    Collection<String> findAllNamePhoto();
    Collection<City> findAllCity();
    User findByEmail(String email);

    void savePost(Post post);
    void saveCandidate(Candidate candidate);

    Post findPostById(int id);
    Candidate findCandidateById(int id);
    Photo findPhotoById(int id);

    Photo createPhoto(Photo photo);
    User createUser(User user);
    City createCity(City city);
}
