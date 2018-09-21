package com.company;

import com.company.Handlers.TestHandler;
import com.sun.net.httpserver.*;

import java.io.IOException;
import java.net.InetSocketAddress;

public class Main {

    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/test", new TestHandler());
        server.start();
    }
}