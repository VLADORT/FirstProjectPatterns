package com.vlad.Task11;

import java.util.Date;

public class Recipe {

       StringBuilder state;

    public void setPreviousRecipy(Recipe previousRecipy) {
        this.previousRecipy = previousRecipy;
    }

    private  Recipe previousRecipy;



    public Recipe(String header,String endDate, String text) {
        state = new StringBuilder();
        state.append("Header: "+header+"\nEnd Date (dd/mm/YYYY): "+endDate)
                .append("\n Text:  " + text);
    }

    private Recipe(String text) {
        state = new StringBuilder(text);
    }

    public static Recipe getRecipeForProlongation(Recipe recipe) throws CloneNotSupportedException {
        return recipe.clone();
    }

    public void change(String date) {
        int beginIndex =state.indexOf("End Date (dd/mm/YYYY): ")+"End Date (dd/mm/YYYY): ".length();
        int endIndex =beginIndex+"dd/mm/YYYY".length();
        state.replace(beginIndex,endIndex,date);
    }

    public StringBuilder getState() {
        return state;
    }


    @Override
    public Recipe clone()
            throws CloneNotSupportedException {
        return new Recipe(this.state.toString());
    }

    public Recipe getPreviousRecipy() {
        return previousRecipy;
    }
}
