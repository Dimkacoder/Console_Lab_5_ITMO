//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package Commands;

import MainFiles.Main;
import flat.Flat;
import java.util.Iterator;
import java.util.Map.Entry;

public class SumNumberOfRoomsCommand extends Command {
    public SumNumberOfRoomsCommand() {
    }

    public void execute(Object var1) {
        Iterator iterator = Main.flats.entrySet().iterator();

        Long sum;
        Entry pair;
        for(sum = 0L; iterator.hasNext(); sum = sum + ((Flat)pair.getValue()).getNumberOfRooms()) {
            pair = (Entry)iterator.next();
        }

        System.out.println("Общее количество комнат - " + sum);
    }
}
