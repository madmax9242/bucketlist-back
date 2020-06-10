package com.gatherup.app.service;

import com.gatherup.app.model.Event;

import java.util.List;

public interface EventService {

	// CREATE
	public Event createEvent(Event event);

	// UPDATE
	public Event updateEvent(Event event);

	// DELETE
	public void deleteEventById(int id);

	// READ
	public List<Event> getAllEvents();

	public Event getEventById(int id);
}
