package com.userinfo.topic.app.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userinfo.topic.app.dao.TopicDAO;
import com.userinfo.topic.app.entities.Topic;
import com.userinfo.topic.app.services.TopicService;


@Service
public class TopicServiceImpl  implements TopicService{
	
	@Autowired
	private TopicDAO topicDAO;

	@Override
	public Topic getTopicById(Integer id) {
		Topic topic= topicDAO.getTopicById(id);
	    return topic;
	}

	@Override
	public List<Topic> getAllTopics() {
		return topicDAO.getAllTopics();
	   
	}

	@Override
	public boolean addTopic(Topic topic) {
		 if (topicDAO.topicExists(topic.getTitle(), topic.getCategory())) {
	    	   return false;
	       } else {
	    	   topicDAO.addTopic(topic);
	    	   return true;
	       }
	}

	@Override
	public void updateTopic(Topic topic) {
		topicDAO.updateTopic(topic);
	}

	@Override
	public void deleteTopic(Integer id) {
		topicDAO.deleteTopic(id);
	}

}
