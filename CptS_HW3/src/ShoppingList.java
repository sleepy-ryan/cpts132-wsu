public class ShoppingList {

    private java.util.Scanner scan;
    // declare storage for the list items
    String groceryList[];
    int counter;

    public ShoppingList() {
        scan = new java.util.Scanner(System.in);
        // initialize storage for list items
        counter = 0;
        groceryList = new String[10];
    }

    public void printList() {
        System.out.println("Your shopping list:");
        for (int i = 0; i < counter; i++) {
            System.out.println(groceryList[i]);
        }

        }

    public void addToList(String item) {
        // add item to the list
        new ShoppingList();
        boolean flag = duplicateItem(item);
        if (counter < 10) {
            if (flag == false){
                groceryList[counter] = item;
                counter++;
            }
        } else {
            System.out.println(item + " not added to list because list is full.");
        }

    }

    public void emptyList() {
        // empty the list
        groceryList = new String[10];
        counter = 0;
    }

    public boolean duplicateItem(String item) {

        for (int i = 0; i < counter; i++) {
            //System.out.println(groceryList[i]);
            if (groceryList[i].equals(item)) {
                System.out.println(item + " is a duplicate. Cannot add to the list.");
                return true;
            }
        }
        return false;
    }

    public String getInput() {
        System.out.print("Enter your item or command: ");
        return scan.next().trim();
    }

    public void printWelcome() {
        System.out.println("Welcome to the XYZ Shopping List Program.");
    }

    public void printThankYou() {
        System.out.println("Thank you for using the XYZ Shopping List Program.");
    }

    public void printHelp() {
        System.out.println("Here are the list of commands:");
        System.out.println("  -p : Print the list");
        System.out.println("  -e : Empty the list");
//      System.out.println("  -r n : Remove the nth item from the list");
//      System.out.println("  -r Xxx : Remove item Xxx from the list");
        System.out.println("  -x : Exit the application");
        System.out.println("  -h : Print this command list");
    }

    public void go() {
        String input;

        printWelcome();
        printHelp();
        input = getInput();
        while (!input.equals("-x")) {
            switch (input) {
                case "-h":
                    printHelp();
                    break;
                case "-p":
                    printList();
                    break;
                case "-x":
                    break;
                case "-e":
                    emptyList();
                    break;
                default:
                    addToList(input);
            }
            input = getInput();
        }
        printThankYou();
    }

    public static void main(String[] args) {
        ShoppingList list;

        list = new ShoppingList();
        list.go();
    }
}
