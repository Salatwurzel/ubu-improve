package org.ubu_improve.logic

import java.io.File

fun copyResource(resourceFile: String, outputFile: String) {
    Thread().contextClassLoader.getResourceAsStream(resourceFile)?.copyTo(File(outputFile).outputStream())
}