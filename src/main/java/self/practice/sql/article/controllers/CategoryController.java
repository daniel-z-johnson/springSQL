package self.practice.sql.article.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoryController {

    @GetMapping("/categories")
    public String index() {
        return "category/category";
    }
}
