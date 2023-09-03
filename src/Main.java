public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        int result = service.calculate(98, 1.87);
        System.out.println("Индекс массы тела:" + result);
    }
}
