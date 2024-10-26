package dev.mbo.logging

import org.junit.jupiter.api.Test

class LoggerTest {

    private val log = logger()

    @Test
    internal fun testLog() {
        log.debug("it works")
    }

}