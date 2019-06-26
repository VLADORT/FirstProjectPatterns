package com.vlad.Task11;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        RecipeStorage recipeStorage = new RecipeStorage();

        Recipe recipe1 = new Recipe("Recipe for Josh", "22/12/2014","BUY SOME PILLS");

        recipeStorage.add("Recipe for Josh",recipe1);

        recipeStorage.getRecipeForProlongation("Recipe for Josh","Prolonged Recipe for Josh","30/12/2014");

        recipeStorage.getRecipy("Recipe for Josh");

        recipeStorage.getRecipy("Prolonged Recipe for Josh");


    }
}
