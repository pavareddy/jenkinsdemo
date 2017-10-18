package io.del.springboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
		
		return  Arrays.asList(
				new Topic("1","A"),
				new Topic("2","B"),
				new Topic("3","C")
				);
	}
}
