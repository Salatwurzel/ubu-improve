package org.ubu_improve.logic

fun runShellCommands(
    commands: List<String>,
    openNewTerminalWindow: Boolean = true,
    autoClose: Boolean = false,
    pressEnterBeforeStart: Boolean = false,
    messagesBeforeStart: List<String> = listOf(""),
    messagesAfterEnd: List<String> = listOf<String>()
){

    var allCommandsInOneString = String();

    for (message in messagesBeforeStart){
        allCommandsInOneString += "echo $message;"
    }
    if (pressEnterBeforeStart){
        allCommandsInOneString += "read;"
    }

    for (command in commands){
        allCommandsInOneString += "$command;"
    }

    var closeMessage = "";
    if (autoClose == false) {
        closeMessage += "echo '';"

        for (message in messagesAfterEnd){
            closeMessage += "echo $message;"
        }

        closeMessage += "echo 'Everything done, press any key to exit...';"
        closeMessage += "read;"

    }

    val pb = ProcessBuilder("x-terminal-emulator", "-e", "/bin/bash -c \"$allCommandsInOneString $closeMessage\"")
    pb.inheritIO()
    pb.start()
}
