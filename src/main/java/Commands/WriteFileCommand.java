package Commands;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//


import MainFiles.Console;
import MainFiles.Main;
import flat.Flat;
import org.json.simple.parser.JSONParser;
import org.json.simple.*;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class WriteFileCommand {
    JSONObject jsonFlat;
    public WriteFileCommand() {
    }
    public void writeFile() throws ParseException, IOException {
        System.out.println("Введите назввание файла или путь файла, откуда считывать значения");
        Main.pathname = new Scanner(System.in).nextLine();
        if(!Main.pathname.endsWith(".json")){
            System.out.println("Работа ведётся только с json файлами. Отказ");
            return;
        }
        JSONParser jsonParser = new JSONParser();
        File file = new File(Main.pathname);
        Scanner scanner = new Scanner(file);
        String jsonStr = scanner.nextLine();
        JSONObject jsonAll = (JSONObject) jsonParser.parse(jsonStr);
        JSONArray jsonFLats = (JSONArray) jsonAll.get("FLATS");
        for (int i = 0; i < jsonFLats.size(); i++) {
            jsonFlat = (JSONObject) jsonFLats.get(i);
            JsonDecoder jsonDecoder = new JsonDecoder(jsonFlat.toJSONString());
            Integer key = jsonDecoder.getDecodeKey();
            Flat value = jsonDecoder.getDecodeValue();
            Main.flats.put(key,value);
        }
        if (Main.flats.size()==0){
            System.out.println("Пустой json");
            return;
        }
        System.out.println("Значения успешно переданы и готовы к работе");
    }
}
