package org.example.kotlinspringdemo.utils

import java.io.PrintWriter
import java.io.StringWriter

class ThrowableExtension {

    companion object {
        fun Throwable.stackTraceAsString(): String {
            val error = StringWriter()
            this.printStackTrace(PrintWriter(error))
            return error.toString()
        }
    }

}