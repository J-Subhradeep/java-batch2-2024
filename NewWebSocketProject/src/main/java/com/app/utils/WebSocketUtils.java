package com.app.utils;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

public class WebSocketUtils {
    public static String getQueryParam(String uri, String param) throws URISyntaxException {
        URI parsedUri = new URI(uri);
        String query = parsedUri.getQuery(); // Extract query part
        if (query == null) {
            return null;
        }

        // Split query into key-value pairs
        Map<String, String> queryParams = new HashMap<>();
        for (String pair : query.split("&")) {
            String[] keyValue = pair.split("=");
            if (keyValue.length == 2) {
                queryParams.put(keyValue[0], keyValue[1]);
            }
        }
        
        // Return the requested parameter
        return queryParams.get(param);
    }

}

