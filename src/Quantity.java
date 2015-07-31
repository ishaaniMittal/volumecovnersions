/**
 * Created by ishaani on 30/7/15.
 */
public class Quantity{

    private static final double CONVERT_TO_TSP = 3;
    private static final double CONVERT_TO_OZ = 0.5;
    private static final double CONVERT_TO_CUP = 1/16;

    public Quantity(double value){
        getInUnit(value);
    }

    public Quantity(){

    }
    private Unit getInUnit(double value){

        return new Unit(value);
    }

    public static Quantity tsp(double value){
        return new Quantity(value/CONVERT_TO_TSP);

    }

    public static Quantity oz(double value){
        return new Quantity(value/CONVERT_TO_OZ);
    }

    public static Quantity cup(double value){
        return new Quantity(value/CONVERT_TO_CUP);
    }

    public static Quantity tbsp(double value){
        return new Quantity(value);
    }

}
