public class Notebook {
    int weight, price,year;
    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;

    }
        public void checkPrice(){
            if (this.price < 600){
                System.out.println("This notebook is very cheap");
            }   else if (this.price >= 600 && this.price <= 1000) {
                System.out.println("This notebook has good price");
            }   else {
                System.out.println("Thie notebook is expensive");
            }
        }

        public void checkWeight(){
            if (this.weight < 700){
                System.out.println("This notebook is light");
            }   else if (this.weight >= 700 && this.weight <=1600){
                System.out.println("This notebook is not too heavy");
            }   else {
                System.out.println("This notebook is very heavy");
            }
        }

        public void checkLaptop(){
            if (this.year > 2022 && this.price > 1000 && this.price < 1400){
                System.out.println("Occasion. Buy it!\n");
            }   else if (this.year > 2021 && this.price < 1600){
                System.out.println("Nice notebook in good price\n");
            }   else if (this.year < 2020 && this.price > 1400){
                System.out.println("This notebook is old age\n");
            }   else {
                System.out.println("Be carefull! There is something wrong with this notebook\n");
            }
        }

}
