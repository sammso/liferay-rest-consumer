package org.liferay.portlet.restconsumer.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NoteLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see NoteLocalService
 * @generated
 */
public class NoteLocalServiceWrapper implements NoteLocalService,
    ServiceWrapper<NoteLocalService> {
    private NoteLocalService _noteLocalService;

    public NoteLocalServiceWrapper(NoteLocalService noteLocalService) {
        _noteLocalService = noteLocalService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _noteLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _noteLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _noteLocalService.invokeMethod(name, parameterTypes, arguments);
    }

    @Override
    public java.util.List<org.liferay.portlet.restconsumer.service.Note> findNotes() {
        return _noteLocalService.findNotes();
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public NoteLocalService getWrappedNoteLocalService() {
        return _noteLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedNoteLocalService(NoteLocalService noteLocalService) {
        _noteLocalService = noteLocalService;
    }

    @Override
    public NoteLocalService getWrappedService() {
        return _noteLocalService;
    }

    @Override
    public void setWrappedService(NoteLocalService noteLocalService) {
        _noteLocalService = noteLocalService;
    }
}
