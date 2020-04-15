//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package Commands;

import flat.Coordinates;
import flat.Flat;
import flat.Furnish;
import flat.House;
import flat.Transport;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonDecoder {
    private JSONObject jsonFlat;
    private Flat decodeValue;
    private Integer decodeKey;

    JsonDecoder(String jsonFlat) {
        try {
            JSONParser parser = new JSONParser();
            this.jsonFlat = (JSONObject)parser.parse(jsonFlat);
        } catch (ParseException var3) {
            System.out.println("Что-то не так с json строкой");
        } catch (ClassCastException var4) {
            System.out.println("Не издевайтесь над строкой");
        }

    }

    public Integer getDecodeKey() {
        this.decodeKey = this.getInteger("key");
        return this.decodeKey;
    }

    public Flat getDecodeValue() {
        Long id = this.getLong("id");
        String nameFlat = this.getString("name");
        Float x = this.getFloat("coordinate_x");
        Float y = this.getFloat("coordinate_y");
        Coordinates coordinates = new Coordinates(x, y);
        Integer area = this.getInteger("area");
        Long number_of_rooms = this.getLong("number_of_rooms");
        Furnish furnish = Furnish.getByName(this.getString("furnish"));
        Boolean new_or_not = this.getBoolean("new_or_not");
        Transport transport = Transport.getByName(this.getString("transport"));
        String house_name = this.getString("house_name");
        Long house_year = this.getLong("house_year");
        Long house_number_of_floors = this.getLong("house_number_of_floors");
        House house = new House(house_name, house_year, house_number_of_floors);
        Integer year = this.getInteger("year");
        Integer month = this.getInteger("month");
        Integer day = this.getInteger("day");
        Integer hour = this.getInteger("hour");
        Integer minute = this.getInteger("minute");
        Integer second = this.getInteger("second");
        Integer nano = this.getInteger("nano");
        ZoneId zoneId = ZoneId.of(this.getString("zone"));
        ZonedDateTime creationDate = ZonedDateTime.of(year, month, day, hour, minute, second, nano, zoneId);
        this.decodeValue = new Flat(id, nameFlat, coordinates, creationDate, area, number_of_rooms, new_or_not, furnish, transport, house);
        return this.decodeValue;
    }

    public Flat getDecodeValueWithoutId() {
        String nameFlat = this.getString("name");
        Float x = this.getFloat("coordinate_x");
        Float y = this.getFloat("coordinate_y");
        Coordinates coordinates = new Coordinates(x, y);
        Integer area = this.getInteger("area");
        Long number_of_rooms = this.getLong("number_of_rooms");
        Furnish furnish = Furnish.getByName(this.getString("furnish"));
        Boolean new_or_not = this.getBoolean("new_or_not");
        Transport transport = Transport.getByName(this.getString("transport"));
        String house_name = this.getString("house_name");
        Long house_year = this.getLong("house_year");
        Long house_number_of_floors = this.getLong("house_number_of_floors");
        House house = new House(house_name, house_year, house_number_of_floors);
        Integer year = this.getInteger("year");
        Integer month = this.getInteger("month");
        Integer day = this.getInteger("day");
        Integer hour = this.getInteger("hour");
        Integer minute = this.getInteger("minute");
        Integer second = this.getInteger("second");
        Integer nano = this.getInteger("nano");
        ZoneId zoneId = ZoneId.of(this.getString("zone"));
        ZonedDateTime creationDate = ZonedDateTime.of(year, month, day, hour, minute, second, nano, zoneId);
        this.decodeValue = new Flat(nameFlat, coordinates, creationDate, area, number_of_rooms, new_or_not, furnish, transport, house);
        return this.decodeValue;
    }

    private String getString(String key) {
        return (String)this.jsonFlat.get(key);
    }

    private Long getLong(String key) {
        return Long.parseLong(this.jsonFlat.get(key).toString());
    }

    private Boolean getBoolean(String key) {
        return (Boolean)this.jsonFlat.get(key);
    }

    private Float getFloat(String key) {
        return Float.parseFloat(this.jsonFlat.get(key).toString());
    }

    private Integer getInteger(String key) {
        return Integer.parseInt(this.jsonFlat.get(key).toString());
    }
}
