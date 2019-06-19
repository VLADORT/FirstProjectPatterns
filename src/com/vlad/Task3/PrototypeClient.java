package com.vlad.Task3;


import java.util.HashMap;
import java.util.Scanner;

public class PrototypeClient {
    public static void main(String[] args)
            throws CloneNotSupportedException {



        WikiArticle aboutAnimals = new WikiArticle("About Animals", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");

        WikiArticle aboutCars = new WikiArticle("Car History", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut la");
        WikiArticle animalsCommit1 = WikiArticle.getCommitInstance(aboutAnimals);
        animalsCommit1.change("ahjjsdfjkdfkf n j  fkjn dkdjdfnjdf nkjsd nkj nkj nfkjn kfj");
        System.out.println("aboutAnimals version: ");
        aboutAnimals.printSt();
        System.out.println("aboutCars version: ");
        aboutCars.printSt();
        System.out.println("animalsCommit1 version: ");
        animalsCommit1.printSt();

        System.out.println("Choose version :");
        Scanner scanner = new Scanner(System.in);
        String version = scanner.nextLine();
        switch (version) {
            case "aboutAnimals": {

                System.out.println("Input addition text: ");
                WikiArticle userEdit = WikiArticle.getCommitInstance(aboutAnimals);
                userEdit.change(scanner.nextLine());
                userEdit.printSt();
                break;
            }case "animalsCommit1": {

                System.out.println("Input addition text: ");
                WikiArticle userEdit = WikiArticle.getCommitInstance(animalsCommit1);
                userEdit.change(scanner.nextLine());
                userEdit.printSt();
                break;
            }case "aboutCars": {

                System.out.println("Input addition text: ");
                WikiArticle userEdit = WikiArticle.getCommitInstance(aboutCars);
                userEdit.change(scanner.nextLine());
                userEdit.printSt();
                break;
            }
        }
    }

}
