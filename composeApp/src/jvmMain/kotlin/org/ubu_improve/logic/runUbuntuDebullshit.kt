package org.ubu_improve.logic

import java.io.File

fun runUbuntuDebullshit() {
    Thread().contextClassLoader.getResourceAsStream("ubuntu-debullshit.sh")?.copyTo(File("/tmp/ubuntu-debullshit.sh").outputStream())
    runShellCommands(listOf("sudo sh /tmp/ubuntu-debullshit.sh"), messagesBeforeStart = listOf("Starting ubuntu-debullshit..."))
}