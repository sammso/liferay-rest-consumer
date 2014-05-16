package org.liferay.portlet.restconsumer.service.base;

import org.liferay.portlet.restconsumer.service.NoteLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class NoteLocalServiceClpInvoker {
    private String _methodName14;
    private String[] _methodParameterTypes14;
    private String _methodName15;
    private String[] _methodParameterTypes15;
    private String _methodName18;
    private String[] _methodParameterTypes18;

    public NoteLocalServiceClpInvoker() {
        _methodName14 = "getBeanIdentifier";

        _methodParameterTypes14 = new String[] {  };

        _methodName15 = "setBeanIdentifier";

        _methodParameterTypes15 = new String[] { "java.lang.String" };

        _methodName18 = "findNotes";

        _methodParameterTypes18 = new String[] {  };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName14.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
            return NoteLocalServiceUtil.getBeanIdentifier();
        }

        if (_methodName15.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
            NoteLocalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName18.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes18, parameterTypes)) {
            return NoteLocalServiceUtil.findNotes();
        }

        throw new UnsupportedOperationException();
    }
}
