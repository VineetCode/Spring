package com.userinfo.topic.app.services;

import java.util.List;

import org.springframework.security.access.annotation.Secured;

import com.userinfo.topic.app.entities.Topic;

public interface TopicService {

	@Secured(value = { "ROLE_ADMIN", "ROLE_USER" })
	public abstract Topic getTopicById(Integer id);
	
	@Secured(value = { "ROLE_ADMIN", "ROLE_USER" })
	public abstract List<Topic> getAllTopics();
	
	@Secured(value = { "ROLE_ADMIN" })
	public abstract boolean addTopic(Topic topic);
	
	@Secured(value = { "ROLE_ADMIN" })
	public abstract void updateTopic(Topic topic);
	
	@Secured(value = { "ROLE_ADMIN" })
	public abstract void deleteTopic(Integer id);
	
}
