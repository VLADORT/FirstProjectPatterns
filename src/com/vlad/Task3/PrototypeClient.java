package com.vlad.Task3;


import java.util.HashMap;
import java.util.Scanner;

public class PrototypeClient {
    public static void main(String[] args)
            throws CloneNotSupportedException {

        Wikipedia wikipedia = new Wikipedia();



        WikiArticle aboutAnimals = new WikiArticle("About Animals", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");

        WikiArticle aboutCars = new WikiArticle("Car History", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut la");



        wikipedia.add("Article About Animals",aboutAnimals);
        wikipedia.add("Article About Cars",aboutCars);

        wikipedia.getLog();


        wikipedia.getArticleForChange("Article About Animals","add new text","kjdf hjkdsh fsdjf hkjsdfh kjdsf hksdjfh kdjfhs kjd");

        wikipedia.getLog();

        wikipedia.getArticleForChange("add new text","add some new addition text","kjdf hjsad asd jasd asjd kasjd ks djad kdsh fsdjf hkjsdfh kjdsf hksdjfh kdjfhs kjd");

        wikipedia.getArticle("add some new addition text");

        System.out.println("=================================");

        wikipedia.getLog();

    }

}
