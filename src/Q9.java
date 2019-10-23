import javax.swing.*;

public class Q9 {
    public static void main(String[] args) {
        float weights[] = new float[10];
        int lessThan250;
        float percent400, lightest, average;

        readInWeights(weights);
        lessThan250=less250(weights);
        percent400=percentOver400(weights);
        lightest=lightestAnimal(weights);
        average=averageWeights(weights);

        JOptionPane.showMessageDialog(null,"Weights: " + displayWeights(weights) +
                                      "\nNumber under 250 kg: " + lessThan250 +
                                      "\nPercentage over 400 kg: " + String.format("%.0f",percent400) + "%" +
                                      "\nLightest animal: " + lightest + " kg" +
                                      "\nAverage weight: " + average + " kg","Animal Statistic",JOptionPane.INFORMATION_MESSAGE);
    }

    public static void readInWeights(float w[]) {
        String weightsAsString;

        for(int i=0; i<w.length; i++)
        {
            weightsAsString = JOptionPane.showInputDialog("Enter weight for cattle " + (i+1) + ": ");
            w[i]=Float.parseFloat(weightsAsString);
        }
    }

    public static String displayWeights(float w[]) {
        String text="";

        for (int i=0; i<w.length; i++)
        {
            text += w[i] + ", ";
        }
    return text;}

    public static int less250(float w[]) {
        int lessThan250=0;

        for(int i=0; i<w.length; i++)
        {
            if(w[i]<250)
            {
                lessThan250++;
            }
        }
    return lessThan250;}

    public static float percentOver400(float w[]) {
        float over400=0, percent=0;

        for(int i=0; i<w.length; i++)
        {
            if(w[i]>=400)
            {
                over400++;
            }
        }
        percent=(over400/w.length)*100;

    return percent;}

    public static float lightestAnimal(float w[]) {
        float lightest=w[0];

        for(int i=1; i<w.length; i++)
        {
            if(w[i] < lightest)
                lightest=w[i];
        }
    return lightest;}

    public static float averageWeights(float w[]) {
        float total=0;

        for(int i=0; i<w.length; i++)
        {
            total+=w[i];
        }
    return total/w.length;}
}
