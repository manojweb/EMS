package io.cottagem.springbooster.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.cottagem.springbooster.model.Topic;
import io.cottagem.springbooster.repository.TopicRepository;


@Service
public class TopicService {

@Autowired
private TopicRepository topicRepository;
	
	
//Listing	
	public List <Topic> getAllTopics(){
	 List<Topic> topics = new ArrayList<>();
	 
	 topicRepository.findAll().forEach(topics::add);
	 return topics;
	}
	
//	public Topic getTopicById(String id){
//		return topicRepository.findOne(id);
//		
//	}
	
	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}

//	public void updateTopic(String id, Topic topic) {
//		topicRepository.save(topic);
//			
//	}
//
//	public void deleteTopic(String id) {
//		topicRepository.delete(id);
//	}
//
//	
//	public List<Topic> getTopicByname(String name) {
//		return topicRepository.getTopicByname(name);
//		
//	}

}
