package self.practice.sql.article.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import self.practice.sql.article.models.Category;
import self.practice.sql.article.services.CategoryService;

@Controller
public class CategoryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CategoryController.class);

    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/categories")
    public String index(Model model) {
        model.addAttribute("category", new Category());
        model.addAttribute("categories", categoryService.getAll());
        return "category/category";
    }

    @PostMapping("/categories")
    public String save(@ModelAttribute Category category, Model model) {
        LOGGER.info("Category: {}", category);
        categoryService.save(category);
        model.addAttribute("category", new Category());
        model.addAttribute("categories", categoryService.getAll());
        return "category/category";
    }
}
