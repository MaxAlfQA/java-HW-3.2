public class main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.87; // рост в метрах
        int weight = 98;  // масса в киллограмах
        int bmi = service.calculate(height, weight);
        System.out.println(bmi);
    }
}
