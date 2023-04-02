package pro.sky.recipeapp.service;

public interface IngredientFilesService {
    boolean saveToFile(String json);

    String readFromFile();
}