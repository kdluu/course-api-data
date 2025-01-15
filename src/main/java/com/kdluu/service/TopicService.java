package com.kdluu.service;

import com.kdluu.model.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("Spring", "Spring Framework", "Spring Framework Description"),
            new Topic("Java", "Java Intro", "Spring Intro Description"),
            new Topic("Javascript", "Javascript Framework", "Javascript Framework Description")
    ));

    public List<Topic> getAllTopics(){
        return topics;
    }

    public Topic getTopic(String id){
        return topics.stream().filter(topic -> topic.getId().toLowerCase().equalsIgnoreCase(id)).findFirst().orElse(null);
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(Topic newTopic){
        for (int i = 0; i < topics.size(); i++){
            Topic t = topics.get(i);
            if (t.getId().equalsIgnoreCase(newTopic.getId())){
                topics.set(i, newTopic);
                return;
            }
        }
    }

    public void deleteTopic(String id){
       topics.removeIf(t -> t.getId().equalsIgnoreCase(id));
    }
}
