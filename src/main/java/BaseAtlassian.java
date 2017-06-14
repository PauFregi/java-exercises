public class BaseAtlassian {
    static int BASE = 7;
    static char[] REALM = new char[]{'0', 'a', 't', 'l', 's', 'i', 'n'};

    public static String convert(long number) {
        long div = number / BASE;
        int rest = (int)(number % BASE);

        if (div == 0)
            return String.valueOf(REALM[rest]);
        else
            return convert(div) + REALM[rest];
    }
}
