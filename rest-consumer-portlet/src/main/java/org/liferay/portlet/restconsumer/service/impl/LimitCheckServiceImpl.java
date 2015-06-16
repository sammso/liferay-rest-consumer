package org.liferay.portlet.restconsumer.service.impl;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import org.liferay.portlet.restconsumer.service.base.LimitCheckServiceBaseImpl;

/**
 * The implementation of the limit check remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.liferay.portlet.restconsumer.service.LimitCheckService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see org.liferay.portlet.restconsumer.service.base.LimitCheckServiceBaseImpl
 * @see org.liferay.portlet.restconsumer.service.LimitCheckServiceUtil
 */
public class LimitCheckServiceImpl extends LimitCheckServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link org.liferay.portlet.restconsumer.service.LimitCheckServiceUtil} to access the limit check remote service.
     */
	
	public boolean isInLimit(double amount) {
		_log.error(" isInLimit(" + amount +") = " + (amount <= 500000.0d));
		return amount <= 500000.0d;
	}
	
	
	public boolean isManagerApprovalRequired(double amount) {
		_log.error(" isManagerApprovalRequired(" + amount +") = " + (amount > 100000.0d));
		return amount > 100000.0d;
	}
	
	private Log _log = LogFactoryUtil.getLog(LimitCheckServiceImpl.class.getName());	
}
