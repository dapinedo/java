/**
 * Created by dp on 7/20/17.
 */
public class SalesPerson
{
    private String name;
    private double bonus;

    public SalesPerson(String n)
    {
        name = n;
    }

    public void setBonus(double b)
    {
        bonus+= b;
    }

    public double getBonus()
    {
        return bonus;
    }

    @Override
    public String toString()
    {
        return "Sales Person Name: "+name+"\n"
                +"Bonus:"+bonus+"\n";
    }
}

