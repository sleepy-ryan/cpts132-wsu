package HW1.RyanGarbutt;

/**
 * Ryan Garbutt
 * CptS 132
 * HW1: Class Tools
 * Spring 2021
 */

public class HW1_ClassTools {
    public static void main(String[] args) {

        //Prints my name
        System.out.println("Ryan Garbutt");
        //Prints interesting fact
        System.out.println("The ISS can orbit the entire earth in about 93 minutes.");

        //Creating strings to compare args to
        String cmdArg1 = "OOP";
        String cmdArg2 = "CptS132";

        //Constructs a string buffer with no characters in it
        StringBuffer cmdArg = new StringBuffer();

        //Args typed in terminal stored in variable newCmdArg as a string
        for (String arg : args) {
            cmdArg.append(arg);
        }
        String newCmdArg = cmdArg.toString();


        //No command
        if (args.length == 0){
            System.out.println("No command-line arguments given.");
        //One command-line argument "OOP"
        } else if (cmdArg1.equals(newCmdArg)){
            System.out.println("The command-line arguments say OOP");
        //Two command-line argument "CptS 132"
        } else if (cmdArg2.equals(newCmdArg)){
            System.out.println("The command-line arguments say CptS 132");
        //Output if none of the cases listed above are met
        } else {
            System.out.println("The command-line arguments are not recognized.");
        }




        }
    }
