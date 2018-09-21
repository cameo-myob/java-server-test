package com.company.Handlers;

import com.company.IO.ReqPrinter;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

public class GetHandler implements HttpHandler {
    public void handle(HttpExchange exchange) throws IOException {
        ReqPrinter.printRequestInfo(exchange);
        String response = "{\"message\": \"get method\"}";
        exchange.getResponseHeaders().set("Content-Type:", "application/json;");
        exchange.sendResponseHeaders(200, response.getBytes().length);
        OutputStream os = exchange.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }
}
