public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();

        int weight = 45;
        double growth = 1.57;
        double imt = service.calculate(weight,growth);

        System.out.println("IMT:" + imt);
    }
}