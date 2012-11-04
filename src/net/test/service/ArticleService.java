package net.test.service;

import java.util.List;

import net.test.model.Article;

public interface ArticleService {

	public void addArticle(Article article);

	public List<Article> listArticles();
	
	public void removeArticle(Long id);
}