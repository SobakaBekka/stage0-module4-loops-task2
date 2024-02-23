package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {

        if (power < 0){
            System.out.println("too much power");
        }else{
            int count = 0;//fsfs
            while(count <= power){
                int result = (int) Math.pow(2, count);
                count++;
                System.out.println(result);

            }
        }

    }
}
