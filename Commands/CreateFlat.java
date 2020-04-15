//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package Commands;

import MainFiles.Console;
import flat.Flat;
import java.util.Scanner;

public class CreateFlat {
    Scanner scanner;
    private Flat newFlat;

    CreateFlat() {
        this.scanner = Console.sc;
        this.newFlat = new Flat();
    }

    public Flat getNewFlat() {
        boolean iter;
        for(iter = false; !iter; iter = this.newName()) {
            System.out.println("Введите название элемента");
        }

        for(iter = false; !iter; iter = this.newCoordinate()) {
            System.out.println("Введите координаты дома(x и y)");
        }

        for(iter = false; !iter; iter = this.newArea()) {
            System.out.println("Введите площадь");
        }

        for(iter = false; !iter; iter = this.newNumbersOfRooms()) {
            System.out.println("Введите количество комнат");
        }

        for(iter = false; !iter; iter = this.newNewOrNot()) {
            System.out.println("Ваш дом новый или старый?");
        }

        for(iter = false; !iter; iter = this.newTransport()) {
            System.out.println("Какое количество транспорта?");
        }

        for(iter = false; !iter; iter = this.newFurnish()) {
            System.out.println("Какая мебель?");
        }

        for(iter = false; !iter; iter = this.newHouse()) {
            System.out.println("Введите название дома, год постройки и количество этажей (через запятую+пробел)");
        }

        return this.newFlat;
    }

    private boolean newHouse() {
        String[] strings = this.scanner.nextLine().split(" ");

        try {
            if (!NotEnough.checkParametrs(strings, 3)) {
                throw new NumberFormatException();
            } else {
                String houseName = strings[0];
                Long houseYear = Long.parseLong(strings[1]);
                Long numberOfFloors = Long.parseLong(strings[2]);
                if (houseName.trim().length() != 0 && houseYear > 0L && houseYear <= 155L && numberOfFloors > 0L) {
                    this.newFlat.setHouse(houseName, houseYear, numberOfFloors);
                    return true;
                } else {
                    throw new NumberFormatException();
                }
            }
        } catch (NumberFormatException var5) {
            System.out.println("Введите название(в одно слово) и два положительных числа. Первое число до 155");
            return false;
        }
    }

    private boolean newFurnish() {
        String[] strings = this.scanner.nextLine().split(" ");
        if (!NotEnough.checkParametrs(strings, 1)) {
            return false;
        } else {
            String condition = "";
            String var3 = strings[0];
            byte var4 = -1;
            switch(var3.hashCode()) {
            case -1186681200:
                if (var3.equals("Хорошая")) {
                    var4 = 8;
                }
                break;
            case 1046410:
                if (var3.equals("Нет")) {
                    var4 = 3;
                }
                break;
            case 1077162:
                if (var3.equals("нет")) {
                    var4 = 2;
                }
                break;
            case 32439596:
                if (var3.equals("Нема")) {
                    var4 = 5;
                }
                break;
            case 32439801:
                if (var3.equals("Нету")) {
                    var4 = 1;
                }
                break;
            case 33392908:
                if (var3.equals("нема")) {
                    var4 = 4;
                }
                break;
            case 33393113:
                if (var3.equals("нету")) {
                    var4 = 0;
                }
                break;
            case 104855740:
                if (var3.equals("маленькая")) {
                    var4 = 6;
                }
                break;
            case 1175200491:
                if (var3.equals("Пойдёт")) {
                    var4 = 11;
                }
                break;
            case 1443632816:
                if (var3.equals("хорошая")) {
                    var4 = 9;
                }
                break;
            case 2091333323:
                if (var3.equals("пойдёт")) {
                    var4 = 10;
                }
                break;
            case 2108823708:
                if (var3.equals("Маленькая")) {
                    var4 = 7;
                }
            }

            switch(var4) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                condition = "NONE";
                break;
            case 6:
            case 7:
                condition = "LITTLE";
                break;
            case 8:
            case 9:
            case 10:
            case 11:
                condition = "FINE";
                break;
            default:
                System.out.println("Хорошая, маленькая или нету?");
                return false;
            }

            this.newFlat.setFurnish(condition);
            return true;
        }
    }

    private boolean newTransport() {
        String[] strings = this.scanner.nextLine().split(" ");
        if (!NotEnough.checkParametrs(strings, 1)) {
            return false;
        } else {
            String condition = "";
            String var3 = strings[0];
            byte var4 = -1;
            switch(var3.hashCode()) {
            case -1361493385:
                if (var3.equals("нормуль")) {
                    var4 = 16;
                }
                break;
            case -1170091449:
                if (var3.equals("Достаточно")) {
                    var4 = 10;
                }
                break;
            case -738629211:
                if (var3.equals("Нормально")) {
                    var4 = 15;
                }
                break;
            case -681396911:
                if (var3.equals("маловато")) {
                    var4 = 8;
                }
                break;
            case -647590850:
                if (var3.equals("Хвататет")) {
                    var4 = 12;
                }
                break;
            case -616752783:
                if (var3.equals("Маловато")) {
                    var4 = 9;
                }
                break;
            case 1046410:
                if (var3.equals("Нет")) {
                    var4 = 3;
                }
                break;
            case 1077162:
                if (var3.equals("нет")) {
                    var4 = 2;
                }
                break;
            case 32404983:
                if (var3.equals("Мало")) {
                    var4 = 7;
                }
                break;
            case 32439596:
                if (var3.equals("Нема")) {
                    var4 = 5;
                }
                break;
            case 32439801:
                if (var3.equals("Нету")) {
                    var4 = 1;
                }
                break;
            case 33358295:
                if (var3.equals("мало")) {
                    var4 = 6;
                }
                break;
            case 33392908:
                if (var3.equals("нема")) {
                    var4 = 4;
                }
                break;
            case 33393113:
                if (var3.equals("нету")) {
                    var4 = 0;
                }
                break;
            case 303159895:
                if (var3.equals("Нормуль")) {
                    var4 = 17;
                }
                break;
            case 1085402910:
                if (var3.equals("хватает")) {
                    var4 = 13;
                }
                break;
            case 1131410983:
                if (var3.equals("достаточно")) {
                    var4 = 11;
                }
                break;
            case 1552370117:
                if (var3.equals("нормально")) {
                    var4 = 14;
                }
            }

            switch(var4) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                condition = "NONE";
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                condition = "FEW";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                condition = "ENOUGH";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                condition = "NORMAL";
                break;
            default:
                System.out.println("Достаточно, нормально, мало или нет?");
                return false;
            }

            this.newFlat.setTransport(condition);
            return true;
        }
    }

    private boolean newCoordinate() {
        String[] strings = this.scanner.nextLine().split(" ");
        if (!NotEnough.checkParametrs(strings, 2)) {
            return false;
        } else {
            Float x;
            Float y;
            try {
                x = Float.parseFloat(strings[0]);
                y = Float.parseFloat(strings[1]);
            } catch (NumberFormatException var5) {
                System.out.println("Введите число!");
                return false;
            }

            this.newFlat.setCoordinates(x, y);
            return true;
        }
    }

    private boolean newArea() {
        String[] strings = this.scanner.nextLine().split(" ");
        if (!NotEnough.checkParametrs(strings, 1)) {
            return false;
        } else {
            Integer area;
            try {
                area = Integer.parseInt(strings[0]);
                if (area <= 0) {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException var4) {
                System.out.println("Введите положительное целое число!");
                return false;
            }

            this.newFlat.setArea(area);
            return true;
        }
    }

    private boolean newNumbersOfRooms() {
        String[] strings = this.scanner.nextLine().split(" ");
        if (!NotEnough.checkParametrs(strings, 1)) {
            return false;
        } else {
            Long number;
            try {
                number = Long.parseLong(strings[0]);
                if (number <= 0L || number > 10L) {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException var4) {
                System.out.println("Введите положительное целое число до 10-ти!");
                return false;
            }

            this.newFlat.setNumberOfRooms(number);
            return true;
        }
    }

    private boolean newNewOrNot() {
        String[] strings = this.scanner.nextLine().split(" ");
        if (!NotEnough.checkParametrs(strings, 1)) {
            return false;
        } else {
            String var2 = strings[0];
            byte var3 = -1;
            switch(var2.hashCode()) {
            case -2142938369:
                if (var2.equals("старый")) {
                    var3 = 5;
                }
                break;
            case 78208:
                if (var2.equals("New")) {
                    var3 = 1;
                }
                break;
            case 79367:
                if (var2.equals("Old")) {
                    var3 = 3;
                }
                break;
            case 108960:
                if (var2.equals("new")) {
                    var3 = 0;
                }
                break;
            case 110119:
                if (var2.equals("old")) {
                    var3 = 2;
                }
                break;
            case 1005887903:
                if (var2.equals("Новый")) {
                    var3 = 6;
                }
                break;
            case 1035440575:
                if (var2.equals("новый")) {
                    var3 = 7;
                }
                break;
            case 1235896095:
                if (var2.equals("Старый")) {
                    var3 = 4;
                }
            }

            switch(var3) {
            case 0:
            case 1:
            case 2:
            case 3:
                System.out.println("По-рузски");
                return false;
            case 4:
            case 5:
                this.newFlat.setNewOrNot(false);
                break;
            case 6:
            case 7:
                this.newFlat.setNewOrNot(true);
                break;
            default:
                System.out.println("Старый или новый?(одно слово)");
                return false;
            }

            return true;
        }
    }

    private boolean newName() {
        String Name = this.scanner.nextLine();
        if (Name.trim().length() == 0) {
            System.out.println("Вы не назвали(пустая строка)");
            return false;
        } else {
            String[] words = Name.split(" ");
            if (words.length > 1) {
                System.out.println("Назовите одним словом, пожалуйста");
                return false;
            } else {
                this.newFlat.setName(Name);
                return true;
            }
        }
    }
}
