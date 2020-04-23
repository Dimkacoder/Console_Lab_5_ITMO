package MainFiles;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
import com.sun.tools.javac.parser.ReferenceParser;
import flat.*;
import Commands.WriteFileCommand;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;

public class Main {
    public static String pathname;
    public static HashMap<String, String> commandList = new HashMap();
    public static LinkedHashMap<Integer, Flat> flats = new LinkedHashMap<>();

    public Main() {
    }
    public static void main(String[] args) {
        commandList.put("help ", " вывести справку по доступным командам");//
        commandList.put("info ", " вывести в стандартный поток вывода информацию о коллекции");//
        commandList.put("show ", " вывести в стандартный поток вывода все элементы коллекции в строковом представлении");//
        commandList.put("remove_key \"ключ\" ", " удалить элемент из коллекции по его ключу");//
        commandList.put("insert \"ключ\" {элемент} ", " добавить элемент с заданным ключом");//
        commandList.put("update_id \"id элемента\" {элемент} ", " обновить значение элемента коллекции, id которого равен заданному");//
        commandList.put("clear ", " очистить коллекцию");//
        commandList.put("save ", " сохранить коллекцию в файл");//
        commandList.put("execute_script \"имя файла\" ", " считать и исполнить скрипт из указанного файла. В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме.");
        commandList.put("exit ", " завершить программу (без сохранения в файл)");//
        commandList.put("remove_lower {элемент} ", " удалить из коллекции все элементы, меньшие, чем заданный");//
        commandList.put("replace_if_greater \"ключ\" {элемент} ", " заменить значение по ключу, если новое значение больше старого");//
        commandList.put("replace_if_lower \"ключ\" {элемент} ", " заменить значение по ключу, если новое значение меньше старого");//
        commandList.put("sum_of_number_of_rooms ", " вывести сумму значений поля numberOfRooms для всех элементов коллекции");//
        commandList.put("max_by_transport ", " вывести любой объект из коллекции значение поля transport которого является максимальным");//
        commandList.put("print_ascending ", " вывести элементы коллекции в порядке возрастания");//
        try {
            WriteFileCommand writeFileCommand = new WriteFileCommand();
            writeFileCommand.writeFile();
        }catch (IOException e){
            System.out.println("Файл не найден");
        } catch (ReferenceParser.ParseException e) {
            System.out.println("Что-то не так с внутри этого файла");
        }

        Console console = new Console();
        try{
            while (true){
                console.writeCommand();
            }
        } catch (NoSuchElementException e){
            System.out.println("Выхожу их программы");
            System.exit(0);
        }

    }
}
