//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package Commands;

public class NotEnough {
    public NotEnough() {
    }

    public static boolean checkParametrs(String[] strings, int a) {
        if (strings.length != a) {
            System.out.println("Неверное число параметров. Нужно " + a);
            return false;
        } else {
            return true;
        }
    }

    public static boolean checkParametrs(String[] strings, int a, int b) {
        if (strings.length >= a && strings.length <= b) {
            return true;
        } else {
            System.out.println("Неверное число параметров. Нужно от " + a + " до " + b);
            return false;
        }
    }
}
