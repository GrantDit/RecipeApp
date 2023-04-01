package pro.sky.recipeapp.service;

import pro.sky.recipeapp.model.Ingredient;

public interface IngredientService {
    Ingredient addIngredient(Ingredient ingredient);

    Ingredient getIngredient(long ingredientNumber);
}