//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package Commands;

import MainFiles.Main;
import flat.Flat;
import java.util.Iterator;
import java.util.Map.Entry;

public class ShowCommand extends Command {
    public ShowCommand() {
    }

    public void execute(Object o) {
        Iterator iterator = Main.flats.entrySet().iterator();

        while(iterator.hasNext()) {
            Entry<Integer, Flat> pair = (Entry)iterator.next();
            System.out.println("Ключ " + pair.getKey() + " " + ((Flat)pair.getValue()).toString());
        }

    }
}
