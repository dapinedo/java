import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;

/**
 * @author dp
 */
public class MyIO {

    /* does not allow creation of  new object when calling methods from this class. Calls class by reference. */
    private MyIO() {

    }

    public static void display(String s) {
        // designated constructor
        Font f = new Font("times new roman",
                Font.BOLD + Font.ITALIC, 38);

        JTextArea jt = new JTextArea(15, 20);
        jt.setBackground(Color.BLACK);
        jt.setForeground(Color.WHITE);
        jt.setFont(f);
        jt.setText(s);
        JScrollPane sr = new JScrollPane(jt);
        JOptionPane.showMessageDialog(null, sr);
    }

    public static void display(String s, Color bg, Color fg) {
        // designated constructor with foreground and background color choices
        Font f = new Font("times new roman", Font.BOLD + Font.ITALIC, 38);

        JTextArea jt = new JTextArea(15, 20);
        jt.setBackground(bg);
        jt.setForeground(fg);
        jt.setFont(f);
        jt.setText(s);
        JScrollPane sr = new JScrollPane(jt);
        JOptionPane.showMessageDialog(null, sr);
    }

    public static int getInt(String s) {
        boolean ok = false;
        String strNum = "";
        int n1;

        while (!ok) {
            try{
                strNum = JOptionPane.showInputDialog(s);
                n1 = Integer.parseInt(strNum);;
                ok = true;
            }catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, strNum + "it is not integer, please try again");
            }

        }
        strNum = JOptionPane.showInputDialog(s);
        n1 = Integer.parseInt(strNum);
        return n1;
    }
}

