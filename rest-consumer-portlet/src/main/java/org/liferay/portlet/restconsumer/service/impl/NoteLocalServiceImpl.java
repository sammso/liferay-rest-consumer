package org.liferay.portlet.restconsumer.service.impl;

import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.liferay.portlet.restconsumer.service.Note;
import org.liferay.portlet.restconsumer.service.base.NoteLocalServiceBaseImpl;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.liferay.portal.kernel.util.PropsUtil;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

/**
 * The implementation of the note local service.
 * 
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link org.liferay.portlet.restconsumer.service.NoteLocalService} interface.
 * 
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 * 
 * @author Brian Wing Shun Chan
 * @see org.liferay.portlet.restconsumer.service.base.NoteLocalServiceBaseImpl
 * @see org.liferay.portlet.restconsumer.service.NoteLocalServiceUtil
 */
public class NoteLocalServiceImpl extends NoteLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * org.liferay.portlet.restconsumer.service.NoteLocalServiceUtil} to access
	 * the note local service.
	 */
	public List<Note> findNotes() {
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource service = client.resource(getBaseURI());
		// Fluent interfaces

		String json = service.path("webresources").path("myresource")
				.accept(MediaType.APPLICATION_JSON).get(String.class);

		Gson gson = new Gson();

		Type noteListType = new TypeToken<List<NoteImpl>>() {
		}.getType();

		return gson.fromJson(json, noteListType);
	}

	private static URI getBaseURI() {
		String uri = PropsUtil.get("rest-consumer-portlet.target");
		
		return UriBuilder.fromUri(uri)
				.build();
	}
}
