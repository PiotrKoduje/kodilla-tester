public class Application {
    private String name;
    private double age;
    private double height;

    public Application(String name, double age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    private void checkUser() {
        if (this.name != null){
            if (this.age > 30 && this.height > 160){
                System.out.println("User is older then 30 and taller then 160cm");
            }   else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }

    public static void main(String[] args) {
        Application app = new Application("Adam", 40.5, 178);
        app.checkUser();
    }
}
