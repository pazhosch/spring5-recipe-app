package guru.springframework.controllers;

import guru.springframework.domain.Category;
import guru.springframework.domain.UnitOfMeasure;
import guru.springframework.repositories.CategoryRepository;
import guru.springframework.repositories.RecipeRepository;
import guru.springframework.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;
    private RecipeRepository recipeRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository, RecipeRepository recipeRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
        this.recipeRepository = recipeRepository;
    }

    @RequestMapping({"","/","index"})
    public String getIndexPage(Model model) {
        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasuerOptional = unitOfMeasureRepository.findByDescription("Teaspoon");
        System.out.println("Cat: "+(categoryOptional.isPresent() ? categoryOptional.get().getId() : "null"));
        System.out.println("Unit: "+(unitOfMeasuerOptional.isPresent() ? unitOfMeasuerOptional.get().getId() : "null"));

        model.addAttribute("recipes",recipeRepository.findAll());
        return "index";
    }

    @RequestMapping("/recipe/show/*")
    public String getRecipe(Model model) {
        model.addAttribute("recipe",recipeRepository.findById(1L).get());
        return "recipe";
    }
}
