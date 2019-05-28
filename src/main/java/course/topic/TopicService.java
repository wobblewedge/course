package course.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			//new Topic(id,name,category,descrip)
			new Topic("01", "Huitlacoche", "Mexican", "Huitlacoche is a fungus that grows on corn"),
			new Topic("02","Kombu, Kelp, Dashi, and Tea","Asian","Edible kelp used widely in Asian cuisine."),
			new Topic("03","Masa","Mexican", "How tortillas come to be.")
						));
					
	
	public Topic getTopic(String name) {
		return topics.stream().filter(topic -> 
		topic.getName().contentEquals(name)).findFirst().get();
	}
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public void addTopic(Topic topic) {
		topics.add(topic);
	}
	
	public void updateTopic(String name, Topic topic) {
		for(int i=0; i<topics.size(); i++) {
			Topic t = topics.get(i);
			if(t.getName().equals(name)) {
				topics.set(i, topic);
				return;
			}
		}
	}
	
	public void deleteTopic(String name) {
		topics.removeIf(topic->topic.getName().equals(name));
	}
}
