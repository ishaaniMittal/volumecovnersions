/**
 * Created by ishaani on 30/7/15.
 */
public class Unit2 {



    private  double volInBase;

    private static final double CONVERT_FROM_TSP = 3;
    private static final double CONVERT_FROM_OZ = 0.5;
    private static final double CONVERT_FROM_CUP = 0.0625;




    private static double convertFromTbsp(double value){
        return value;
    }

    private static double convertFromOz(double value){
        return (value/CONVERT_FROM_OZ);
    }

    private static double convertFromCup(double value){
        return (value/CONVERT_FROM_CUP);
    }

    private static double convertFromTSP(double value){
        return (value/CONVERT_FROM_TSP);
    }

    public static double tsp(double value){
        return convertFromTSP(value);

    }

    public static double cup(double value){
        return convertFromCup(value);
    }

    public static double tbsp(double value){
        return convertFromTbsp(value);
    }
    public static double oz(double value){
        return convertFromOz(value);
    }

}
