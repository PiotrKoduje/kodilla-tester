public class Colours {
    public static void main(String[] args) {

        enum colours {
            White,
            Blue,
            Yellow,
            Green
        }

        boolean flag = true;
        while (flag){
        char letterOfColour = UserDialogs.getChar();

        switch (letterOfColour) {
            case 'W':
                System.out.println("You chose " + colours.White);
                flag = false;
                break;
            case 'B':
                System.out.println("You chose " + colours.Blue);
                flag = false;
                break;
            case 'Y':
                System.out.println("You chose " + colours.Yellow);
                flag = false;
                break;
            case 'G':
                System.out.println("You chose " + colours.Green);
                flag = false;
                break;
            default:
                System.out.println("Wrong sign! Try again");
        }
        }
    }
}
