class TestD {
    public static void main(String [] args) {
        int x = 0;
        int y = 0;

        while (x < 5) {
            // complete here
            x = x + 1;
            y = y + x;

            System.out.print(x + "" + y + " ");  // output: 11 34 59
            x = x + 1;
        }
    }
}