class TestC {
    public static void main(String [] args) {
        int x = 0;
        int y = 0;

        while (x < 5) {
            // complete here
            y = y + 2;
            if (y > 4) {
                y = y - 1;
            }

            System.out.print(x + "" + y + " ");  // output: 02 14 25 36 47
            x = x + 1;
        }
    }
}