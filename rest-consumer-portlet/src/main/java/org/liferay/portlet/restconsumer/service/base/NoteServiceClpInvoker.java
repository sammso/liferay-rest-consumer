package org.liferay.portlet.restconsumer.service.base;

import org.liferay.portlet.restconsumer.service.NoteServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class NoteServiceClpInvoker {
    private String _methodName16;
    private String[] _methodParameterTypes16;
    private String _methodName17;
    private String[] _methodParameterTypes17;
    private String _methodName20;
    private String[] _methodParameterTypes20;
    private String _methodName21;
    private String[] _methodParameterTypes21;
    private String _methodName22;
    private String[] _methodParameterTypes22;

    public NoteServiceClpInvoker() {
        _methodName16 = "getBeanIdentifier";

        _methodParameterTypes16 = new String[] {  };

        _methodName17 = "setBeanIdentifier";

        _methodParameterTypes17 = new String[] { "java.lang.String" };

        _methodName20 = "findNotes";

        _methodParameterTypes20 = new String[] {  };

        _methodName21 = "addNote";

        _methodParameterTypes21 = new String[] {
                "org.liferay.portlet.restconsumer.service.Note"
            };

        _methodName22 = "getCurrentUser";

        _methodParameterTypes22 = new String[] {  };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName16.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes16, parameterTypes)) {
            return NoteServiceUtil.getBeanIdentifier();
        }

        if (_methodName17.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes17, parameterTypes)) {
            NoteServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName20.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes20, parameterTypes)) {
            return NoteServiceUtil.findNotes();
        }

        if (_methodName21.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes21, parameterTypes)) {
            NoteServiceUtil.addNote((org.liferay.portlet.restconsumer.service.Note) arguments[0]);

            return null;
        }

        if (_methodName22.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes22, parameterTypes)) {
            return NoteServiceUtil.getCurrentUser();
        }

        throw new UnsupportedOperationException();
    }
}
