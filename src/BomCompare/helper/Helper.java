package BomCompare.helper;


public class Helper {
    public static String removePrefix(String prefix, String s) {
        return s.replaceAll(prefix, "");
    }
}
