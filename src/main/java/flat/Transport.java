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
        if ("FEW".equals(transport)) {
            return FEW;
        } else if ("NONE".equals(transport)) {
            return NONE;
        } else if ("NORMAL".equals(transport)) {
            return NORMAL;
        } else if ("ENOUGH".equals(transport)) {
            return ENOUGH;
        }
        return null;
    }

    public static String transportToString() {
        return "FEW, NONE, NORMAL, ENOUGH";
    }


}
