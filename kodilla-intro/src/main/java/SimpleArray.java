
    public class SimpleArray {
        public static void main(String[] args) {
            String[] animals = new String[7];

            animals[0] = "kuropatwy";
            animals[1] = "bażanty";
            animals[2] = "dzikie kaczki";
            animals[3] = "gęsi";
            animals[4] = "łyski";
            animals[5] = "cietrzewie";
            animals[6] = "bekasy";

            String animal = animals[3];
            System.out.println(animal);

            int numberOfElements = animals.length;

            System.out.println("Moja tablica zawiera " + numberOfElements + " elementów");
        }
}
