package org.liferay.portlet.restconsumer.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link LimitCheckService}.
 *
 * @author Brian Wing Shun Chan
 * @see LimitCheckService
 * @generated
 */
public class LimitCheckServiceWrapper implements LimitCheckService,
    ServiceWrapper<LimitCheckService> {
    private LimitCheckService _limitCheckService;

    public LimitCheckServiceWrapper(LimitCheckService limitCheckService) {
        _limitCheckService = limitCheckService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _limitCheckService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _limitCheckService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _limitCheckService.invokeMethod(name, parameterTypes, arguments);
    }

    @Override
    public boolean isInLimit(double amount) {
        return _limitCheckService.isInLimit(amount);
    }

    @Override
    public boolean isManagerApprovalRequired(double amount) {
        return _limitCheckService.isManagerApprovalRequired(amount);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public LimitCheckService getWrappedLimitCheckService() {
        return _limitCheckService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedLimitCheckService(LimitCheckService limitCheckService) {
        _limitCheckService = limitCheckService;
    }

    @Override
    public LimitCheckService getWrappedService() {
        return _limitCheckService;
    }

    @Override
    public void setWrappedService(LimitCheckService limitCheckService) {
        _limitCheckService = limitCheckService;
    }
}
