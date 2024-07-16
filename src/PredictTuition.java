public class PredictTuition {
    public static void main(String[] args) {
        double initialTuition = 10000;
        double targetTuition = 20000;
        double annualIncreaseRate = 0.07;
        double tuition = initialTuition;
        int year = 0;


        while (tuition < targetTuition) {
            tuition *= (1 + annualIncreaseRate);
            year++;
        }

        // Output the result
        System.out.printf("Tuition will be doubled in %d years.\n", year);
    }
}