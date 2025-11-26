package org.ubu_improve.logic

fun switchToVanillaGnome(){
    val commands = listOf<String>(
        "sudo apt install gnome-session fonts-cantarell adwaita-icon-theme gnome-backgrounds gnome-tweaks vanilla-gnome-default-settings gnome-shell-extension-manager -y",
        "sudo apt remove ubuntu-session yaru-theme-gnome-shell yaru-theme-gtk yaru-theme-icon yaru-theme-sound -y"
    )
    runShellCommands(
        commands = commands,
        messagesBeforeStart = listOf("Starting vanilla gnome switch"),
        messagesAfterEnd = listOf(
            "#####################################",
            "IT IS STRONGLY ADVICED TO REBOOT NOW",
            "#####################################",
        )
    )
}