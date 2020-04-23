//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package Commands;

import MainFiles.Main;
import java.util.Iterator;
import java.util.Map.Entry;

public class HelpCommand extends Command {
    public HelpCommand() {
    }

    public void execute(Object var1) {
        Iterator iterator = Main.commandList.entrySet().stream().sorted(Entry.comparingByKey()).iterator();

        while(iterator.hasNext()) {
            Entry<String, String> pair = (Entry)iterator.next();
            System.out.println((String)pair.getKey() + "-" + (String)pair.getValue());
        }

    }
}
