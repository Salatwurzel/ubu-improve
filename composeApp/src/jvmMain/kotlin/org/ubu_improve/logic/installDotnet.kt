package org.ubu_improve.logic

fun installDotnet() {
    val startMessages = listOf(
        "Press any key to download and run the dotnet installer"
    )

    val commands = listOf(
        "wget https://dot.net/v1/dotnet-install.sh -O /tmp/dotnet-install.sh",
        "chmod +x /tmp/dotnet-install.sh",
        "/tmp/dotnet-install.sh"
    )

    runShellCommands(
        commands = commands,
        pressEnterBeforeStart = true,
        messagesBeforeStart = startMessages
    )
}