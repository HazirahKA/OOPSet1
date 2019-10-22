import javax.swing.*;
import java.awt.*;

public class Q2 {
    public static void main(String[] args) {
        int inches=0;
        String data="";

        JTextArea textArea = new JTextArea(15,30);

        Font textAreaFont = new Font("monospaced",Font.PLAIN,12);
        textArea.setFont(textAreaFont);

        textArea.setText(String.format("%-25s%-15s\n%-25s%-15s\n",
                                        "Yards","Inches",
                                         "----------","----------"));

        for(int i=1; i<=10; i++)
        {
            inches=i*36;

            data += String.format("%-25d%-15d\n",i,inches);
        }

        textArea.append(data);

        JOptionPane.showMessageDialog(null,textArea,"Yards & Inches",JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
