package org.liferay.portlet.restconsumer.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for LimitCheck. This utility wraps
 * {@link org.liferay.portlet.restconsumer.service.impl.LimitCheckServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see LimitCheckService
 * @see org.liferay.portlet.restconsumer.service.base.LimitCheckServiceBaseImpl
 * @see org.liferay.portlet.restconsumer.service.impl.LimitCheckServiceImpl
 * @generated
 */
public class LimitCheckServiceUtil {
    private static LimitCheckService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link org.liferay.portlet.restconsumer.service.impl.LimitCheckServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static boolean isInLimit(double amount) {
        return getService().isInLimit(amount);
    }

    public static boolean isManagerApprovalRequired(double amount) {
        return getService().isManagerApprovalRequired(amount);
    }

    public static void clearService() {
        _service = null;
    }

    public static LimitCheckService getService() {
        if (_service == null) {
            InvokableService invokableService = (InvokableService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    LimitCheckService.class.getName());

            if (invokableService instanceof LimitCheckService) {
                _service = (LimitCheckService) invokableService;
            } else {
                _service = new LimitCheckServiceClp(invokableService);
            }

            ReferenceRegistry.registerReference(LimitCheckServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(LimitCheckService service) {
    }
}
