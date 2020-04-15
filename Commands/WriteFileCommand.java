//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package Commands;

import MainFiles.Main;
import flat.Flat;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class WriteFileCommand {
    JSONObject jsonFlat;

    public WriteFileCommand() {
    }

    public void writeFile() throws ParseException, IOException {
        JSONParser jsonParser = new JSONParser();
        File file = new File("MainData.json");
        Scanner scanner = new Scanner(file);
        String jsonStr = scanner.nextLine();
        JSONObject jsonAll = (JSONObject)jsonParser.parse(jsonStr);
        JSONArray jsonFLats = (JSONArray)jsonAll.get("FLATS");

        for(int i = 0; i < jsonFLats.size(); ++i) {
            this.jsonFlat = (JSONObject)jsonFLats.get(i);
            JsonDecoder jsonDecoder = new JsonDecoder(this.jsonFlat.toJSONString());
            Integer key = jsonDecoder.getDecodeKey();
            Flat value = jsonDecoder.getDecodeValue();
            Main.flats.put(key, value);
        }

        if (Main.flats.size() == 0) {
            System.out.println("Пустой json");
        } else {
            System.out.println("Значения успешно переданы и готовы к работе");
        }
    }
}
