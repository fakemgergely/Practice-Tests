/**
 * Web Application Development Course
 * 
 * @author Michael Gergely
 */

//Imports
import javax.swing.JOptionPane;

//=====================================================================================================================================================
//=====================================================Web Application Development Course==============================================================
//=====================================================================================================================================================
public class WADTest 
{
    public static void chapterSelection()
    {
        JOptionPane.showMessageDialog(null, "Welcome to the Web Application Development Test!", "1280", JOptionPane.INFORMATION_MESSAGE);
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
        int totalQuestions = 15;		//DONT FORGET TO CHANGE THIS WHEN YOU ADD NEW QUESTIONS, OR THE ARRAYS WON'T HAVE THE CORRECT # OF OBJECTS
        String[] newQuestion;
        newQuestion = new String[totalQuestions];
        String[] answerExplanation;
        answerExplanation = new String[totalQuestions];
        
        //Questions
        newQuestion[0] = "What are some complications with web-based programming?";
        newQuestion[1] = "At it's basics how does a web-page work internally?";
        newQuestion[2] = "What is http & https?";
        newQuestion[3] = "What is DNS?";
        newQuestion[4] = "How would you obtain a domain name?";
        newQuestion[5] = "What is an IP address?";
        newQuestion[6] = "What is Ping?";
        newQuestion[7] = "How does Ping work?";
        newQuestion[8] = "What is website usability?";
        newQuestion[9] = "What is website accessiblity?";
        newQuestion[10] = "What are the 3 main graphic file formats of the web?";
        newQuestion[11] = "What are the attributes of GIF?";
        newQuestion[12] = "What are the attributes of JPEG?";
        newQuestion[13] = "What are the attributes of PNG?";
        newQuestion[14] = "When making a website what must you main page be name?";
        
        //Answers
        answerExplanation[0] = "Just because a script works in one browser well doesn't mean it will in another.\nYour web page needs to be readable on multiple devices.";
        answerExplanation[1] = "A server and/or browser reads the webpages code and displays the information.";
        answerExplanation[2] = "Hypertext Transfer Protocol. The foundation of data communications on the WWW.\nHTTPS works in the same way as HTTP but it's information is encrypted as it's sent over a network.";
        answerExplanation[3] = "Domain name system. Allows the use of domain names to access websites as opposed to IP addresses.";
        answerExplanation[4] = "You must purchase it from a hosting service.";
        answerExplanation[5] = "Internet Protocol Address. Each device on the Internet has one, it is used for network identification & location addressing.";
        answerExplanation[6] = "A network utility to test the reachability of a hosts IP address and to test the round-trip time.";
        answerExplanation[7] = "Ping sends echo requests packets to the target and waits for a response. In the process it calculates the time it takes to reach the host and return, aswell as print out any packet-loss.";
        answerExplanation[8] = "The website must be efficient, effective and satisfying.\nThis can be done with clean code, knowing your audience and making sure the GUI is pleasing to look at.";
        answerExplanation[9] = "Ensuring your website is usable by all, including those with disabilities or the elderly. This may include larger font options, using contrasting font colors etc.\nNote: Using pictures for banners that explain important details can be a bad idea, screen readers can not read images.";
        answerExplanation[10] = "GIF, JPEG, PNG";
        answerExplanation[11] = "8-bit Graphics, limits maximum number of colors to 256 (you can further compress by removing unnecessary colors)\nLossless compressions scheme. GIF is ideal for basic logos (among other things).";
        answerExplanation[12] = "24-bit Graphics (which is ideal for higher-resolution pictures)\nLossy compression algorithm (discards unnecessary data permanently), so you should save an original copy of the image.";
        answerExplanation[13] = "Designed specifically for the web, incorporating many ways to customize the file. Uses lossless compression.\nIdeal for photographic images. You can embed tags in the photo for search purposes.";
        answerExplanation[14] = "index (index.html or index.php)";
        
        //Looping through the arrays
        PracticeTests.qaLoop(newQuestion, answerExplanation);
    }
    //**************************************************************Chapter 2 Test*************************************************************************
    //*****************************************************************************************************************************************************
    public static void chapterTwo()
    {
        //Variables & Arrays to be used (add these seperately to each chapter as total questions may be different)
        int totalQuestions = 21;		//DONT FORGET TO CHANGE THIS WHEN YOU ADD NEW QUESTIONS, OR THE ARRAYS WON'T HAVE THE CORRECT # OF OBJECTS
        String[] newQuestion;
        newQuestion = new String[totalQuestions];
        String[] answerExplanation;
        answerExplanation = new String[totalQuestions];
        
        //Questions
        newQuestion[0] = "What does HTML stand for?";
        newQuestion[1] = "How do you save an HTML file?";
        newQuestion[2] = "What is the basic structure of an HTML document?";
        newQuestion[3] = "What does <!DOCTYPE html> mean?";
        newQuestion[4] = "What does <html> </html> mean?";
        newQuestion[5] = "What is the purpose of the <head> tag?";
        newQuestion[6] = "What is the purpose of the <body> tag?";
        newQuestion[7] = "How do you make comments in html?";
        newQuestion[8] = "How do you name the tabs of your website?";
        newQuestion[9] = "How do you create paragraphs?";
        newQuestion[10] = "How do you make headings?";
        newQuestion[11] = "How do you make unordered and ordered lists?";
        newQuestion[12] = "What are anchor tags and how do you make them?";
        newQuestion[13] = "How can you use anchor tags to link to other parts of your current page?";
        newQuestion[14] = "How to you put images on your website?";
        newQuestion[15] = "How do you create tables?";
        newQuestion[16] = "What are forms used for?";
        newQuestion[17] = "How do you initialize a form?";
        newQuestion[18] = "What are some common form tags to acquire data with?";
        newQuestion[19] = "When changing anything style related in the HTML file, how should you do it?";
        newQuestion[20] = "When saving a image locally, how can you call it from that directory?";
        
        //Answers
        answerExplanation[0] = "Hypertext Markup Language.";
        answerExplanation[1] = "With the file extention: .html";
        answerExplanation[2] = "<!DOCTYPE html>\n<html\n    <head>\n    </head>\n    <body>\n    </body>\n</html>";
        answerExplanation[3] = "It tells the browser what flavor for HTML your using. (HTML 5 in this case)";
        answerExplanation[4] = "It tells the browser everything between these tags is html.";
        answerExplanation[5] = "It contains information about the page, but does not appear in the browser window.";
        answerExplanation[6] = "Everything in the body tag is the main content of the document.";
        answerExplanation[7] = "<!-- Comment -->";
        answerExplanation[8] = "<title> Tab Name </title>\nNote: This goes inside the <head> tag.";
        answerExplanation[9] = "<p> paragraph paragraph </p>\nNote: To break lines in you can use <br/>, although this shouldn't really be used with paragraphs.";
        answerExplanation[10] = "<h1> Big Header </h1>\nNote: h1 is the biggest and it goes through to h6, which is the smallest.";
        answerExplanation[11] = "Unordered: <ul> <li> </li> </ul> (li items should be indented and on another line).\nOrdered: Same as unordered but use the tag <ol> instead.";
        answerExplanation[12] = "Anchor tags are used to link users to other areas/websites.\n<a href =\"http://sitename.ca\"> some words </a>";
        answerExplanation[13] = "You give a part of your page an id (<h1 id =\"something\"> Something </h1>)\nThe href would then be #something";
        answerExplanation[14] = "<img src=\"image location\" width=\"n\" height=\"n\" alt=\"some words describing the picture\"/>\nThe alt tag is there for those using screen-readers so they know what the picture is.\nNote: Changing a picture width/height in the style attribute does not change it's actual file-size. Use paint or a similar program for this.";
        answerExplanation[15] = "<table>\n    <tr>\n        <td> A cell> </td>\n    </tr>\n</table>\nNote: <table> tells the doc this is a table, <tr> tells the table this is a new row, <td> tells the row this is a new cell (or column).";
        answerExplanation[16] = "Forms are used to acquire data from the user, which is processed through some other programming language embedded in the script.";
        answerExplanation[17] = "<form action=\"thescript.php\" method=\"post\"> Add your desired way of acquiring (textarea, input etc) </form>\nNote: Another method is get";
        answerExplanation[18] = "input (single line), textarea (multi-line), select.\nNote: You should give all sub forms a name:\"name\" attribute.";
        answerExplanation[19] = "With the style:\"\" attribute, then add the thing you are configuring ie: width, height, color etc. (seperate each with a ;)\nNote:Things like <font> tags are no longer current for html 5.";
        answerExplanation[20] = "If the file is in the html's directory: fileName.jpg\nIf the file is further in that same directory: directoryName/fileName.jpg\nIf the file is before the current directory: ../fileName.jpg\nNote: It will start looking for the file in comaprison to the current directory that the html file is in.";
        
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
