package org.liferay.portlet.restconsumer.service.impl;

import org.liferay.portlet.restconsumer.service.Note;

public class NoteImpl implements Note {

	public NoteImpl() {
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}

	private long id;
	private String title;
	private String body;
}
