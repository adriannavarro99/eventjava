package com.codingdojo.events.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.events.models.Event;
import com.codingdojo.events.models.User;
import com.codingdojo.events.models.UserEvent;

public interface UserEventRepository extends CrudRepository<UserEvent, Long>{

	List<UserEvent> findByEventContains(Event event);
	UserEvent findByEventAndUser(Event event, User user);
}
