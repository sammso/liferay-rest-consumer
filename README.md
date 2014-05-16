liferay-rest-consumer
=====================

This example liferay application is consuming REST service from https://github.com/sammso/simple-jersey (so you need that too)

It is example how to use ServiceBuilder to consume REST services.

You can also use create Service from web content template:

------------
#set ($noteService = $utilLocator.findUtil("rest-consumer-portlet","org.liferay.portlet.restconsumer.service.NoteLocalService"))

#set ($list = $noteService.findNotes())

&lt;h1&gt;Portlet Rest integration for Web content&lt;/h1&gt;

&lt;table&gt;
	&lt;thead&gt;
		&lt;tr&gt;&lt;th&gt;ID&lt;/th&gt;&lt;th&gt;Title&lt;/th&gt;&lt;th&gt;Body&lt;/th&gt;&lt;/tr&gt;
	&lt;/thead&gt;
	&lt;tbody&gt;

#foreach( $note in $list )
    &lt;tr&gt;&lt;td&gt;$note.getId()&lt;/td&gt;&lt;td&gt;$note.getTitle()&lt;/td&gt;&lt;td&gt;$note.getBody()&lt;/td&gt;&lt;/tr&gt;
#end

	&lt;/tbody&gt;
&lt;/table&gt;
------------
