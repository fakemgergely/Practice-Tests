/**
 * Business Communications Course
 * 
 * @author Michael Gergely
 */

//Imports
import javax.swing.JOptionPane;

//=====================================================================================================================================================
//==================================================Business Communications Course=====================================================================
//=====================================================================================================================================================
public class BCTest 
{
    //Prompts the user for an IOOP Chapter to use
    public static void chapterSelection()
    {
        JOptionPane.showMessageDialog(null, "Welcome to the Business Communications Test!", "1150", JOptionPane.INFORMATION_MESSAGE);
        //Chapter selection
        String chapterSelection = JOptionPane.showInputDialog(null, "What section are you looking to study?", "Input a section #", JOptionPane.QUESTION_MESSAGE);//No book in this course so it goes by sections (still the same concept)
        int chapterNumber = Integer.parseInt(chapterSelection);
        //Users parsed input == an int, then the corresponding chapter's number == true, then it runs that chapter.
        boolean chapterOne = (chapterNumber == 1), chapterTwo = (chapterNumber == 2), chapterThree = (chapterNumber == 3), 
        chapterFour = (chapterNumber == 4), chapterFive = (chapterNumber == 5), chapterSix = (chapterNumber == 6),
        chapterSeven = (chapterNumber == 7), chapterEight = (chapterNumber == 8), chapterNine = (chapterNumber == 9),
        chapterTen = (chapterNumber == 10), chapterEleven = (chapterNumber == 11), chapterTwelve = (chapterNumber == 12),
        chapterThirteen = (chapterNumber == 13), chapterFourteen = (chapterNumber == 14), chapterFifteen = (chapterNumber == 15);
        //Runs the proper corresponding section
        if (chapterOne == true)
        {
            chapterOne();
        }
        else if (chapterTwo == true)
        {
            chapterTwo();
        }  
        else if (chapterThree == true)
        {
            chapterThree();
        } 
        else if (chapterFour == true)
        {
            chapterFour();
        } 
        else if (chapterFive == true)
        {
            chapterFive();
        } 
        else if (chapterSix == true)
        {
            chapterSix();
        } 
        else if (chapterSeven == true)
        {
            chapterSeven();
        }
        else if (chapterEight == true)
        {
            chapterEight();
        } 
        else if (chapterNine == true)
        {
            chapterNine();
        } 
        else if (chapterTen == true)
        {
            chapterTen();
        } 
        else if (chapterEleven == true)
        {
            chapterEleven();
        } 
            else if (chapterTwelve == true)
        {
            chapterTwelve();
        } 
        else if (chapterThirteen == true)
        {
            chapterThirteen();  
        }
        else if (chapterFourteen == true)
        {
            chapterFourteen();
        }
        else if (chapterFifteen == true)
        {
            chapterFifteen();
        }
    }
    //**************************************************************Chapter 1 Test*************************************************************************
    //*****************************************************************************************************************************************************
    public static void chapterOne()
    {
        //Variables & Arrays to be used (add these seperately to each chapter as total questions may be different)
        int totalQuestions = 16;		//DONT FORGET TO CHANGE THIS WHEN YOU ADD NEW QUESTIONS, OR THE ARRAYS WON'T HAVE THE CORRECT # OF OBJECTS
        String[] newQuestion;
        newQuestion = new String[totalQuestions];
        String[] answerExplanation;
        answerExplanation = new String[totalQuestions];
        
        //Questions
        newQuestion[0] = "What is a noun?";
        newQuestion[1] = "Think of some examples of nouns.";
        newQuestion[2] = "What is a pronoun?";
        newQuestion[3] = "Think of some examples of pronouns.";
        newQuestion[4] = "What is a verb?";
        newQuestion[5] = "Think of some examples of verbs.";
        newQuestion[6] = "What is an adjective?";
        newQuestion[7] = "Think of some examples of adjectives.";
        newQuestion[8] = "What is an adverb?";
        newQuestion[9] = "Think of some examples of adverbs.";
        newQuestion[10] = "What is a preposition?";
        newQuestion[11] = "Think of some examples of prepositions.";
        newQuestion[12] = "What is a conjunction?";
        newQuestion[13] = "Think of some examples of conjunctions.";
        newQuestion[14] = "What is an interjection?";
        newQuestion[15] = "What are some examples of interjections?";
        
        //Answers
        answerExplanation[0] = "Person, place, thing, qualities, concepts & activities.";
        answerExplanation[1] = "Person: Susie, Bob; Places: Toronto, island;\nThings: computer, keyboard; Qualities: efficiency, toughness;\nConcepts: freedom, love; Activities: dance, trading";
        answerExplanation[2] = "Replaces a noun.";
        answerExplanation[3] = "Person: his, her, she, I\nThings: It's cold (as opposed to the weather is cold)\nPlace: It is a great island.";
        answerExplanation[4] = "Doing things, an action.";
        answerExplanation[5] = "Jumping, sleeping, falling, playing.";
        answerExplanation[6] = "Describes a noun or pronoun.";
        answerExplanation[7] = "SHORT jacket, SMALL island, TIRED animal";
        answerExplanation[8] = "Describes verbs, adjectives of other adverbs.";
        answerExplanation[9] = "When: We will arrive TOMORROW\nHow: She read the memo CAREFULLY\nWhere: The file is over THERE\nTo what extent: She was COMPLETELY sure";
        answerExplanation[10] = "Joins nouns and pronouns to other words.";
        answerExplanation[11] = "He lives BY the bridge. He walks NEAR the water.";
        answerExplanation[12] = "Used to connect words together.";
        answerExplanation[13] = "I like dogs, AND cats.\nHe's smart, but he's annoying.";
        answerExplanation[14] = "Shows emotion or expression.";
        answerExplanation[15] = "Oh, she is pretty. Wow! That is a nice computer.";
        
        //Looping through the arrays
        PracticeTests.qaLoop(newQuestion, answerExplanation);
    }
    //**************************************************************Chapter 2 Test*************************************************************************
    //*****************************************************************************************************************************************************
    public static void chapterTwo()
    {
        //Variables & Arrays to be used (add these seperately to each chapter as total questions may be different)
        int totalQuestions = 5;		//DONT FORGET TO CHANGE THIS WHEN YOU ADD NEW QUESTIONS, OR THE ARRAYS WON'T HAVE THE CORRECT # OF OBJECTS
        String[] newQuestion;
        newQuestion = new String[totalQuestions];
        String[] answerExplanation;
        answerExplanation = new String[totalQuestions];
        
        //Questions
        newQuestion[0] = "What is the definition of a sentence?";
        newQuestion[1] = "What is an independent clause? What is a dependent clause?";
        newQuestion[2] = "What is the difference between a verb phrase and a prepositional phrase?";
        newQuestion[3] = "What is a compound sentence?";
        newQuestion[4] = "What is a complex sentence?";
        
        //Answers
        answerExplanation[0] = "A sentence must have a subject and a verb.\nEx: The weekend goes by too quickly.\nSubject: Weekend Verb: goes";
        answerExplanation[1] = "Independent clause: Same as a sentence, a complete thought that has a subject and a verb.\nDependent clause: An incomplete thought such as a sentence fragment.(a distance of 3 miles)";
        answerExplanation[2] = "Verb phrase: Has a verb but no preposition.\nPrepositional phrase: has a preposition but no verb.";
        answerExplanation[3] = "A sentence that joins 2 or more independent clauses (using conjunctions or semicolons)\nEx: She arrives late, but she still finished first.";
        answerExplanation[4] = "A sentence that joins an independent or dependent clause with one or more of it's opposite.\nEx: Yesterday Maria ran from her house to the park and back, a distance of 3 miles.\nNote: If it's an dependent clause and THEN an independent clause you do not use a comma.";
        
        //Looping through the arrays
        PracticeTests.qaLoop(newQuestion, answerExplanation);
    }
    //**************************************************************Chapter 3 Test*************************************************************************
    //*****************************************************************************************************************************************************
    public static void chapterThree()
    {
        JOptionPane.showMessageDialog(null, "This section has not yet been implemented.");
    }
    //**************************************************************Chapter 4 Test*************************************************************************
    //*****************************************************************************************************************************************************
    public static void chapterFour()
    {
        JOptionPane.showMessageDialog(null, "This section has not yet been implemented.");
    }
    //**************************************************************Chapter 5 Test*************************************************************************
    //*****************************************************************************************************************************************************
    public static void chapterFive()
    {
        JOptionPane.showMessageDialog(null, "This section has not yet been implemented.");
    }
    //**************************************************************Chapter 6 Test*************************************************************************
    //*****************************************************************************************************************************************************
    public static void chapterSix()
    {
        JOptionPane.showMessageDialog(null, "This section has not yet been implemented.");
    }
    //**************************************************************Chapter 7 Test*************************************************************************
    //*****************************************************************************************************************************************************
    public static void chapterSeven()
    {
        JOptionPane.showMessageDialog(null, "This section has not yet been implemented.");
    }
    //**************************************************************Chapter 8 Test*************************************************************************
    //*****************************************************************************************************************************************************
    public static void chapterEight()
    {
        JOptionPane.showMessageDialog(null, "This section has not yet been implemented.");
    }
    //**************************************************************Chapter 9 Test*************************************************************************
    //*****************************************************************************************************************************************************
    public static void chapterNine()
    {
        JOptionPane.showMessageDialog(null, "This section has not yet been implemented.");
    }
    //**************************************************************Chapter 10 Test************************************************************************
    //*****************************************************************************************************************************************************
    public static void chapterTen()
    {
        JOptionPane.showMessageDialog(null, "This section has not yet been implemented.");
    }
    //**************************************************************Chapter 11 Test************************************************************************
    //*****************************************************************************************************************************************************
    public static void chapterEleven()
    {
        JOptionPane.showMessageDialog(null, "This section has not yet been implemented.");
    }
    //**************************************************************Chapter 12 Test************************************************************************
    //*****************************************************************************************************************************************************
    public static void chapterTwelve()
    {
        JOptionPane.showMessageDialog(null, "This section has not yet been implemented.");
    }
    //**************************************************************Chapter 13 Test************************************************************************
    //*****************************************************************************************************************************************************
    public static void chapterThirteen()
    {
        JOptionPane.showMessageDialog(null, "This section has not yet been implemented.");
    }
    //**************************************************************Chapter 14 Test************************************************************************
    //*****************************************************************************************************************************************************
    public static void chapterFourteen()
    {
        JOptionPane.showMessageDialog(null, "This section has not yet been implemented.");
    }
    //**************************************************************Chapter 15 Test************************************************************************
    //*****************************************************************************************************************************************************
    public static void chapterFifteen()
    {
        JOptionPane.showMessageDialog(null, "This section has not yet been implemented.");
    }
}
