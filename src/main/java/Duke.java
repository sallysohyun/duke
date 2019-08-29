import java.util.ArrayList;
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

        ArrayList<String> listed = new ArrayList<String>();
        ArrayList<String> marking = new ArrayList<String>();
        String input = "nil";

        while(!input.equals("bye"))
        {
            input = scanner.nextLine();
            String[] splitstring = input.split(" ");

            if (splitstring[0].equals("done"))
            {
                int num = Integer.parseInt(splitstring[1]);
                System.out.println(lines);
                System.out.println("Nice! I've marked this task as done:");

                for(int j=num; j<listed.size(); j++) {
                    marking.set(num-1,"✓");
                    System.out.println("[" + marking.get(num-1) + "] " + listed.get(num-1));
                }
                System.out.println(lines);
                continue;
            }
            if(input.equals("bye"))
            {
                System.out.println(lines);
                System.out.println("Bye. Hope to see you soon!");
                System.out.println(lines);
                break;
            }
            else if (input.equals("list"))
            {
                int arraysize = listed.size();
                System.out.println(lines);
                for(int j=0; j<arraysize; j++)
                {
                    System.out.println((j+1) + ". [" + marking.get(j) +"] "+listed.get(j));
                }
                System.out.println(lines);

            }
            else
            {
                listed.add(input);
                marking.add("✗");
                System.out.println(lines);
                System.out.println("Added: " + input);
                System.out.println(lines);
            }
        }
    }

}