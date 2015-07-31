import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ishaani on 30/7/15.
 */
public class BaseVolumeTest {
/*
    @Test
    public void checkEqualityofTspAndTbsp(){
       Quantity tsp = Quantity.tsp(3);
       Quantity tbsp = Quantity.tbsp(1);
       assertTrue(tsp.equals(tbsp));
    }

    @Test
    public void checkConversionFromTbspToTsp(){
        Quantity tbsp = Quantity.tbsp(3);
        Quantity tsp = tbsp.convertToTSP();
        assertTrue(tsp.equals(new Quantity(9)));

    }

    @Test
    public void checkConversionFromOzToTbsp(){
        Quantity oz = Quantity.oz(1);
        Quantity tbsp = oz.convertToTBSP();
        assertTrue(tbsp.equals(new Quantity(2)));
    }

    @Test
    public void checkConversionFromOzToCup(){
        Quantity oz = Quantity.oz(8);
        Quantity cup = oz.convertToCup();
        System.out.println(oz);
        System.out.println(cup);
        assertTrue(cup.equals(new Quantity(1)));
    }*/

    @Test
    public void checkConversionFromTspToTbsp(){
        Quantity2 tsp = Quantity2.tsp(3);
        System.out.println(tsp);
        assertTrue(tsp.equals(Quantity2.tbsp(1)));

    }

    @Test
    public void checkConversionFromOzToTbsp(){
        Quantity2 oz = Quantity2.oz(1);
        assertTrue(oz.equals(Quantity2.tbsp(2)));
    }

    @Test
    public void chechConversionFromOzToTsp(){
        Quantity2 oz = Quantity2.oz(1);
        assertTrue(oz.equals(Quantity2.tsp(6)));
    }

   /* @Test
    public void checkAdditionOfTbsp(){
        Quantity2 tbsp = Quantity2.tbsp(3);
        System.out.println(tbsp.addQuantityInTbsp(Quantity2.tsp(3)));
       assertTrue(Quantity2.tbsp(4),tbsp.addQuantityInTbsp(Quantity2.tsp(3)));
    }

    @Test
    public void checkAdditionOfTbsp(){
        Quantity2 tbsp = Quantity2.tbsp(3);
        System.out.println(tbsp.addQuantityInTbsp(Quantity2.tsp(3)));
    }*/
}