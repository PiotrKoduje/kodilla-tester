public class Loops {
    public int getSum(int[] table){         //Liczy sumę elementów tablicy
        int sum = 0;
        for(int i = 0;i < table.length;i++){
            sum += table[i];
        }
        System.out.println("Dochód z całego roku wynosi: " + sum);
        return sum;
    }

    public void printTable(int[] table){        //Drukuje tablicę
        System.out.print("Dochody z poszczególnych miesięcy: [ ");
        for (int i = 0;i < table.length;i++){
            System.out.print(table[i] + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] income = new int[] {7,34,21,7,-6,9,12,14,20,5,23,38};

        Loops loop = new Loops();
        loop.printTable(income);
        loop. getSum(income);
    }
}
