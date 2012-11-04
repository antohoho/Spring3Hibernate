package net.test.dao;

import java.util.Date;
import java.util.List;

import net.test.model.Article;


public interface ArticleDao {
	// To Save the article detail
	public void saveArticle ( Article Article );
	
	// To get list of all articles
	public List<Article> listArticles();
	
	public void removeArticle(Long id);
}