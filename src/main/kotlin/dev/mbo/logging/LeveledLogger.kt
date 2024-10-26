package dev.mbo.logging

import org.slf4j.Logger

object LeveledLogger {

    fun log(log: Logger, logLevel: LogLevel, exc: Throwable) {
        when (logLevel) {
            LogLevel.TRACE -> log.trace(exc.message, exc)
            LogLevel.DEBUG -> log.debug(exc.message, exc)
            LogLevel.INFO -> log.info(exc.message, exc)
            LogLevel.WARN -> log.warn(exc.message, exc)
            LogLevel.ERROR, LogLevel.FATAL -> log.error(exc.message, exc)
            LogLevel.OFF -> {
                // do nothing
            }
        }
    }

}