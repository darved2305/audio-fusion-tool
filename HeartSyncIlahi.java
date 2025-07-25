public class HeartSyncIlahi {

    private static final String[] LYRICS = {
        "Ooh.. Aah..",
        "Ooh.. Aah..",
        "Shaame Malang Si",
        "Raate Surang Si",
        "Baaghi Udaan Pe Hi Na Jaane Kyun",
        "Ilahi Mera Jee Aaye Aaye",
        "Ilahi Mera Jee Aaye Aaye",
        "Da Da Dan Dan Dung Dung Dang...",
        "Kal Pe Sawaal Hai Jeena Filhaal Hai",
        "Khaana Badoshiyon Pe Hi Jaane Kyun",
        "Ilahi Mera Jee Aaye Aaye",
        "Ilahi Mera Jee Aaye Aaye",
        "Brrrooom..."
    };

    private static final int[] DELAYS = {
        4000, 4000, 5000, 5000, 6000, 5000, 5000, 8500, 6000, 6000, 5000, 5000, 3000
    };

    private static final String[] HEART = {
        "        ******       ******        ",
        "      **********   **********      ",
        "    **************************        ",
        "   **************************       ",
        "    ***********************        ",
        "     *********************         ",
        "       *****************           ",
        "         *************             ",
        "           *********               ",
        "             *****                 ",
        "               *                   "
    };

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < LYRICS.length; i++) {
            clearConsole();
            for (String line : HEART) System.out.println(line);
            System.out.println();
            System.out.println(LYRICS[i]);
            Thread.sleep(DELAYS[i]);
        }
    }

    private static void clearConsole() {
        try {
            String os = System.getProperty("os.name").toLowerCase();
            if (os.contains("win")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            System.out.println("\n".repeat(60));
        }
    }
}
