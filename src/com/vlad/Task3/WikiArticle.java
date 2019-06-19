package com.vlad.Task3;

import java.util.HashMap;

public class WikiArticle implements Cloneable {
    StringBuilder state;
    HashMap<String, WikiArticle> articleHashMap = new HashMap<>();

    public WikiArticle(String header, String text) {
        int version=0;
        state = new StringBuilder();
        state.append("Version: "+version+"\nHeader: "+header)
                .append("\n Text:  " + text);
    }

    private WikiArticle(String text) {
        state = new StringBuilder(text);
    }

    public static WikiArticle getCommitInstance(WikiArticle wikiArticle) throws CloneNotSupportedException {
        return wikiArticle.clone();
    }

    public void change(String text) {
        int version = state.charAt(9);
        state.replace(9,10,String.valueOf((char)++version));
        state.append(" + " + text);
    }

    public void printSt() {
        System.out.println("\t" + state);
    }


    @Override
    public WikiArticle clone()
            throws CloneNotSupportedException {
        return new WikiArticle(this.state.toString());
    }
}
