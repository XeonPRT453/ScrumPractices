package edu.cdu.xeon.sprint4.s304935.task2.before;

import java.util.ArrayList;
import java.util.List;

public class ArticleStorehouse {
    private List<OldArticle> oldArticles = new ArrayList<OldArticle>();

    public void addOldArticle(OldArticle oldArticle){
        oldArticles.add(oldArticle);
    }

    public OldArticle getOldArticleByIndex(int index){
        return  oldArticles.get(index);
    }

    public List<OldArticle> getOldArticles() {
        return oldArticles;
    }

    public void setOldArticles(List<OldArticle> oldArticles) {
        this.oldArticles = oldArticles;
    }
}
