public class FirstClass {
    public static void main(String[] args) {
        System.out.println("Hello from FirstClass\n\n");

        Notebook notebook = new Notebook(600,1000,2019);
        System.out.println("Notebook weights " + notebook.weight + " and costs " + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkLaptop();

        Notebook heavyNotebook = new Notebook(2000,1500, 2016);
        System.out.println("HeavyNotebook weights " + heavyNotebook.weight + " and costs " + heavyNotebook.price);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkLaptop();

        Notebook oldNotebook = new Notebook(1200,500,2023);
        System.out.println("OldNotebook weights " + oldNotebook.weight + " and costs " + oldNotebook.price);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkLaptop();
    }
}
