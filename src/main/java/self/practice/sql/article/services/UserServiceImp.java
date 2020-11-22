package self.practice.sql.article.services;

import self.practice.sql.article.models.User;
import self.practice.sql.article.repositories.UserRepository;

public class UserServiceImp implements UserService {

    private UserRepository userRepository;

    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(User u) {
        return null;
    }

    @Override
    public Iterable<User> getAll() {
        return userRepository.findAll();
    }
}
