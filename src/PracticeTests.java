/**
 * Produce "flash-cards" to memorize materials for CIS 2014/2015 Academic Years
 * 
 * @version 0.1
 * @author Michael Gergely
 */

//Imports
import javax.swing.JOptionPane;

public class PracticeTests 
{
    /**
     * The main method welcomes the user then prompts them for a specific course they want to study
     * It will call the specific class that holds that courses test and then execute from there
     * 
     * @param args 
     */
    public static void main(String[] args) 
    {
        //Intro Message
        JOptionPane.showMessageDialog(null, "Welcome to Practice Tests for Computer Information Systems!", "Welcome!", JOptionPane.PLAIN_MESSAGE);
        //Prompt user to decide which course he wants to use.
        String courseSelection = JOptionPane.showInputDialog(null, "What course are you looking to study for?\n1) Introduction to Object Oriented Programming\n2) Operating Systems\n3) Network Communications\n4) Web Application Development\n5) Business Communications", "Type in the corresponding #", JOptionPane.QUESTION_MESSAGE);
        //Converting the String answer to an int
        int courseTest = Integer.parseInt(courseSelection);
        //Different Tests
        boolean ioopTest = (courseTest == 1), osTest = (courseTest == 2), ncTest = (courseTest == 3), wadTest = (courseTest == 4), bcTest = (courseTest == 5);
        if (ioopTest == true)
        {
            IOOPTest.chapterSelection();
        }
        else if (osTest == true)
        {
            //There are 2 seperate books in the Operating Systems course so this will decide which they want to study.
            String whichTest;
            whichTest = JOptionPane.showInputDialog(null, "Which section are you looking to study?\n1) Linux\n2) Windows", "Choose which section", JOptionPane.QUESTION_MESSAGE);
            int testNumber = Integer.parseInt(whichTest); //Parsing the string response
            if (testNumber == 1)
            {
                OSTest.linuxChapterSelection();    //Runs the Linux test if their input was 1
            }
            else if (testNumber == 2)
            {
                OSTest.windowsChapterSelection();  //Runs the Windows test if their input was 2
            }
        }
        else if (ncTest == true)
        {
            NCTest.chapterSelection();
        }
        else if (wadTest == true)
        {
            WADTest.chapterSelection();
        }
        else if (bcTest == true)
        {
            BCTest.chapterSelection();
        }
    }
    
    /**
     * Loop through the arrays in the course classes
     * 
     * @param questions
     * @param answers 
     */
    public static void qaLoop(String[] questions, String[] answers)
    {
        for(int i = 0; i < questions.length; i++)
        {
            int questionNumber = i + 1;
            JOptionPane.showMessageDialog(null, questions[i], "Question #" + questionNumber, JOptionPane.QUESTION_MESSAGE);
            JOptionPane.showMessageDialog(null, answers[i], "Question #" + questionNumber, JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
