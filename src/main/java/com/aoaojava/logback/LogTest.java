package com.aoaojava.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Aoao Logback
 * Created by Felix on 2017/2/26.
 */
public class LogTest {

    private final static Logger log = LoggerFactory.getLogger(LogTest.class);

    public static void main(String[] args) {
        log.info("test");
    }
}
