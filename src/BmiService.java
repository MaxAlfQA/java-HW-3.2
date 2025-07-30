public class BmiService {
    public int calculate(double a, int b) {
        int result;
        result = (int) (b / (a * a));
        return result;
    }
}
