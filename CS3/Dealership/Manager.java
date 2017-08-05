/**
 * Created by dp on 7/20/17.
 */
public class Manager
{
    private String name;

    public Manager(String n)
    {
        name = n;
    }
    @Override
    public String toString()
    {
        return "Manager Name: "+name+"\n";
    }
}
