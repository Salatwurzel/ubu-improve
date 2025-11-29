package org.ubu_improve.logic

fun installKotlinSDK() {
    val startMessages = listOf(
        "---------------------------------",
        "THIS WILL DOWNLOAD AND INSTALL THE LATEST KOTLIN SDK",
        "It will be installed as snap package",
        "---------------------------------",
        "",
        "Press Enter to start"
    )

    val commands = listOf(
        "sudo apt install snapd -y",
        "sudo snap install kotlin --classic",
        "sudo apt install default-jdk -y"
    )

    runShellCommands(commands, pressEnterBeforeStart = true, messagesBeforeStart = startMessages)
}