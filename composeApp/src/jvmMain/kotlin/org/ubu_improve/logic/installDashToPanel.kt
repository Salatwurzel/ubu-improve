package org.ubu_improve.logic

//gnome-extensions
//Aufruf:
//  gnome-extensions BEFEHL [ARGUMENTE …]
//
//Befehle:
//  help      Hilfe ausgeben
//  version   Version ausgeben
//  enable    Erweiterung aktivieren
//  disable   Erweiterung deaktivieren
//  reset     Erweiterung zurücksetzen
//  uninstall Erweiterung deinstallieren
//  list      Erweiterungen auflisten
//  info      Erweiterungsinformationen anzeigen
//  show      Erweiterungsinformationen anzeigen
//  prefs     Erweiterungseinstellungen öffnen
//  create    Erweiterung erstellen
//  pack      Paket-Erweiterung
//  install   Erweiterungspaket installieren

fun installDashToPanel() {
    val commands = listOf("gdbus call --session --dest org.gnome.Shell.Extensions --object-path /org/gnome/Shell/Extensions --method org.gnome.Shell.Extensions.InstallRemoteExtension \"dash-to-panel@jderose9.github.com\"")
    runShellCommands(commands = commands, autoClose = true)
}