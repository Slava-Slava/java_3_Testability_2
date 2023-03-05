public class BmiService {
    public int calculate(double height, double weight) {
        double result = weight / (height * height);
        return (int) result;
    }
}
