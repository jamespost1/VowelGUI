/* James Post
 * CSCI 212-22D
 * This main program uses three methods and the VowelGUI class to read in
 * text from a file, count the individual vowels, and return a GUI of the
 * original text and the count of each vowel.
 */
public class Project1 {
   // declare static variables to be used in methods across both files
   static TextFileInput myFile;
   static String[] wordArray;
   static int[] vowelCount = { 0, 0, 0, 0, 0 };
   static int arraySize;
   static String filename = "input.txt";
// main method initializes the GUI, and uses the readLineFromFile method and printToJFrame methods
   public static void main(String[] args) {
      VowelGUI myGUI = new VowelGUI();
      myGUI.initialize();
      readLineFromFile(filename);
      myGUI.printToJFrame(myGUI.myFrame, wordArray, vowelCount, arraySize);
   }
// readLineFromFile method will store the original string and count the vowels using storeLine and countVowel methods
   public static void readLineFromFile(String file) {
      String line = myFile.readLine();
      // while the line read in is not null
      while (line != null) {
         storeLine(line, wordArray);
         countVowel(line, vowelCount);
         line = myFile.readLine();
      }
   }
// storeLine stores the original text from the file in a String array
   public static void storeLine(String s, String[] list) {
      // each line is stored in an array
      list[arraySize++] = s;
   }
// countVowel counts the vowels and stores them in an integer array
   public static void countVowel(String s, int[] list) {
      int c = 0;
      // while the counter is less than the length of the line being read
      while (c < s.length()) {
         if (s.charAt(c) == 'a' || s.charAt(c) == 'A')
            // if the character is a vowel, the value of the corresponding index in the array is incremented
            list[0]++;
         else if (s.charAt(c) == 'e' || s.charAt(c) == 'E')
            list[1]++;
         else if (s.charAt(c) == 'i' || s.charAt(c) == 'I')
            list[2]++;
         else if (s.charAt(c) == 'o' || s.charAt(c) == 'O')
            list[3]++;
         else if (s.charAt(c) == 'u' || s.charAt(c) == 'U')
            list[4]++;
         c++;
      }
   }

}
