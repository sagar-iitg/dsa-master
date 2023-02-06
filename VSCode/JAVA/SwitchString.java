public class SwitchString {

    public static void main(String[] args) {

        String ch = "I am ";

        switch (ch) {

            case "a":
                System.out.println("a");
                break;
            case "b":
                System.out.println("b");
                break;
            case "I am ":
                System.out.println("I am");
                break;

            default:
                System.out.println("default");

        }

    }

}
