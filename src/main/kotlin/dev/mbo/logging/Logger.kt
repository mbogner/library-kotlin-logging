package dev.mbo.logging

import org.slf4j.Logger
import org.slf4j.LoggerFactory

/**
 * Simple method to create a logger instance in a class.
 */
fun <T : Any> T.logger(): Logger = LoggerFactory.getLogger(javaClass)