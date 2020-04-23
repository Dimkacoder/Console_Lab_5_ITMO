package MainFiles;

import Commands.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Console {
    public static Scanner sc;

    public Console() {
        sc = new Scanner(System.in);
    }
    public Console(String filename) throws FileNotFoundException {
        File file = new File(filename);
        sc = new Scanner(file);
    }
    public static String[] splitCommand;
    public void writeCommand() {

        System.out.println("Введите команду: ");

        String command = sc.nextLine();
        splitCommand = command.split(" "); //делим введённую команду на строки разделённые пробелами

        switch(splitCommand[0]) {
            case "replace_if_lower":
                Integer key4;
                NotEnough.checkParametrs(splitCommand, 2, 3);
                try {
                    key4 = Integer.parseInt(splitCommand[1]);
                }catch(NumberFormatException e){
                    System.out.println("Введите число на второе место");
                    break;
                }
                ReplaceIf__Command replaceIf__Command = new ReplaceIf__Command();
                replaceIf__Command.execute(-key4);
                break;
            case "replace_if_greater":
                if (!NotEnough.checkParametrs(splitCommand, 2, 3)){
                    break;
                }
                Integer key;
                try {
                    key = Integer.parseInt(splitCommand[1]);
                }catch(NumberFormatException e){
                    System.out.println("Введите число на второе место");
                    break;
                }
                ReplaceIf__Command replaceIfGreaterCommand = new ReplaceIf__Command();
                replaceIfGreaterCommand.execute(key);
                break;
            case "remove_lower":
                if(!NotEnough.checkParametrs(splitCommand, 1, 2)){ break;}
                RemoveLowerCommand removeLowerCommand = new RemoveLowerCommand();
                removeLowerCommand.execute(null);
                break;
            case "print_ascending":
                if(!NotEnough.checkParametrs(splitCommand,1)){
                    break;
                }
                Main.flats.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
                break;
            case "max_by_transport":
                if(!NotEnough.checkParametrs(splitCommand,1)){ break;}
                MaxTrasportCommand maxTrasportCommand = new MaxTrasportCommand();
                maxTrasportCommand.execute(null);
                break;
            case "update_id":
                if (!NotEnough.checkParametrs(splitCommand, 2, 3)){
                    break;
                }
                Long id;
                try {
                    id = Long.parseLong(splitCommand[1]);
                }catch(NumberFormatException e){
                    System.out.println("Введите число (id) на второе место");
                    break;
                }
                UpdateIdCommand updateIdCommand = new UpdateIdCommand();
                updateIdCommand.execute(id);
                break;
            case "insert":
                if (!NotEnough.checkParametrs(splitCommand, 2, 3)){
                    break;
                }
                Integer key1;
                try {
                    key1 = Integer.parseInt(splitCommand[1]);
                }catch(NumberFormatException e){
                    System.out.println("Введите число (ключ) на второе место");
                    break;
                }catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("Нужен ключ");
                    break;
                }
                InsertElementCommand insertElement = new InsertElementCommand();
                insertElement.execute(key1);
                break;
            case "execute_script":
                if(!NotEnough.checkParametrs(splitCommand,2)){
                    break;
                }
                Scanner lastScanner = sc;
                ExecuteScript executeScript = new ExecuteScript();
                executeScript.execute(splitCommand[1]);
                sc = lastScanner;
                break;
            case "sum_of_number_of_rooms":
                if(!NotEnough.checkParametrs(splitCommand,1)){
                    break;
                }
                SumNumberOfRoomsCommand sumNumberOfRoomsCommand = new SumNumberOfRoomsCommand();
                sumNumberOfRoomsCommand.execute(null);
                break;
            case "exit":
                if(!NotEnough.checkParametrs(splitCommand,1)){
                    break;
                }
                System.exit(1);
                break;
            case "help":
                if(!NotEnough.checkParametrs(splitCommand,1)){
                    break;
                }
                HelpCommand helpCommand = new HelpCommand();
                helpCommand.execute(null);
                break;
            case "info":
                if(!NotEnough.checkParametrs(splitCommand,1)){
                    break;
                }
                System.out.print("Тип коллекции - LinkedHash Map\nКлюч - Integer\nЗначение - Flat\n");
                if(Main.flats.isEmpty()){
                    System.out.println("На данный момент коллекция пустая");
                }else {
                    System.out.println("Количество элементов в коллекции - "+Main.flats.size());
                }
                break;
            case "show":
                if(!NotEnough.checkParametrs(splitCommand,1)){
                    break;
                }
                ShowCommand showCommand = new ShowCommand();
                showCommand.execute(null);
                break;
            case "save":
                if(!NotEnough.checkParametrs(splitCommand,1)){
                    break;
                }
                SaveCommand saveCommand = new SaveCommand();
                saveCommand.execute(null);
                break;
            case "clear":
                if(!NotEnough.checkParametrs(splitCommand,1)){
                    break;
                }
                ClearCommand clearCommand = new ClearCommand();
                clearCommand.execute(null);
                break;
            case "remove_key":
                if(!NotEnough.checkParametrs(splitCommand,2)){ break; }
                Integer key2;
                try {
                    key2 = Integer.parseInt(splitCommand[1]);
                }catch (NumberFormatException e){
                    System.out.println("Введите число!");
                    break;
                }
                RemoveKeyCommand removeKeyCommand = new RemoveKeyCommand();
                removeKeyCommand.execute(key2);
                break;

            default:
                System.out.println("Таких команд я не понимаю, жалкий человек");
        }

    }
}
