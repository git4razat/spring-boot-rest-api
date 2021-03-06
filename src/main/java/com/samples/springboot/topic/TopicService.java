package com.samples.springboot.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	List<Topic> topics = new ArrayList<Topic>(Arrays.asList(
			new Topic("spring", "Spring Framework", "Spring Framework Description"),
			new Topic("java", "Core Java", "Core Java Description"),
			new Topic("javascript", "Javascript", "Javascript Description"))
	);
	
	public List<Topic> getAllTopics() {
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(
				t -> t.getId().equals(id)
		).findFirst().get();
	}
	
	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(Topic topic, String id) {
		for (int i =0; i < topics.size(); i++) {
			if (id.equals(topics.get(i).getId())) {
				topics.set(i, topic);
				return;
			}
		}
	}

	public void deleteTopic(String id) {
		for (int i =0; i < topics.size(); i++) {
			if (id.equals(topics.get(i).getId())) {
				topics.remove(i);
				return;
			}
		}
	}

}
