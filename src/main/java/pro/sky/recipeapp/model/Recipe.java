package pro.sky.recipeapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@Data
@AllArgsConstructor
public class Recipe {
    private String recipeName;
    private int time;
    private ArrayList<Ingredient> ingredients;
    private ArrayList<String> instructions;
}
