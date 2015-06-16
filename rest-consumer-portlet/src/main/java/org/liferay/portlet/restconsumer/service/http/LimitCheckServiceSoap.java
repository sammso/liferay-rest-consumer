package org.liferay.portlet.restconsumer.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import org.liferay.portlet.restconsumer.service.LimitCheckServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link org.liferay.portlet.restconsumer.service.LimitCheckServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LimitCheckServiceHttp
 * @see org.liferay.portlet.restconsumer.service.LimitCheckServiceUtil
 * @generated
 */
public class LimitCheckServiceSoap {
    private static Log _log = LogFactoryUtil.getLog(LimitCheckServiceSoap.class);

    public static boolean isInLimit(double amount) throws RemoteException {
        try {
            boolean returnValue = LimitCheckServiceUtil.isInLimit(amount);

            return returnValue;
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static boolean isManagerApprovalRequired(double amount)
        throws RemoteException {
        try {
            boolean returnValue = LimitCheckServiceUtil.isManagerApprovalRequired(amount);

            return returnValue;
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }
}
