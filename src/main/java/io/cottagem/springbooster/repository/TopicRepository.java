package io.cottagem.springbooster.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import io.cottagem.springbooster.model.Topic;


//CrudRepository - Interface for generic CRUD operations on a repository for a specific type
public interface TopicRepository extends MongoRepository<Topic, String>{

	  
	//getAllTopics()
	//getTopic(String id)
	//updateTopic(Topic t)
	//deleteTopic(String id)
	
	
}
