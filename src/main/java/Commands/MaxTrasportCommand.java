//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package Commands;

import MainFiles.Main;
import flat.Flat;
import flat.Transport;
import java.util.Iterator;
import java.util.Map.Entry;

public class MaxTrasportCommand extends Command {
    public MaxTrasportCommand() {
    }

    public void execute(Object var1) {
        Transport transport = Transport.NONE;
        Flat maxTransp = new Flat();
        if (Main.flats.size() == 0) {
            System.out.println("На данный момент коллекция пустая");
        } else {
            Iterator iterator = Main.flats.entrySet().iterator();

            while(iterator.hasNext()) {
                Entry<Integer, Flat> pair = (Entry)iterator.next();
                if (transport.compareTo(((Flat)pair.getValue()).getTransport()) < 0) {
                    transport = ((Flat)pair.getValue()).getTransport();
                    maxTransp = (Flat)pair.getValue();
                }
            }

            System.out.println("Вот элемент с максимальным транспортом: ");
            System.out.println(maxTransp);
        }
    }
}
