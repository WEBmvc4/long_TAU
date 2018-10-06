package com.mkyong.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

import com.mkyong.rntity.Student;

@Transactional
@Repository
public class PerSionDao {
	@PersistenceContext	
	private EntityManager entityManager;
	@SuppressWarnings("unchecked")
	public List<Student> getAllArticles() {
		return entityManager.createQuery("SELECT e FROM persons e").getResultList();
	}	
	public Student getArticleById(int articleId) {
		return entityManager.find(Student.class,articleId );
	}
	public void removeStudent(int idSt) {
		entityManager.remove(getArticleById(idSt));
	}
}
