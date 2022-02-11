package com.example.test.service;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class TwitchException extends RuntimeException {
    public TwitchException(String errorMessage) {
        super(errorMessage);
    }
}
