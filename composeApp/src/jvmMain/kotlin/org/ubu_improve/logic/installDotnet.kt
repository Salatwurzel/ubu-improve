package org.ubu_improve.logic

fun installDotnet() {
    val startMessages = listOf(
        "--------------------------------------------------------",
        "INFO: THIS WILL DOWNLOAD AND EXECUTE THE DOTNET INSTALLER FROM MICROSOFT",
        "--------------------------------------------------------",
        "",
        "Press Enter to continue"
    )

    val commands = listOf(
        "wget https://dot.net/v1/dotnet-install.sh -O /tmp/dotnet-install.sh",
        "chmod +x /tmp/dotnet-install.sh",
        "sh /tmp/dotnet-install.sh"
    )

    runShellCommands(commands = commands, pressEnterBeforeStart = true, messagesBeforeStart = startMessages)
}