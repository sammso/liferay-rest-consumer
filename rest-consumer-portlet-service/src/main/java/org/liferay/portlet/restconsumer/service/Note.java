package org.liferay.portlet.restconsumer.service;

import com.liferay.portal.kernel.util.StringBundler;

public class Note {


	public Note() {
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
	
	@Override
    public String toString() {
        StringBundler sb = new StringBundler(6);

        sb.append("{id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", body=");
        sb.append(this.body);
        return sb.toString();
    }
	
	private long id;
	private String title;
	private String body;
}
