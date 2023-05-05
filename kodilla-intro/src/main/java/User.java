public class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        User[] users = new User[5];
        users[0] = new User("Gosia", 28);
        users[1] = new User("Piotr", 40);
        users[2] = new User("Adam", 9);
        users[3] = new User("Rafał", 37);
        users[4] = new User("Glossy", 72);

        double temp = 0;

        for (int i = 0; i < users.length; i++) {
            temp += users[i].age;
        }

        double average = temp/users.length;
        System.out.println("Average age: " + average + "\n");
        System.out.println("Users below the average age:");

        for (int i = 0; i < users.length; i++) {
            if (users[i].age < average){
                System.out.println(users[i].name);
            }
        }







    }
}
