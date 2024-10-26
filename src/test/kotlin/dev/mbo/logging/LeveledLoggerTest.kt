package dev.mbo.logging

import org.junit.jupiter.api.Test
import java.util.UUID

class LeveledLoggerTest {

    private val log = logger()

    @Test
    fun log() {
        val exc = Exception("this is on purpose: ${UUID.randomUUID()}")
        LeveledLogger.log(log, LogLevel.TRACE, exc)
        LeveledLogger.log(log, LogLevel.DEBUG, exc)
        LeveledLogger.log(log, LogLevel.INFO, exc)
        LeveledLogger.log(log, LogLevel.WARN, exc)
        LeveledLogger.log(log, LogLevel.ERROR, exc)
        LeveledLogger.log(log, LogLevel.FATAL, exc)
        LeveledLogger.log(log, LogLevel.OFF, exc)
    }
}