public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 2.02;
        System.out.println("Введите рост в метрах (m): " + height);
        double weight = 98.3;
        System.out.println("Введите вес в кг (kg): " + weight);
        double bodyMassIndex = service.calculate(height, weight);
        System.out.println("Индекс массы тела: " + bodyMassIndex);
    }
}