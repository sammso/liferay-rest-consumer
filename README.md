# liferay-rest-consumer

This example liferay application is consuming REST service from https://github.com/sammso/simple-jersey (so you need that project too).

Configure address of this REST service to your portal-ext.properties.

``` properties
rest-consumer-portlet.target=http://localhost:8080/simple-jersey
```

It is example how to use ServiceBuilder to consume REST services.

You can also use create Service from web content template to fetch web-content:

``` velocity
#set ($noteService = $utilLocator.findUtil("rest-consumer-portlet","org.liferay.portlet.restconsumer.service.NoteLocalService"))

#set ($list = $noteService.findNotes())

<h1>Portlet Rest integration for Web content</h1>

<table>
	<thead>
		<tr><th>ID</th><th>Title</th><th>Body</th></tr>
	</thead>
	<tbody>

#foreach( $note in $list )
    <tr><td>$note.getId()</td><td>$note.getTitle()</td><td>$note.getBody()</td></tr>
#end

	</tbody>
</table>
```

To build you need maven or Liferay Developer Studio

mvn package should be enough and then /rest-consumer/rest-consumer-portlet should contain file to be deployed to Liferay.
