import javax.swing.*;

public class Q4 {
    public static void main(String[] args)
    {
        String fullN;

        fullN = JOptionPane.showInputDialog("Enter your full name: ");

        String fullNWithoutSpace = fullN.replaceAll("\\s", "");
        int nameLength=fullNWithoutSpace.length();
        char firstNInitial = fullN.charAt(0);
        int end = fullN.lastIndexOf(' ');
        String lastName=" ";

        lastName = fullN.substring(end + 1, fullN.length());


        JOptionPane.showMessageDialog(null, "\nThe number of characters in your name is: " + nameLength + "\nThe initial of the first name is: " +
                                      firstNInitial + "\nYour name in capital letters: " + fullN.toUpperCase() +
                                      "\nYour surname: " + lastName,"Name",JOptionPane.INFORMATION_MESSAGE);
    }
}
