//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package Commands;

import MainFiles.Console;
import MainFiles.Main;
import flat.Flat;

public class InsertElementCommand extends Command {
    public InsertElementCommand() {
    }

    public void execute(Object var1) {
        Integer key = (Integer)var1;
        Flat newFlat;
        if (Console.splitCommand.length == 3) {
            try {
                JsonDecoder jsonDecoder = new JsonDecoder(Console.splitCommand[2]);
                newFlat = jsonDecoder.getDecodeValue();
                Main.flats.put(key, newFlat);
                System.out.println("Добавлено");
            } catch (NullPointerException var5) {
                System.out.println("Какое-то значение пустое");
                return;
            }
        } else {
            CreateFlat createFlat = new CreateFlat();
            newFlat = createFlat.getNewFlat();
            Main.flats.put(key, newFlat);
            System.out.println("Добавлено");
        }

    }
}
