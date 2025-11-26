package org.ubu_improve.logic

import ubu_improve.composeapp.generated.resources.JetBrainsMono_Medium
import ubu_improve.composeapp.generated.resources.Res
import java.io.File

fun runUbuntuDebullshit() {
    copyResource(resourceFile = "ubuntu-debullshit.sh", outputFile = "/tmp/ubuntu-debullshit.sh")
    runShellCommands(listOf("sudo sh /tmp/ubuntu-debullshit.sh"), messagesBeforeStart = listOf("Starting ubuntu-debullshit..."))
}