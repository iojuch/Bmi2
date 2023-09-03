public class BmiService {

    public int calculate(int bodyWeight, double height) {

        double index = bodyWeight / Math.pow(height, 2);
        int result = (int) index;

        return (result);
    }
}
