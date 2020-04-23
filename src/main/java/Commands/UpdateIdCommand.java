//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package Commands;

import MainFiles.Console;
import MainFiles.Main;
import flat.Flat;
import java.util.Iterator;
import java.util.Map.Entry;

public class UpdateIdCommand extends Command {
    public UpdateIdCommand() {
    }

    public void execute(Object var1) {
        Long id = (Long)var1;
        Iterator iterator = Main.flats.entrySet().iterator();

        Entry pair;
        do {
            if (!iterator.hasNext()) {
                System.out.println("Не найдено");
                return;
            }

            pair = (Entry)iterator.next();
        } while(!((Flat)pair.getValue()).getId().equals(id));

        Integer key = (Integer)pair.getKey();

        try {
            Flat newFlat = this.newFlat();
            Main.flats.put(key, newFlat);
        } catch (NullPointerException var7) {
            System.out.println("Какое-то значение пустое");
            return;
        }

        System.out.println("Заменено");
    }

    private Flat newFlat() {
        if (Console.splitCommand.length == 3) {
            JsonDecoder jsonDecoder = new JsonDecoder(Console.splitCommand[2]);
            return jsonDecoder.getDecodeValue();
        } else {
            CreateFlat createFlat = new CreateFlat();
            return createFlat.getNewFlat();
        }
    }
}
