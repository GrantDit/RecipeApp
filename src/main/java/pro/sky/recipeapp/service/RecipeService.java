package pro.sky.recipeapp.service;

import pro.sky.recipeapp.model.Recipe;

public interface RecipeService {
    Recipe addRecipe(Recipe recipe);

    Recipe getRecipe(long recipeNumber);
}