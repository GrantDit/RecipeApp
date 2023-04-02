package pro.sky.recipeapp.service;

public interface RecipeFilesService {
    boolean saveToFile(String json);

    String readFromFile();
}