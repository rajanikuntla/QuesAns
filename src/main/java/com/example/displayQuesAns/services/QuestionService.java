package com.example.displayQuesAns.services;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.displayQuesAns.model.Question;
import com.example.displayQuesAns.repositories.QuestionRepo;

@Service
public class QuestionService {
	
	@Autowired
	private QuestionRepo questionRepo;
	
	
	public void save(Question ques) {
		questionRepo.save(ques);
	}
	
	public Question getRandomQuestion(){
		
		Random random = new Random();
		int numOfQues = (int) questionRepo.count();
		int id = random.nextInt(numOfQues);
		if(id <= 0 || id == numOfQues)
			id = 2;
		return questionRepo.getOne(id);
	}

}
