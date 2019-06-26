package com.vlad.Task11;

import java.util.HashMap;

public class RecipeStorage {

    HashMap<String, Recipe> recipeStorage = new HashMap<>();

    public void add(String comment, Recipe recipe) {
        recipeStorage.put(comment, recipe);
    }

    public void getHistory() {

        for (String message :
                recipeStorage.keySet()) {
            System.out.println("Comment: " + message + "\n" + recipeStorage.get(message).getState());
        }
    }


    public void getRecipeForProlongation(String comment, String yourComment, String newEndDate) throws CloneNotSupportedException {
        Recipe newCommit = recipeStorage.get(comment).clone();
        newCommit.setPreviousRecipy(recipeStorage.get(comment));
        newCommit.change(newEndDate);
        recipeStorage.put(yourComment,newCommit);

    }

    public Recipe getRecipy(String comment) {
        System.out.println(recipeStorage.get(comment).getState());
        return recipeStorage.get(comment);
    }


}
