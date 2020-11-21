package self.practice.sql.article.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import self.practice.sql.article.models.Category;
import self.practice.sql.article.repositories.CategoryRepository;

import java.util.UUID;

@Service
public class CategoryServiceImp  implements CategoryService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CategoryServiceImp.class);

    private CategoryRepository categoryRepository;

    public CategoryServiceImp(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Iterable<Category> getAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category save(Category category) {
        category.setId(UUID.randomUUID());
        LOGGER.info("Category: {}", category);
        return categoryRepository.save(category);
    }
}
