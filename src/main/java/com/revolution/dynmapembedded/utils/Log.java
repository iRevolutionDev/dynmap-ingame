package com.revolution.dynmapembedded.utils;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;

public class Log {
    public static void info(String what, Object ... data) {
        LogManager.getLogger("DME").log(Level.INFO, String.format(what, data));
    }

    public static void warning(String what, Object ... data) {
        LogManager.getLogger("DME").log(Level.WARN, String.format(what, data));
    }

    public static void error(String what, Object ... data) {
        LogManager.getLogger("DME").log(Level.ERROR, String.format(what, data));
    }

    public static void errorException(String what, Throwable t, Object ... data) {
        LogManager.getLogger("DME").log(Level.ERROR, String.format(what, data), t);
    }
}
