package org.supcom.adapter.input.exception;

public class XMPPContentInitializationException extends RuntimeException {
    private String errMessage;

    public XMPPContentInitializationException(String msg, Exception nestedEx) {
        super(msg, nestedEx);
        setErrorMessage(msg);
    }

    public XMPPContentInitializationException(String message, Throwable cause) {
        super(message, cause);
        setErrorMessage(message);
    }

    public XMPPContentInitializationException(String msg) {
        super(msg);
        setErrorMessage(msg);
    }

    public XMPPContentInitializationException() {
        super();
    }

    public XMPPContentInitializationException(Throwable cause) {
        super(cause);
    }

    public String getErrorMessage() {
        return errMessage;
    }

    public void setErrorMessage(String errMessage) {
        this.errMessage = errMessage;
    }
}