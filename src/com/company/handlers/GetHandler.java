package com.company.handlers;

import com.company.HttpResponse;
import com.company.io.ReqPrinter;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

public class GetHandler implements HttpHandler {
    public void handle(HttpExchange exchange) throws IOException {
        ReqPrinter.printRequestInfo(exchange);
        String response = "{\"message\": \"get method\"}";
        exchange.getResponseHeaders().set("Content-Type:",
                "application/json;");

        exchange.sendResponseHeaders(HttpResponse.OK.getCode(), response.getBytes().length);
        OutputStream os = exchange.getResponseBody();
        os.write(response.getBytes());
        os.close();

    }
}
