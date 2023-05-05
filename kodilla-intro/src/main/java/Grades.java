public class Grades {
    private int[] grades;
    private int size;
    private double average;

    public Grades(){
        this.grades = new int[10];
        this.size = 0;
    }
    public void add (int value){
        if (this.size == 10){
            return;
        }
        this.grades[this.size] = value;
        this.size++;
        System.out.println("Grade: " + value + " added.");
    }

    public int getLastGrade(){
        System.out.println("Last grade: " + this.grades[this.size - 1]);
        return this.grades[this.size];
    }

    public double getAverage(){
        double temp = 0;
        for (int i = 0;i < this.grades.length;i++){
            temp += this.grades[i];
        }
        System.out.println("Average: " + temp/this.size);
        return temp/this.size;
    }

    public static void main(String[] args) {
        Grades test = new Grades();
        test.add(3);
        test.add(4);
        test.getLastGrade();
        test.getAverage();
        test.add(5);
        test.getLastGrade();
        test.getAverage();
    }
}
