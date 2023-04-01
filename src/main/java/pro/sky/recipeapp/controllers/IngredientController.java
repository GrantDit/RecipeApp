package pro.sky.recipeapp.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pro.sky.recipeapp.model.Ingredient;
import pro.sky.recipeapp.service.IngredientService;

import java.util.Map;

@RestController
@RequestMapping("/ingredient")
public class IngredientController {
    private final IngredientService ingredientService;

    public IngredientController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @PostMapping
    public ResponseEntity<Ingredient> createIngredient(@RequestBody Ingredient ingredient) {
        Ingredient createdIngredient = ingredientService.addIngredient(ingredient);
        return ResponseEntity.ok(createdIngredient);
    }

    @GetMapping("/{ingredientNumber}")
    public ResponseEntity<Ingredient> getIngredient(@PathVariable long ingredientNumber) {
        Ingredient ingredient = ingredientService.getIngredient(ingredientNumber);
        if (ingredient == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(ingredient);
    }
    @GetMapping
    public ResponseEntity<Map<Long, Ingredient>> getAllIngredients() {
        Map<Long, Ingredient> ingredients = ingredientService.getAllIngredients();
        if (ingredients == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(ingredients);
    }

    @PutMapping("/{ingredientNumber}")
    public ResponseEntity<Ingredient> editIngredient(@PathVariable long ingredientNumber, @RequestBody Ingredient ingredient) {
        Ingredient ingredient1 = ingredientService.editIngredient(ingredientNumber, ingredient);
        if (ingredient1 == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(ingredient1);
    }

    @DeleteMapping("/{ingredientNumber}")
    public ResponseEntity<Void> deleteIngredientById(@PathVariable long ingredientNumber) {
        if (ingredientService.deleteIngredientById(ingredientNumber)) {
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteAllIngredients() {
        ingredientService.deleteAllIngredients();
        return ResponseEntity.ok().build();
    }
}