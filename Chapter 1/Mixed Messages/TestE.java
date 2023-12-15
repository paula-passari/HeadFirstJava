class TestE {
    public static void main(String [] args) {
        int x = 0;
        int y = 0;

        while (x < 5) {
            // complete here
            if (x < 5) {
                x = x + 1;
                if (y < 3) {
                    x = x - 1;
                }
            }
            y = y + 2;
            
            System.out.print(x + "" + y + " ");  // output: 02 14 36 58
            x = x + 1;
        }
    }
}