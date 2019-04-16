import java.util.Scanner;

public class Reader {

    public static Scanner scanner = new Scanner(System.in);


    public static String getInput(String requestText){
        System.out.print(requestText);
        return scanner.nextLine();
    }

    public static int getInputInt(String requestText){
        System.out.print(requestText);

        String input = scanner.nextLine();

        while(true){
            if (input.equals("")){
                System.out.print("wrong input, " + requestText);
                input = scanner.nextLine();
            }else{
                return Integer.parseInt(input);
            }
        }


    }

}
