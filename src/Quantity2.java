/**
 * Created by ishaani on 30/7/15.
 */
public class Quantity2 {

    private  double value;

    private static final double CONVERT_TO_TSP = 3;
    private static final double CONVERT_TO_OZ = 0.5;
    private static final double CONVERT_TO_CUP = 1/16;


    public Quantity2(double value){
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public  Quantity2 addQuantityInTbsp(Quantity2 quantity){
        Quantity2 addition = new Quantity2(this.getValue()+quantity.getValue());
        return addition;
    }

    public static Quantity2 tsp(double value){
        return new Quantity2(Unit2.tsp(value));

    }

    public static Quantity2 oz(double value){
        return new Quantity2(Unit2.oz(value));
    }

    public static Quantity2 cup(double value){
        return new Quantity2(Unit2.cup(value));
    }

    public static Quantity2 tbsp(double value){
        return new Quantity2(Unit2.tbsp(value));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        Quantity2 quantity2 = (Quantity2) o;
        return Double.compare(quantity2.value, value) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(value);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return ""+value;
    }
}
