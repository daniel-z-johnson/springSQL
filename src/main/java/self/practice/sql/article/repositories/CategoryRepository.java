package self.practice.sql.article.repositories;

import org.springframework.data.repository.CrudRepository;
import self.practice.sql.article.models.Category;

import java.util.UUID;

public interface CategoryRepository extends CrudRepository<Category, UUID> {
}
