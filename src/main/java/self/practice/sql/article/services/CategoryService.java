package self.practice.sql.article.services;

import org.springframework.stereotype.Service;
import self.practice.sql.article.models.Category;

public interface CategoryService {

    Iterable<Category> get();
    Category save(Category category);
}
