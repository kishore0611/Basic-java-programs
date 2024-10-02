import java.util.Scanner;

class SeriesGenerator implements Runnable {
    private int n;

    public SeriesGenerator(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        try {
            generateSeries();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void generateSeries() throws InterruptedException {
        int a = 0;
        int increment = 2;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            a += increment;
            increment += 4;
            step();
        }
    }

    private void step() throws InterruptedException {
        Thread.sleep(1100);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int terms = scanner.nextInt();
        scanner.close();

        SeriesGenerator generator = new SeriesGenerator(terms);
        Thread thread = new Thread(generator);
        thread.start();
    }
}

