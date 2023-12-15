class TestA {
    public static void main(String [] args) {
        int x = 0;
        int y = 0;

        while (x < 5) {
            // complete here
            y = x - y;

            System.out.print(x + "" + y + " ");  // output: 00 11 21 32 42
            x = x + 1;
        }
    }
}