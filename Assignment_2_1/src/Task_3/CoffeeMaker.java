package Task_3;

public class CoffeeMaker {

    private boolean isOn;
    private String coffee_type;
    private int coffee_amount;

    public CoffeeMaker()
    {
        isOn = false;
        coffee_type = "normal";
        coffee_amount = 10;
    }

    public void turnOn()
    {
        isOn = true;
    }

    public void turnOff()
    {
        isOn = false;
    }

    public boolean isOn()
    {
        return isOn;
    }

    public void setCoffee_type(String type)
    {
        if (isOn && (type.equalsIgnoreCase("normal") || type.equalsIgnoreCase("espresso")))
        {
            coffee_type = type.toLowerCase();
        }
    }

    public String getCoffee_type()
    {
        return coffee_type;
    }

    public void setCoffee_amount(int amount)
    {
        if (isOn && amount >= 10 && amount <= 80)
        {
            coffee_amount = amount;
        }
    }

    public int getCoffee_amount()
    {
        return coffee_amount;
    }

}
