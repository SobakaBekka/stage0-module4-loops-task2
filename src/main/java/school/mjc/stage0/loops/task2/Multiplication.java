package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {

        int number = 0;
        if (multiplyByAndToInclusive >= 0) {
            while (number <= multiplyByAndToInclusive) {
                System.out.println(number * number);
                number++;
            }
        } else {
            while (number >= multiplyByAndToInclusive) {
                System.out.println(number * number);
                number--;

            }
        }
    }
}