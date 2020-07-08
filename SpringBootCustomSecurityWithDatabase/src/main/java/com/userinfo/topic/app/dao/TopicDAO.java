package com.userinfo.topic.app.dao;

import java.util.List;

import com.userinfo.topic.app.entities.Topic;

public interface TopicDAO {
	
	public abstract Topic getTopicById(Integer id);
	public abstract List<Topic> getAllTopics();
	public abstract void addTopic(Topic topic);		
	public abstract void updateTopic(Topic topic);
	public abstract void deleteTopic(Integer id);
	public abstract boolean topicExists(String title, String category);

}
