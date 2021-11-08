package com.codingdojo.events.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.events.models.Event;

public interface EventRepository extends CrudRepository<Event, Long> {

	List<Event> findByStateContains(String state);
	List<Event> findByStateNotContains(String state);
}
