class TestB {
    public static void main(String [] args) {
        int x = 0;
        int y = 0;

        while (x < 5) {
            // complete here
            y = y + x;

            System.out.print(x + "" + y + " ");  // output: 00 11 23 36 410
            x = x + 1;
        }
    }
}