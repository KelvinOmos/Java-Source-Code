public class Main {
    public static void main(String[] args) {
        boolean isCar = true;
        boolean wasCar = isCar ? true : false;

        double myDouble = 20.00d;
        double mySecondDouble = 80.00d;
        double totalDouble = (myDouble + mySecondDouble) * 100.00d;
        boolean myBoolean = totalDouble % 40 == 0 ? true : false;

        if(myBoolean ==  false){
            System.out.println("Got some remainder");
        }
        System.out.println("My Total Double is: "+totalDouble);
        System.out.println(myBoolean);
    }
}
