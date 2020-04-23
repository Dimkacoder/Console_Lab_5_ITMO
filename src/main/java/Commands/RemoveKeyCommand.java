//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package Commands;

import MainFiles.Main;

public class RemoveKeyCommand extends Command {
    public RemoveKeyCommand() {
    }

    public void execute(Object var1) {
        Integer key = (Integer)var1;
        int sizeB4 = Main.flats.size();
        Main.flats.remove(key);
        if (sizeB4 == Main.flats.size()) {
            System.out.println("Элемента с таким ключом нет :(");
        } else {
            System.out.println("Элемент №" + var1 + " успешно удалён");
        }
    }
}
