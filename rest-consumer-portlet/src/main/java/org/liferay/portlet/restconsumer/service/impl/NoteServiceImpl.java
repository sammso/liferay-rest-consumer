package org.liferay.portlet.restconsumer.service.impl;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.util.List;

import org.liferay.portlet.restconsumer.service.Note;
import org.liferay.portlet.restconsumer.service.base.NoteServiceBaseImpl;

/**
 * The implementation of the note remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.liferay.portlet.restconsumer.service.NoteService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see org.liferay.portlet.restconsumer.service.base.NoteServiceBaseImpl
 * @see org.liferay.portlet.restconsumer.service.NoteServiceUtil
 */
public class NoteServiceImpl extends NoteServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link org.liferay.portlet.restconsumer.service.NoteServiceUtil} to access the note remote service.
     */
	public List<Note> findNotes() {
		return noteLocalService.findNotes();
	}
	
	public void addNote(Note note) {
		_log.info("Note added : " + note);
	}
	
	private Log _log = LogFactoryUtil.getLog(NoteServiceImpl.class.getName());
}
