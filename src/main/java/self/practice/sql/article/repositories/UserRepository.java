package self.practice.sql.article.repositories;

import org.springframework.data.repository.CrudRepository;
import self.practice.sql.article.models.User;

import java.util.UUID;

public interface UserRepository extends CrudRepository<User, UUID> {
}
