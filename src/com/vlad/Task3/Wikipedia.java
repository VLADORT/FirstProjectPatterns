package com.vlad.Task3;

import java.util.HashMap;

public class Wikipedia {

    HashMap<String, WikiArticle> articleHashMap = new HashMap<>();

    public void add(String commitMessage, WikiArticle wikiArticle) {
        articleHashMap.put(commitMessage, wikiArticle);
    }

    public void getLog() {

        for (String message :
                articleHashMap.keySet()) {
            System.out.println("Commit message: " + message + "\n" + articleHashMap.get(message).getState());
        }
    }


    public void getArticleForChange(String commitMessage, String yourCommitMessage, String text) throws CloneNotSupportedException {
        WikiArticle newCommit = articleHashMap.get(commitMessage).clone();
        newCommit.change(text);
        articleHashMap.put(yourCommitMessage,newCommit);

    }

    public void getArticle(String commitMessage) {
        System.out.println(articleHashMap.get(commitMessage).getState());
    }


}
