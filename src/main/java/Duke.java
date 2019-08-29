import java.util.Scanner;

public class Duke
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println("Hello from\n" + logo);

        String lines = "________________________________________";

        System.out.println("Hello! I'm Duke\n" +
                "What can I do for you?");
        System.out.println(lines);

        String input = "nil";
        while(!input.equals("bye"))
        {
            input = scanner.nextLine();
            if(input.equals("bye"))
            {
                System.out.println(lines);
                System.out.println("Bye. Hope to see you soon!");
                System.out.println(lines);
                break;
            }
            else
            {
                System.out.println(lines);
                System.out.println(input);
                System.out.println(lines);
            }
        }
    }

}
