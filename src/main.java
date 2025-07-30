public class main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double x = 1.87; // рост в метрах
        int y = 98;  // масса в киллограмах
        int bmi = service.calculate(x, y);
        System.out.println(bmi);
    }
}
