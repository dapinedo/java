/**
 *
 * @author adehkhoda
 */
public class Die {
    private int face;
    private String color = "Black";

    public Die()
    {
    }
    public Die(String c)
    {
        color = c;
    }
    public void setColor(String c)
    {
        color = c;
    }
    public String getColor()
    {
        return color;
    }
    public Die rollDie()
    {
        face =(int)(Math.random()* (6-1+1))+1;
        return this;
    }
    public int getFace()
    {
        return face;
    }
    public void setFace(int f)
    {
        face = f;
    }
    // always write the following method for any
    // class you write

    public String toString()
    {
        return "Color:"+color+"\n"
                +"Face:"+ face+"\n";
    }
}


