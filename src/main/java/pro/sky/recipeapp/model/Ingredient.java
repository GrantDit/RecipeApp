package pro.sky.recipeapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Ingredient {
    private String ingredientName;
    private int time;
    private String unit;
}
