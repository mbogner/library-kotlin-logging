package dev.mbo.logging

import org.slf4j.Logger

/**
 * Exception logging helper.
 */
object LeveledLogger {

    /**
     * @param log The SLF4J logger to use.
     * @param logLevel loglevel for the exception.
     * @param exc The exception to log.
     * @param message Custom log message. If null (default) the exception message is used.
     */
    fun log(log: Logger, logLevel: LogLevel, exc: Throwable, message: String? = null) {
        val msg = message ?: exc.message
        when (logLevel) {
            LogLevel.TRACE -> log.trace(msg, exc)
            LogLevel.DEBUG -> log.debug(msg, exc)
            LogLevel.INFO -> log.info(msg, exc)
            LogLevel.WARN -> log.warn(msg, exc)
            LogLevel.ERROR, LogLevel.FATAL -> log.error(msg, exc)
            LogLevel.OFF -> {
                // do nothing
            }
        }
    }

}