//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package flat;

public enum Furnish {
    NONE,
    FINE,
    LITTLE;

    private Furnish() {
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
        furnish = furnish.toUpperCase();
        byte var2 = -1;
        switch(furnish.hashCode()) {
        case -1986416409:
            if (furnish.equals("NORMAL")) {
                var2 = 2;
            }
            break;
        case 2158010:
            if (furnish.equals("FINE")) {
                var2 = 1;
            }
            break;
        case 2402104:
            if (furnish.equals("NONE")) {
                var2 = 0;
            }
        }

        switch(var2) {
        case 0:
            return NONE;
        case 1:
            return FINE;
        case 2:
            return LITTLE;
        default:
            return null;
        }
    }

    public static String furnishToString() {
        return "NONE, FINE, LITTLE";
    }
}
