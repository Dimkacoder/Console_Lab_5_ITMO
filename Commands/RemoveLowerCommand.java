//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package Commands;

import MainFiles.Console;
import MainFiles.Main;
import flat.Flat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;

public class RemoveLowerCommand extends Command {
    public RemoveLowerCommand() {
    }

    public void execute(Object var1) {
        Flat thisFlat = this.newFlat();
        if (thisFlat == null) {
            System.out.println("Какое-то значение пустое");
        } else {
            Iterator iterator = Main.flats.entrySet().iterator();
            ArrayList keys = new ArrayList();

            while(iterator.hasNext()) {
                Entry<Integer, Flat> pair = (Entry)iterator.next();
                if (thisFlat.compareTo((Flat)pair.getValue()) > 0) {
                    keys.add(pair.getKey());
                }
            }

            if (keys.size() == 0) {
                System.out.println("Не нашлось элементов меньших");
            } else {
                for(int i = 0; i < keys.size(); ++i) {
                    Integer key = (Integer)keys.get(i);
                    Main.flats.remove(key);
                }

                System.out.println("Удалено " + keys.size() + " элемент(ов)");
            }
        }
    }

    private Flat newFlat() {
        if (Console.splitCommand.length == 2) {
            JsonDecoder jsonDecoder = new JsonDecoder(Console.splitCommand[1]);
            return jsonDecoder.getDecodeValueWithoutId();
        } else {
            CreateFlat createFlat = new CreateFlat();
            return createFlat.getNewFlat();
        }
    }
}
