//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package Commands;

import MainFiles.Main;

public class ClearCommand extends Command {
    public ClearCommand() {
    }

    public void execute(Object var1) {
        if (Main.flats.size() == 0) {
            System.out.println("Коллекция уже была почищена уборщиками\n░░░░░░░░░░░░▄▄░░░░░░░░░░░░░░\n░░░░░░░░░░░█░░█░░░░░░░░░░░░░\n░░░░░░░░░░░█░░█░░░░░░░░░░░░░\n░░░░░░░░░░█░░░█░░░░░░░░░░░░░\n░░░░░░░░░█░░░░█░░░░░░░░░░░░░\n██████▄▄█░░░░░██████▄░░░░░░░\n▓▓▓▓▓▓█░░░░░░░░░░░░░░█░░░░░░\n▓▓▓▓▓▓█░░░░░░░░░░░░░░█░░░░░░\n▓▓▓▓▓▓█░░░░░░░░░░░░░░█░░░░░░\n▓▓▓▓▓▓█░░░░░░░░░░░░░░█░░░░░░\n▓▓▓▓▓▓█░░░░░░░░░░░░░░█░░░░░░\n▓▓▓▓▓▓█████░░░░░░░░░██░░░░░░\n█████▀░░░░▀▀████████░░░░░░░░\n░░░░░░░░░░░░░░░░░░░░░░░░░░░░\nКачество отличное");
        } else {
            Main.flats.clear();
            System.out.println("Коллекция чистая");
        }
    }
}
