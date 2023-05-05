import java.util.Random;
public class RandomNumbers {
    Random rand = new Random();
    int min = 30, max = 0, sum = 0, iterations = 0;

    int getNumber(){
        int temp = this.rand.nextInt(31);
        return temp;
    }
    int getMax(int candidate){
        if (candidate > this.max){
            this.max = candidate;
            return candidate;
        }
        return 0;
    }
    int getMin(int candidate){
        if (candidate < this.min){
            this.min = candidate;
            return candidate;
        }
        return 0;
    }

    public static void main(String[] args) {

        RandomNumbers randomNumbers = new RandomNumbers();

        while (randomNumbers.sum < 5000) {
            int temp = randomNumbers.getNumber();
            System.out.println(temp);
            randomNumbers.sum += temp;
            randomNumbers.getMax(temp);
            randomNumbers.getMin(temp);
            randomNumbers.iterations++;
        }
        System.out.println("Max: " + randomNumbers.max);
        System.out.println("Min: " + randomNumbers.min);
        System.out.println("Number of iterations: " + randomNumbers.iterations);
    }
}
