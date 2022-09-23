/**
 * A class to configure the SnapShop application
 * 
 * @author Richard Dunn
 * @version March 2002
 */

public class SnapShopConfiguration
{
    /**
     * Method to configure the SnapShop.  Call methods like addFilter
     * and setDefaultFilename here.
     * @param theShop The application to configure
     */

    public static void configure(SnapShop theShop)
    {
        theShop.setDefaultFilename("");
        theShop.addFlipHorizontalFilter(new FlipHorizontalFilter());
        theShop.addFlipVerticalFilter(null);
//        theShop.addGrayScale1Filter(null);
//        theShop.addGrayScale2Filter(null);
//        theShop.addGaussianFilter(null);
//        theShop.addLaplacianFilter(null);
//        theShop.addUnsharpMaskingFilter(null);
//        theShop.addEdgyFilter(null);
//        theShop.addRotateClockwiseFilter(null);
//        theShop.addRotateCounterClockwiseFilter(null);
    }

}

