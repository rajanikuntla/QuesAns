package com.example.displayQuesAns.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import com.example.displayQuesAns.model.Question;
import com.example.displayQuesAns.services.QuestionService;

@RestController
public class QuestionController {
	@Autowired
	public QuestionService quesService;

	@RequestMapping(method = RequestMethod.GET, value = "/getQuestion")
	public Question getRandomQuestion() throws CloneNotSupportedException {
		Question ques = quesService.getRandomQuestion();
		return ques;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/addQuestion", consumes= MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String>  addQuestion(@RequestBody Question ques) {
		quesService.save(ques);
		return new ResponseEntity<String>(HttpStatus.ACCEPTED);
	}

}
