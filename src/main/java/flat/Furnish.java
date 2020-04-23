package flat;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
public enum Furnish {
    NONE,
    FINE,
    LITTLE;

    Furnish() {
    }

    public static boolean contains(String furnish) {
        if (furnish != null && !furnish.equals("")) {
            furnish = furnish.toUpperCase();
            return furnish.equals("NONE") || furnish.equals("FINE") || furnish.equals("LITTLE");
        } else {
            return false;
        }
    }

    public static Furnish getByName(String furnish) {

        if ("NONE".equals(furnish)) {
            return NONE;
        } else if ("FINE".equals(furnish)) {
            return FINE;
        } else if ("LITTLE".equals(furnish)) {
            return LITTLE;
        }
        return null;
    }

    public static String furnishToString() {
        return "NONE, FINE, LITTLE";
    }
}
