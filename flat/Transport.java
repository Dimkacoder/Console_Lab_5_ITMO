//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package flat;

public enum Transport {
    NONE,
    FEW,
    NORMAL,
    ENOUGH;

    private Transport() {
    }

    public static boolean contains(String transport) {
        if (transport != null && !transport.equals("")) {
            transport = transport.toUpperCase();
            return transport.equals("FEW") || transport.equals("NONE") || transport.equals("NORMAL") || transport.equals("ENOUGH");
        } else {
            return false;
        }
    }

    public static Transport getByName(String transport) {
        transport = transport.toUpperCase();
        byte var2 = -1;
        switch(transport.hashCode()) {
        case -1986416409:
            if (transport.equals("NORMAL")) {
                var2 = 2;
            }
            break;
        case 69496:
            if (transport.equals("FEW")) {
                var2 = 0;
            }
            break;
        case 2402104:
            if (transport.equals("NONE")) {
                var2 = 1;
            }
            break;
        case 2049883504:
            if (transport.equals("ENOUGH")) {
                var2 = 3;
            }
        }

        switch(var2) {
        case 0:
            return FEW;
        case 1:
            return NONE;
        case 2:
            return NORMAL;
        case 3:
            return ENOUGH;
        default:
            return null;
        }
    }

    public static String transportToString() {
        return "FEW, NONE, NORMAL, ENOUGH";
    }
}
