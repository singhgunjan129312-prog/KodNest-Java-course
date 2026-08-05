public class pr1{

    public static void main(String[] args) {

        int day = 6;

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Learning Day");
                break;

            case 6:
            case 7:
                System.out.println("Revision Day");
                break;

            default:
                System.out.println("Invalid Day");
                break;
        }
    }
}
