package org.supcom.adapter.output.util;


public class XMPPServerConnectionConfiguration {

    private String host;
    private int port;
    private String username;
    private String password;
    private int timeoutInterval;
    private String resource;

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

    public XMPPServerConnectionConfiguration(String host, int port, String username, String password,
                                             int timeoutInterval, String resource) {
        this.host = host;
        this.port = port;
        this.username = username;
        this.password = password;
        this.timeoutInterval = timeoutInterval;
        this.resource = resource;
    }

}