//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package Commands;

import MainFiles.Console;
import java.io.FileNotFoundException;

public class ExecuteScript extends Command {
    public ExecuteScript() {
    }

    public void execute(Object var1) {
        String filename = (String)var1;

        try {
            Console console = new Console(filename);

            while(Console.sc.hasNextLine()) {
                console.writeCommand();
            }
        } catch (FileNotFoundException var4) {
            System.out.println("Файл скрипта с таким именем не найден");
            return;
        }

        System.out.println("Скрипт в файле " + filename + " исполнен");
    }
}
