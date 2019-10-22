import javax.swing.*;

public class Q3 {
    public static void main(String[] args) {
        String name, lengthAsString, breadthAsString,totalAreaAsString,costPerSquareAsString;
        float length,breadth,totalArea,costPerSquare, total=0;

        name = JOptionPane.showInputDialog("Enter your name: ");

        lengthAsString = JOptionPane.showInputDialog("Length of room: ");
        length = Float.parseFloat(lengthAsString);

        breadthAsString = JOptionPane.showInputDialog("Breadth of room: ");
        breadth = Float.parseFloat(breadthAsString);

        totalAreaAsString = JOptionPane.showInputDialog("Total area of the room: ");
        totalArea = Float.parseFloat(totalAreaAsString);

        costPerSquareAsString = JOptionPane.showInputDialog("Cost per square metre of carpet: ");
        costPerSquare = Float.parseFloat(costPerSquareAsString);

        total=costPerSquare*totalArea;

        JOptionPane.showMessageDialog(null, "Quotation for " + name +
                                      "\nLength of room: " + String.format("%.2f",length) + " m.\nBreadth of room: " +
                                       String.format("%.2f",breadth) + " m.\nTotal area of the room: " + String.format("%.2f",totalArea) +
                                      " sq. m.\nCost per square metre of carpet: " + String.format("%.2f",costPerSquare) +
                                      " euro\nTotal cost of carpet: " + String.format("%.2f",total) + " euro",
                                      "Carpet",JOptionPane.INFORMATION_MESSAGE);
    }
}
