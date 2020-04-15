//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package Commands;

import MainFiles.Console;
import MainFiles.Main;
import flat.Flat;

public class ReplaceIf__Command extends Command {
    public ReplaceIf__Command() {
    }

    public void execute(Object var1) {
        Integer key = (Integer)var1;
        Flat oldFlat = (Flat)Main.flats.get(Math.abs(key));
        if (oldFlat == null) {
            System.out.println("Нечего заменять, так как нету пары для такого ключа");
        } else {
            try {
                Flat newFlat = this.newFlat();
                if ((float)newFlat.compareTo(oldFlat) * Math.signum((float)key) > 0.0F) {
                    Main.flats.put(Math.abs(key), newFlat);
                    System.out.println("Заменено");
                } else if (Math.signum((float)key) > 0.0F) {
                    System.out.println("Новое значение меньше старого");
                } else {
                    System.out.println("Новое значение больше старого");
                }
            } catch (NullPointerException var6) {
                System.out.println("Какое-то значение пустое");
            }

        }
    }

    private Flat newFlat() {
        if (Console.splitCommand.length == 3) {
            JsonDecoder jsonDecoder = new JsonDecoder(Console.splitCommand[2]);
            return jsonDecoder.getDecodeValueWithoutId();
        } else {
            CreateFlat createFlat = new CreateFlat();
            return createFlat.getNewFlat();
        }
    }
}
