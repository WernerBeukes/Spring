package org.werner.spring.comparator.model;

import java.io.Serializable;

/**
 * Created by Werner on 2016/10/08.
 */
public class OutDto implements Serializable {
    private boolean success;
    private String message;
    private MessageType messageType;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    @Override
    public String toString() {
        return "OutDto{" +
                "success=" + success +
                ", message='" + message + '\'' +
                ", messageType=" + messageType +
                '}';
    }
}
