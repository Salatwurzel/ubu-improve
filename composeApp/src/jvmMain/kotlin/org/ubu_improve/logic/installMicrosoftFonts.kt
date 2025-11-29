package org.ubu_improve.logic

fun installMicrosoftFonts() {
    val startMessages = listOf(
        "---------------------------------",
        "This will install the Microsoft Fonts",
        "You will need to accept the EULA during installation",
        "---------------------------------",
        "",
        "Press Enter to start"
    )

    val commands = listOf(
        "sudo apt install ttf-mscorefonts-installer -y",
    )

    runShellCommands(commands, pressEnterBeforeStart = true, messagesBeforeStart = startMessages)
}