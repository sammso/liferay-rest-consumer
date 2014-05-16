<%@ 
page import="org.liferay.portlet.restconsumer.service.*" %><%@ 
page import="java.util.*" %>
<%--
/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
--%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

<h1>Portlet Rest integration</h1>

<table>
	<thead>
		<tr><th>ID</th><th>Title</th><th>Body</th></tr>
	</thead>
	<tbody>


<%
	List<Note> notes = NoteLocalServiceUtil.findNotes();
	
	for (Note note : notes) {
%>
<tr><td><%=note.getId() %></td><td><%=note.getTitle() %></td><td><%=note.getBody() %></td></tr>
<% } %>
		
	</tbody>
</table>