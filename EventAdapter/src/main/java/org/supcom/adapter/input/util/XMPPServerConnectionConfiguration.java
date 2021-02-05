package org.supcom.adapter.input.util;


import java.util.Map;

/**
 * This holds the configurations related to MQTT Broker.
 */
public class XMPPServerConnectionConfiguration {

    private String host;
    private int port;
    private String username;
    private String password;
    private int timeoutInterval;
    private String resource;
    private String jid;
    private String contentValidatorClassName;
    private String contentTransformerClassName;

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getTimeoutInterval() {
        return timeoutInterval;
    }

    public String getResource() {
        return resource;
    }

    public String getContentValidatorClassName() {
        return contentValidatorClassName;
    }

    public String getJid() {
        return jid;
    }

    public String getContentTransformerClassName() {
        return contentTransformerClassName;
    }

    public XMPPServerConnectionConfiguration(String host, int port, String username, String password,
                                             int timeoutInterval, String resource, String contentValidatorClassName, String jid,
                                             String contentTransformerClassName) {
        this.host = host;
        this.port = port;
        this.username = username;
        this.password = password;
        this.timeoutInterval = timeoutInterval;
        this.resource = resource;
        this.contentValidatorClassName = contentValidatorClassName;
        this.contentTransformerClassName = contentTransformerClassName;
        this.jid = jid;
    }

}