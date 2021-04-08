package com.hpzhang.kotlin_core_program.capt3.obj;

/**
 * Created by hpzhang on 4/8/21.
 * Java单例
 */
public class SingleInstanceJava {
    private String host;
    private int port;
    private String username;
    private String password;

    private static SingleInstanceJava singleInstanceJava = null;

    private static String DEFAULT_HOST = "127.0.0.1";
    private static int DEFAULT_PORT = 3390;
    private static String DEFAULT_USERNAME = "root";
    private static String DEFAULT_PASSWORD = "123456";

    public SingleInstanceJava(String host, int port, String username, String password) {
        this.host = host;
        this.port = port;
        this.username = username;
        this.password = password;
    }

    public static SingleInstanceJava getInstance() {
        if (singleInstanceJava == null) {
            singleInstanceJava = new SingleInstanceJava(DEFAULT_HOST, DEFAULT_PORT, DEFAULT_USERNAME, DEFAULT_PASSWORD);
        }
        return singleInstanceJava;
    }

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
}
