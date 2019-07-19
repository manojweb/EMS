package io.cottagem.springbooster.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.cottagem.springbooster.model.Topic;
import io.cottagem.springbooster.service.TopicService;

@RestController
@Component
public class TopicController {

	@Autowired
	private TopicService topicService;

	// listing
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		try {
			return topicService.getAllTopics();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
//
//	// listing by id
//	@RequestMapping("/topics/{id}")
//	public Topic getTopic(@PathVariable String id) {
//		return topicService.getTopicById(id);
//	}
//
//	   // List<Topic> getTopicByname(String topicName);
//		@RequestMapping("/topicsname/{name}")
//		public List<Topic> getByTopicName(@PathVariable String name) {
//		
//			return topicService.getTopicByname(name);
//		}
	
	// Create
	@RequestMapping(method = RequestMethod.POST, value = "/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}

//	// Update
//	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
//	public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
//		topicService.updateTopic(id, topic);
//	}
//
//	// Delete
//	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
//	public void deleteTopic(@PathVariable String id) {
//		topicService.deleteTopic(id);
//	}

}
