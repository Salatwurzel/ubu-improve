package org.ubu_improve.logic

import java.io.File

fun switchToGnomeSoftwareWithFlatpak() {
    val startMessages = listOf(
        "--------------------------------------------------------",
        " This script will replace the standard Software-Center with \"Gnome-Software\"",
        " The Flathub repository will be added for more Software availability",
        "--------------------------------------------------------",
        "",
        "Press Enter to start"
    )

    val commandList = mutableListOf<String>(
        "sudo apt install flatpak -y",
        "sudo apt install gnome-software -y",
        "sudo apt install gnome-software-plugin-flatpak -y",
        "sudo flatpak remote-add --if-not-exists flathub https://flathub.org/repo/flathub.flatpakrepo"
    )

    if (File("/usr/bin/snap").exists()){
        commandList.add("sudo apt install gnome-software-plugin-snap -y")
        commandList.add("sudo snap remove snap-store")
    }

    runShellCommands(commands = commandList, pressEnterBeforeStart = true, messagesBeforeStart = startMessages)
}