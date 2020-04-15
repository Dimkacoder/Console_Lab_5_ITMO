//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package MainFiles;

import Commands.ClearCommand;
import Commands.ExecuteScript;
import Commands.HelpCommand;
import Commands.InsertElementCommand;
import Commands.MaxTrasportCommand;
import Commands.NotEnough;
import Commands.RemoveKeyCommand;
import Commands.RemoveLowerCommand;
import Commands.ReplaceIf__Command;
import Commands.SaveCommand;
import Commands.ShowCommand;
import Commands.SumNumberOfRoomsCommand;
import Commands.UpdateIdCommand;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class Console {
    public static Scanner sc;
    public static String[] splitCommand;

    public Console() {
        sc = new Scanner(System.in);
    }

    public Console(String filename) throws FileNotFoundException {
        File file = new File(filename);
        sc = new Scanner(file);
    }

    public void writeCommand() {
        System.out.println("Введите команду: ");
        String command = sc.nextLine();
        splitCommand = command.split(" ");
        String var2 = splitCommand[0];
        byte var3 = -1;
        switch(var2.hashCode()) {
        case -1949198255:
            if (var2.equals("update_id")) {
                var3 = 5;
            }
            break;
        case -1823614326:
            if (var2.equals("replace_if_lower")) {
                var3 = 0;
            }
            break;
        case -1309514692:
            if (var2.equals("max_by_transport")) {
                var3 = 4;
            }
            break;
        case -1183792455:
            if (var2.equals("insert")) {
                var3 = 6;
            }
            break;
        case -1020102443:
            if (var2.equals("execute_script")) {
                var3 = 7;
            }
            break;
        case -538479918:
            if (var2.equals("sum_of_number_of_rooms")) {
                var3 = 8;
            }
            break;
        case -517336186:
            if (var2.equals("remove_lower")) {
                var3 = 2;
            }
            break;
        case -220111549:
            if (var2.equals("replace_if_greater")) {
                var3 = 1;
            }
            break;
        case 3127582:
            if (var2.equals("exit")) {
                var3 = 9;
            }
            break;
        case 3198785:
            if (var2.equals("help")) {
                var3 = 10;
            }
            break;
        case 3237038:
            if (var2.equals("info")) {
                var3 = 11;
            }
            break;
        case 3522941:
            if (var2.equals("save")) {
                var3 = 13;
            }
            break;
        case 3529469:
            if (var2.equals("show")) {
                var3 = 12;
            }
            break;
        case 94746189:
            if (var2.equals("clear")) {
                var3 = 14;
            }
            break;
        case 627816390:
            if (var2.equals("print_ascending")) {
                var3 = 3;
            }
            break;
        case 1098900516:
            if (var2.equals("remove_key")) {
                var3 = 15;
            }
        }

        switch(var3) {
        case 0:
            NotEnough.checkParametrs(splitCommand, 2, 3);

            Integer key4;
            try {
                key4 = Integer.parseInt(splitCommand[1]);
            } catch (NumberFormatException var28) {
                System.out.println("Введите число на второе место");
                break;
            }

            ReplaceIf__Command replaceIf__Command = new ReplaceIf__Command();
            replaceIf__Command.execute(-key4);
            break;
        case 1:
            if (NotEnough.checkParametrs(splitCommand, 2, 3)) {
                Integer key;
                try {
                    key = Integer.parseInt(splitCommand[1]);
                } catch (NumberFormatException var27) {
                    System.out.println("Введите число на второе место");
                    return;
                }

                ReplaceIf__Command replaceIfGreaterCommand = new ReplaceIf__Command();
                replaceIfGreaterCommand.execute(key);
            }
            break;
        case 2:
            if (NotEnough.checkParametrs(splitCommand, 1, 2)) {
                RemoveLowerCommand removeLowerCommand = new RemoveLowerCommand();
                removeLowerCommand.execute((Object)null);
            }
            break;
        case 3:
            if (NotEnough.checkParametrs(splitCommand, 1)) {
                Stream var10000 = Main.flats.entrySet().stream().sorted(Entry.comparingByValue());
                PrintStream var10001 = System.out;
                var10000.forEach(var10001::println);
            }
            break;
        case 4:
            if (NotEnough.checkParametrs(splitCommand, 1)) {
                MaxTrasportCommand maxTrasportCommand = new MaxTrasportCommand();
                maxTrasportCommand.execute((Object)null);
            }
            break;
        case 5:
            if (NotEnough.checkParametrs(splitCommand, 2, 3)) {
                Long id;
                try {
                    id = Long.parseLong(splitCommand[1]);
                } catch (NumberFormatException var26) {
                    System.out.println("Введите число (id) на второе место");
                    return;
                }

                UpdateIdCommand updateIdCommand = new UpdateIdCommand();
                updateIdCommand.execute(id);
            }
            break;
        case 6:
            if (NotEnough.checkParametrs(splitCommand, 2, 3)) {
                Integer key1;
                try {
                    key1 = Integer.parseInt(splitCommand[1]);
                } catch (NumberFormatException var24) {
                    System.out.println("Введите число (ключ) на второе место");
                    return;
                } catch (ArrayIndexOutOfBoundsException var25) {
                    System.out.println("Нужен ключ");
                    return;
                }

                InsertElementCommand insertElement = new InsertElementCommand();
                insertElement.execute(key1);
            }
            break;
        case 7:
            if (NotEnough.checkParametrs(splitCommand, 2)) {
                Scanner lastScanner = sc;
                ExecuteScript executeScript = new ExecuteScript();
                executeScript.execute(splitCommand[1]);
                sc = lastScanner;
            }
            break;
        case 8:
            if (NotEnough.checkParametrs(splitCommand, 1)) {
                SumNumberOfRoomsCommand sumNumberOfRoomsCommand = new SumNumberOfRoomsCommand();
                sumNumberOfRoomsCommand.execute((Object)null);
            }
            break;
        case 9:
            if (NotEnough.checkParametrs(splitCommand, 1)) {
                System.exit(1);
            }
            break;
        case 10:
            if (NotEnough.checkParametrs(splitCommand, 1)) {
                HelpCommand helpCommand = new HelpCommand();
                helpCommand.execute((Object)null);
            }
            break;
        case 11:
            if (NotEnough.checkParametrs(splitCommand, 1)) {
                System.out.print("Тип коллекции - LinkedHash Map\nКлюч - Integer\nЗначение - Flat\n");
                if (Main.flats.isEmpty()) {
                    System.out.println("На данный момент коллекция пустая");
                } else {
                    System.out.println("Количество элементов в коллекции - " + Main.flats.size());
                }
            }
            break;
        case 12:
            if (NotEnough.checkParametrs(splitCommand, 1)) {
                ShowCommand showCommand = new ShowCommand();
                showCommand.execute((Object)null);
            }
            break;
        case 13:
            if (NotEnough.checkParametrs(splitCommand, 1)) {
                SaveCommand saveCommand = new SaveCommand();
                saveCommand.execute((Object)null);
            }
            break;
        case 14:
            if (NotEnough.checkParametrs(splitCommand, 1)) {
                ClearCommand clearCommand = new ClearCommand();
                clearCommand.execute((Object)null);
            }
            break;
        case 15:
            if (NotEnough.checkParametrs(splitCommand, 2)) {
                Integer key2;
                try {
                    key2 = Integer.parseInt(splitCommand[1]);
                } catch (NumberFormatException var23) {
                    System.out.println("Введите число!");
                    return;
                }

                RemoveKeyCommand removeKeyCommand = new RemoveKeyCommand();
                removeKeyCommand.execute(key2);
            }
            break;
        default:
            System.out.println("Таких команд я не понимаю, жалкий человек");
        }

    }
}
