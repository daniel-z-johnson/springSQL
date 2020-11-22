package self.practice.sql.article.services;

import self.practice.sql.article.models.User;

public interface UserService {
    User save(User u);
    Iterable<User> getAll();
}
