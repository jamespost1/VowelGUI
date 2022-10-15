/* James Post
 * CSCI 212-22D
 * This VowelGUI class inherits from the JFrame class and uses two methods to
 * read from a file line by line, create a JFrame, and then print the original text from
 * the file and a count of each vowel in the file.
 */
import javax.swing.*;
import java.awt.*;
//declare static variables to be used in initialize, printToJFrame, and other methods in main program
public class VowelGUI extends JFrame {
   static final int numberOfLines = 20;
   static String line;
   static JFrame myFrame;
// default constructor
   public VowelGUI() {
   }
// initialize method to give default values to static variables and create JFrame
   public void initialize() {
      line = "";
      Project1.wordArray = new String[numberOfLines];
      Project1.arraySize = 0;
      Project1.myFile = new TextFileInput(Project1.filename);
      myFrame = new VowelGUI();
      myFrame.setSize(1000, 500);
      myFrame.setLocation(100, 100);
      myFrame.setTitle("VowelGUI");
      // sets a grid layout of 1 row and 2 columns
      myFrame.setLayout(new GridLayout(1, 2));
      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      myFrame.setVisible(true);
   }
// printToJFrame method to print the string paragraph in first column and the vowel count in the second column
   public void printToJFrame(JFrame jf, String[] wordList, int[] vowelList, int size) {
      Container myContentPane = jf.getContentPane();
      TextArea myTextArea = new TextArea();
      TextArea myCountArea = new TextArea();
      myContentPane.add(myTextArea);
      myContentPane.add(myCountArea);
      // for loops prints the string paragraph line by line to first column
      for (int i = 0; i < size; i++) {
         myTextArea.append(wordList[i] + "\n");
      }
      // prints the vowel count in second column one by one
      myCountArea.append("Number of 'A' and 'a' : " + vowelList[0] + "\n");
      myCountArea.append("Number of 'E' and 'e' : " + vowelList[1] + "\n");
      myCountArea.append("Number of 'I' and 'i' : " + vowelList[2] + "\n");
      myCountArea.append("Number of 'O' and 'o' : " + vowelList[3] + "\n");
      myCountArea.append("Number of 'U' and 'u' : " + vowelList[4] + "\n");
      jf.setVisible(true);

   }
}
