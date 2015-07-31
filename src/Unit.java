/**
 * Created by ishaani on 30/7/15.
 */
public class Unit extends Quantity{

    public Unit(){

    }

    private  double volInBase;

    private static final double CONVERT_TO_TSP = 3;
    private static final double CONVERT_TO_OZ = 0.5;
    private static final double CONVERT_TO_CUP = 0.0625;


    public Unit(double volInBase) {
        this.volInBase = volInBase;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        Unit that = (Unit) o;
        return Double.compare(that.volInBase, volInBase) == 0;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "volInBase=" + volInBase +
                '}';
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(volInBase);
        return (int) (temp ^ (temp >>> 32));
    }

    public  Unit convertToTSP(){
        return new Unit(volInBase *CONVERT_TO_TSP);
    }

    public   Unit convertToOZ(){
        return new Unit(volInBase *CONVERT_TO_OZ);
    }

    public  Unit convertToCup(){
        return new Unit(volInBase *CONVERT_TO_CUP);
    }

    public  Unit convertToTBSP(){
        return new Unit(volInBase);
    }


}
