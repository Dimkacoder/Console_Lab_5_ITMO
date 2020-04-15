//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package Commands;

import MainFiles.Main;
import flat.Flat;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.Map.Entry;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class SaveCommand extends Command {
    public SaveCommand() {
    }

    public void execute(Object o) {
        JSONArray toFileArray = new JSONArray();
        Iterator iterator = Main.flats.entrySet().iterator();

        while(iterator.hasNext()) {
            JSONObject toJsonArrayObj = new JSONObject();
            Entry<Integer, Flat> pair = (Entry)iterator.next();
            Flat valueFromPair = (Flat)pair.getValue();
            ZonedDateTime dateTime = valueFromPair.getCreationDate();

            try {
                toJsonArrayObj.put("key", pair.getKey());
                toJsonArrayObj.put("name", valueFromPair.getName());
                toJsonArrayObj.put("id", valueFromPair.getId());
                toJsonArrayObj.put("coordinate_x", valueFromPair.getCoordinates().getX());
                toJsonArrayObj.put("coordinate_y", valueFromPair.getCoordinates().getY());
                toJsonArrayObj.put("area", valueFromPair.getArea());
                toJsonArrayObj.put("number_of_rooms", valueFromPair.getNumberOfRooms());
                toJsonArrayObj.put("furnish", valueFromPair.getFurnish().toString());
                toJsonArrayObj.put("new_or_not", valueFromPair.getNewOrNot());
                toJsonArrayObj.put("transport", valueFromPair.getTransport().toString());
                toJsonArrayObj.put("house_name", valueFromPair.getHouse().getName());
                toJsonArrayObj.put("house_year", valueFromPair.getHouse().getYear());
                toJsonArrayObj.put("house_number_of_floors", valueFromPair.getHouse().getNumberOfFloors());
                toJsonArrayObj.put("year", dateTime.getYear());
                toJsonArrayObj.put("month", dateTime.getMonthValue());
                toJsonArrayObj.put("day", dateTime.getDayOfMonth());
                toJsonArrayObj.put("hour", dateTime.getHour());
                toJsonArrayObj.put("minute", dateTime.getMinute());
                toJsonArrayObj.put("second", dateTime.getSecond());
                toJsonArrayObj.put("nano", dateTime.getNano());
                toJsonArrayObj.put("zone", dateTime.getZone().toString());
                toFileArray.add(toJsonArrayObj);
            } catch (Exception var11) {
                System.out.println("Какое-то поле не заполнено");
            }
        }

        try {
            File finalFile = new File("MainData.json");
            FileWriter writer = new FileWriter(finalFile);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("{\"FLATS\":" + toFileArray.toJSONString() + " }");
            bufferedWriter.close();
            System.out.println("Сохранено");
        } catch (FileNotFoundException var9) {
            System.out.println("File not found!");
        } catch (IOException var10) {
            var10.printStackTrace();
        }

    }
}
