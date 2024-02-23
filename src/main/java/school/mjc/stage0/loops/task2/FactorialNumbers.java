package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {

        int faktorial;
        int number = 1;
        int count;
        while (number <= printToInclusive){
            faktorial = 1;
            count = 1;//f
            while (count <= number){
                faktorial *= count;
                count++;
            }
            System.out.println(faktorial);
            number++;
        }

    }
}
