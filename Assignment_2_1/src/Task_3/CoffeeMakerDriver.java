package Task_3;

public class CoffeeMakerDriver {
    public  static void main(String[] args)
    {
        CoffeeMaker coff_Maker = new CoffeeMaker();

        coff_Maker.turnOn();
        System.out.println("Coffee maker is on");

        coff_Maker.setCoffee_type("espresso");
        System.out.println("Coffee type is " + coff_Maker.getCoffee_type());

        coff_Maker.setCoffee_amount(50);
        System.out.println("Coffee amount is " + coff_Maker.getCoffee_amount());

        coff_Maker.turnOff();
        System.out.println("Coffee maker is off");
    }
}
