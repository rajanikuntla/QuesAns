package com.example.displayQuesAns.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name="questions")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Question {

	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE)
	@Column(name="id")
	private Integer id;
	
	@Column(name="question")
	private String question;
	
	@Column(name="answer")
	private String answer;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	
	
}
