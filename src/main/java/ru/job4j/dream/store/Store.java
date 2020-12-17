package ru.job4j.dream.store;

import ru.job4j.dream.model.Candidate;
import ru.job4j.dream.model.Photo;
import ru.job4j.dream.model.Post;
import ru.job4j.dream.model.User;

import java.util.Collection;

public interface  Store {
    Collection<Post> findAllPosts();
    Collection<Candidate> findAllCandidates();
    Collection<String> findAllNamePhoto();
    User findByEmail(String email);

    void savePost(Post post);
    void saveCandidate(Candidate candidate);

    Post findPostById(int id);
    Candidate findCandidateById(int id);
    Photo findPhotoById(int id);

    Photo createPhoto(Photo photo);
    User createUser(User user);
}
