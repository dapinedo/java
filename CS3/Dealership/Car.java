/**
 * Created by dp on 7/20/17.
 */
public class Car extends Object{
    private String mk;
    private double price;
    private int year;
    private String vinNum;


    public Car()
    {

    }
    // designated Constructor
    public Car(String m, double p, int y, String vin)
    {
        mk = m;
        price = p;
        this.setYear(y);
        vinNum = vin;
    }
    public Car(String m,double p)
    {
        this(m,p,0,null);
    }

    public void setMake(String m)
    {
        mk = m;
    }
    public String getMake()
    {
        return mk;
    }
    public void setPrice(double p)
    {
        price = p;
    }
    public double getPrice()
    {
        return price;
    }
    public void setYear(int y)
    {  if(y > 0)
        year = y;
    }
    public String getVinNum()
    {
        return vinNum;
    }

    public String toString()
    {

        return "Make:"  +mk+"\n"
                +"Price:"+ price+"\n"
                +"Year:" + year + "\n"
                +"VinNum:"+vinNum+"\n";
    }





}

