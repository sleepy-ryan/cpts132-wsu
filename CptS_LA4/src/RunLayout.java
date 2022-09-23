/**
 * A program to run the Layout class
 *
 * @author Kyle Doty
 * @version January 2018
 */
public class RunLayout
{
    /**
     * A program that runs the Layout class
     * Different cases
     * @param args The command-line arguments
     *             tells which case to run for
     *             the Layout class
     */
    public static void main(String[] args)
    {
        // defines theApp variable
        Layout theApp = new Layout();

        // defines the caseNum String and set the default value
        String caseNum = "1";

        if (args.length == 1)
        {
            // if there is 1 command-line argument
            // use that case number
            caseNum = args[0];
        }

        switch (caseNum)
        {
            case "1":
                theApp = new Layout();
                break;

            case "2":
                theApp = new Layout();
                theApp.useFlowLayout();
                break;

            case "3":
                theApp = new Layout();
                theApp.useFlowLayout();
                theApp.pack();
                break;

            case "4":
                theApp = new Layout();
                theApp.useGridLayout();
                break;

            case "5":
                theApp = new Layout();
                theApp.useBorderLayout();
                break;

            case "6":
                theApp = new Layout();
                theApp.useToolbar();
                break;

            case "7":
                theApp = new Layout();
                theApp.useToolbarII();
                break;

            case "8":
                theApp = new Layout();
                theApp.useCustomLayout();
                break;

            case "9":
                theApp = new Layout();
                theApp.useBoxLayout();
                break;

            case "10a":
                theApp = new Layout();
                theApp.useToolbarII();
                theApp.useGridLayout();
                break;

            case "10b":
                theApp = new Layout();
                theApp.useToolbarII();
                theApp.useFlowLayout();
                break;

            case "11":
                theApp = new Layout();
                theApp.useGridLayout();
                theApp.useBorderLayout();
                break;

            case "12":
                theApp = new Layout();
                theApp.useBorderLayout();
                theApp.showAButton();
                break;

            default:
                System.out.println("Not a valid case.");
                break;
        }
    }
}


