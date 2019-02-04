public class Main {
    public static void main(String[] args) {

        Vehicle myCar = new Vehicle("Honda","Civic",5,29.0);

        System.out.println(myCar.getMake());
        System.out.println(myCar.getModel());
        System.out.println(myCar.getGears());
        System.out.println(myCar.getMileage());

    }
}