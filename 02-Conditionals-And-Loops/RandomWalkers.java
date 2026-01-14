public class RandomWalkers {

    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        double total_steps = 0;

        for (int i = 1; i <= trials; i++) {
            int steps = 0;
            int x = 0;
            int y = 0;

            while (Math.abs(x) + Math.abs(y) < r) {
                int direction = (int) ( Math.random()* 4);
                
                if (direction == 0) x++;
                else if (direction == 1) x--;
                else if (direction == 2) y++;
                else y--;

                steps++;
            }
            total_steps += steps;
        }

        double average = total_steps / trials;
        System.out.printf("average number of steps = %f\n", average);
    }
}