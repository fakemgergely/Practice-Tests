/**
 * Operating Systems Course
 * 
 * @author Michael Gergely
 */

//Imports
import javax.swing.JOptionPane;

//=====================================================================================================================================================
//=================================================Operating Systems Course============================================================================
//=====================================================================================================================================================
public class OSTest 
{
    //=============================================Linux Test=============================================
    //====================================================================================================
    public static void linuxChapterSelection()
    {
        JOptionPane.showMessageDialog(null, "Welcome to the Linux Test!", "1300", JOptionPane.INFORMATION_MESSAGE);
        //Chapter selection
        String chapterSelection = JOptionPane.showInputDialog(null, "What chapter are you looking to study?", "Input a chapter #", JOptionPane.QUESTION_MESSAGE);
        int chapterNumber = Integer.parseInt(chapterSelection);
        //Users parsed input == an int, then the corresponding chapter's number == true, then it runs that chapter.
        boolean chapterOne = (chapterNumber == 1), chapterTwo = (chapterNumber == 2), chapterThree = (chapterNumber == 3), 
        chapterFour = (chapterNumber == 4), chapterFive = (chapterNumber == 5), chapterSix = (chapterNumber == 6),
        chapterSeven = (chapterNumber == 7), chapterEight = (chapterNumber == 8), chapterNine = (chapterNumber == 9),
        chapterTen = (chapterNumber == 10), chapterEleven = (chapterNumber == 11), chapterTwelve = (chapterNumber == 12),
        chapterThirteen = (chapterNumber == 13), chapterFourteen = (chapterNumber == 14), chapterFifteen = (chapterNumber == 15),
        chapterSixteen = (chapterNumber == 16), chapterSeventeen = (chapterNumber == 17);
        //Runs the proper corresponding chapter
        if (chapterOne == true)
        {
            linuxChapterOne();
        }
        else if (chapterTwo == true)
        {
            linuxChapterTwo();
        }  
        else if (chapterThree == true)
        {
            linuxChapterThree();
        } 
        else if (chapterFour == true)
        {
            linuxChapterFour();
        } 
        else if (chapterFive == true)
        {
            linuxChapterFive();
        } 
        else if (chapterSix == true)
        {
            linuxChapterSix();
        } 
        else if (chapterSeven == true)
        {
            linuxChapterSeven();
        }
        else if (chapterEight == true)
        {
            linuxChapterEight();
        } 
        else if (chapterNine == true)
        {
            linuxChapterNine();
        } 
        else if (chapterTen == true)
        {
            linuxChapterTen();
        } 
        else if (chapterEleven == true)
        {
            linuxChapterEleven();
        } 
        else if (chapterTwelve == true)
        {
            linuxChapterTwelve();
        } 
        else if (chapterThirteen == true)
        {
            linuxChapterThirteen();
        }
        else if (chapterFourteen == true)
        {
            linuxChapterFourteen();
        }
        else if (chapterFifteen == true)
        {
            linuxChapterFifteen();
        }
        else if (chapterSixteen == true)
        {
            linuxChapterSixteen();
        }
        else if (chapterSeventeen == true)
        {
            linuxChapterSeventeen();
        }
    }
    //**************************************************************Chapter 1 Test*************************************************************************
    //*****************************************************************************************************************************************************
    public static void linuxChapterOne()
    {
        //Variables & Arrays to be used (add these seperately to each chapter as total questions may be different)
        int totalQuestions = 8;		//DONT FORGET TO CHANGE THIS WHEN YOU ADD NEW QUESTIONS, OR THE ARRAYS WON'T HAVE THE CORRECT # OF OBJECTS
        String[] newQuestion;
        newQuestion = new String[totalQuestions];
        String[] answerExplanation;
        answerExplanation = new String[totalQuestions];
        
        //Questions
        newQuestion[0] = "What is linux and at it's basics how does it work?";
        newQuestion[1] = "What is a distribution?";
        newQuestion[2] = "What is an operating system?";
        newQuestion[3] = "What does a kernal do primarily?";
        newQuestion[4] = "What kinds of end-user utility does an operating system provide?";
        newQuestion[5] = "In Linux's text-mode interfaces what significance do these symbols hold: $ and #";
        newQuestion[6] = "In Linux's text-mode interfaces what significance do these functions hold: ls, cp and rm.";
        newQuestion[7] = "What is a desktop environment?";
        
        //Answers
        answerExplanation[0] = "Linux is a clone of the Unix OS. It has a kernal which is the core control software of the OS with many libraries and utilities.";
        answerExplanation[1] = "Linux comes in many distributions which are collections of a specific kernal and various other support programs.";
        answerExplanation[2] = "An operating system provides all the most fundamental software features of a computer. It is essentially the bridge between your software and hardware.\nIt defines your UI standards and provides the basic tools that make your computer useful.";
        answerExplanation[3] = "A kernal is respondsible for the low-level features such as software to hardware compatibility and allocating memory and cpu to programs.";
        answerExplanation[4] = "Command line shells: allowing you text-based control over computer functions. GUI: Giving you icons, menus and other easily navigatable functions.\nUtility programs: calculators, text editors, disk maintenance. Libraries: collections of programming functions that can be used by a variety of programs (libc)./nProductivity Programs: Office software, web browsers, graphical editors.";
        answerExplanation[5] = "$: base-level user\n#: Root user (Administrator)";
        answerExplanation[6] = "ls: lists the files in the current directory\ncp: copies the designated files\nrm: removes/deletes the designated files";
        answerExplanation[7] = "Provides the GUI of your desktop such as program launchers, file managers, window controls and much more.";
        
        //Looping through the arrays
        PracticeTests.qaLoop(newQuestion, answerExplanation);
    }
    //**************************************************************Chapter 2 Test*************************************************************************
    //*****************************************************************************************************************************************************
    public static void linuxChapterTwo()
    {
        //Variables & Arrays to be used (add these seperately to each chapter as total questions may be different)
        int totalQuestions = 11;		//DONT FORGET TO CHANGE THIS WHEN YOU ADD NEW QUESTIONS, OR THE ARRAYS WON'T HAVE THE CORRECT # OF OBJECTS
        String[] newQuestion;
        newQuestion = new String[totalQuestions];
        String[] answerExplanation;
        answerExplanation = new String[totalQuestions];
        
        //Questions
        newQuestion[0] = "What is commercial software and shareware software?";
        newQuestion[1] = "What is freeware software and open source software?";
        newQuestion[2] = "What is an embedded computer?";
        newQuestion[3] = "What are desktop/laptop computers used for?";
        newQuestion[4] = "What software do Linux desktop/laptop computers generally come with?";
        newQuestion[5] = "What is a server computer?";
        newQuestion[6] = "What should you consider before creating a server computer?";
        newQuestion[7] = "What is software licensing?";
        newQuestion[8] = "What is the difference between copyright laws and patent laws?";
        newQuestion[9] = "How does open source differ from these types of laws?";
        newQuestion[10] = "What are the 3 major companies in the open source movement?";
        
        //Answers
        answerExplanation[0] = "Commerial: Sold, source code is not given, illegal to redistribute.\nShareware: Sold on an honor system, after a period of trial you should buy it. source code not given.";
        answerExplanation[1] = "Freeware: Free as in free-beer, source code usually not given.\nOpen source: free as in freedom, source code required to be given, free to change source code and redistribute.";
        answerExplanation[2] = "A specialized device that fulfills a specific purpose, such as a cellphone, e-reader, home appliances.\nNote: These are designed to be used but not maintained by end-users.";
        answerExplanation[3] = "Primarily used for productivity tasks, can be maintained by end-users.";
        answerExplanation[4] = "Base GUI: X or X GUI (Linux's default, very basic)\nDesktop Environment: Such as GNOME or KDE\nWeb Browser\nOffice suite: OpenOffice/LibreOffice";
        answerExplanation[5] = "A computer running a server OS, there are many different server OSs for Linux for different server needs.";
        answerExplanation[6] = "A server computer should have high spec and a good internet connection.\nYou should have a good knowledge on server security and how to properly manage a server first.";
        answerExplanation[7] = "Software is an intellectual property and is governed by copyright laws and sometimes patent laws.";
        answerExplanation[8] = "Copyright protects a specific instance of an idea, and patent laws protect an idea itself.";
        answerExplanation[9] = "Open source is governed by licenses which alter the rights of users giving them more freedom to use and change the software.";
        answerExplanation[10] = "Free Software Foundation, Open Source Initiative, Creative Commons.";
        
        //Looping through the arrays
        PracticeTests.qaLoop(newQuestion, answerExplanation);
    }
    //**************************************************************Chapter 3 Test*************************************************************************
    //*****************************************************************************************************************************************************
    public static void linuxChapterThree()
    {
        JOptionPane.showMessageDialog(null, "****Note: This chapter has been implemented into chapter 2 instead.****");
    }
    //**************************************************************Chapter 4 Test*************************************************************************
    //*****************************************************************************************************************************************************
    public static void linuxChapterFour()
    {
        JOptionPane.showMessageDialog(null, "This chapter has not yet been implemented.");
    }
    //**************************************************************Chapter 5 Test*************************************************************************
    //*****************************************************************************************************************************************************
    public static void linuxChapterFive()
    {
        JOptionPane.showMessageDialog(null, "This chapter has not yet been implemented.");
    }
    //**************************************************************Chapter 6 Test*************************************************************************
    //*****************************************************************************************************************************************************
    public static void linuxChapterSix()
    {
        JOptionPane.showMessageDialog(null, "This chapter has not yet been implemented.");
    }
    //**************************************************************Chapter 7 Test*************************************************************************
    //*****************************************************************************************************************************************************
    public static void linuxChapterSeven()
    {
        JOptionPane.showMessageDialog(null, "This chapter has not yet been implemented.");
    }
    //**************************************************************Chapter 8 Test*************************************************************************
    //*****************************************************************************************************************************************************
    public static void linuxChapterEight()
    {
        JOptionPane.showMessageDialog(null, "This chapter has not yet been implemented.");
    }
    //**************************************************************Chapter 9 Test*************************************************************************
    //*****************************************************************************************************************************************************
    public static void linuxChapterNine()
    {
        JOptionPane.showMessageDialog(null, "This chapter has not yet been implemented.");
    }
    //**************************************************************Chapter 10 Test************************************************************************
    //*****************************************************************************************************************************************************
    public static void linuxChapterTen()
    {
        JOptionPane.showMessageDialog(null, "This chapter has not yet been implemented.");
    }
    //**************************************************************Chapter 11 Test************************************************************************
    //*****************************************************************************************************************************************************
    public static void linuxChapterEleven()
    {
        JOptionPane.showMessageDialog(null, "This chapter has not yet been implemented.");
    }
    //**************************************************************Chapter 12 Test************************************************************************
    //*****************************************************************************************************************************************************
    public static void linuxChapterTwelve()
    {
        JOptionPane.showMessageDialog(null, "This chapter has not yet been implemented.");
    }
    //**************************************************************Chapter 13 Test************************************************************************
    //*****************************************************************************************************************************************************
    public static void linuxChapterThirteen()
    {
        JOptionPane.showMessageDialog(null, "This chapter has not yet been implemented.");
    }
    //**************************************************************Chapter 14 Test************************************************************************
    //*****************************************************************************************************************************************************
    public static void linuxChapterFourteen()
    {
        JOptionPane.showMessageDialog(null, "This chapter has not yet been implemented.");
    }
    //**************************************************************Chapter 15 Test************************************************************************
    //*****************************************************************************************************************************************************
    public static void linuxChapterFifteen()
    {
        JOptionPane.showMessageDialog(null, "This chapter has not yet been implemented.");
    }
    //**************************************************************Chapter 16 Test************************************************************************
    //*****************************************************************************************************************************************************
    public static void linuxChapterSixteen()
    {
        JOptionPane.showMessageDialog(null, "This chapter has not yet been implemented.");
    }
    //**************************************************************Chapter 17 Test************************************************************************
    //*****************************************************************************************************************************************************
    public static void linuxChapterSeventeen()
    {
        JOptionPane.showMessageDialog(null, "This chapter has not yet been implemented.");
    }
    
    //=============================================Windows Test===========================================
    //====================================================================================================
    public static void windowsChapterSelection()
    {
        JOptionPane.showMessageDialog(null, "Welcome to the Windows Test!", "1300", JOptionPane.INFORMATION_MESSAGE);
        //Chapter selection
        String chapterSelection = JOptionPane.showInputDialog(null, "What chapter are you looking to study?", "Input a chapter #", JOptionPane.QUESTION_MESSAGE);
        int chapterNumber = Integer.parseInt(chapterSelection);
        //Users parsed input == an int, then the corresponding chapter's number == true, then it runs that chapter.
        boolean chapterOne = (chapterNumber == 1), chapterTwo = (chapterNumber == 2), chapterThree = (chapterNumber == 3), 
        chapterFour = (chapterNumber == 4), chapterFive = (chapterNumber == 5), chapterSix = (chapterNumber == 6),
        chapterSeven = (chapterNumber == 7);
        //Runs the proper corresponding chapter
        if (chapterOne == true)
        {
            windowsChapterOne();
        }
        else if (chapterTwo == true)
        {
            windowsChapterTwo();
        }  
        else if (chapterThree == true)
        {
            windowsChapterThree();
        } 
        else if (chapterFour == true)
        {
            windowsChapterFour();
        } 
        else if (chapterFive == true)
        {
            windowsChapterFive();
        } 
        else if (chapterSix == true)
        {
            windowsChapterSix();
        } 
        else if (chapterSeven == true)
        {
            windowsChapterSeven();
        }
    }
    //**************************************************************Chapter 1 Test*************************************************************************
    //*****************************************************************************************************************************************************
    public static void windowsChapterOne()
    {
        //Variables & Arrays to be used (add these seperately to each chapter as total questions may be different)
        int totalQuestions = 9;		//DONT FORGET TO CHANGE THIS WHEN YOU ADD NEW QUESTIONS, OR THE ARRAYS WON'T HAVE THE CORRECT # OF OBJECTS
        String[] newQuestion;
        newQuestion = new String[totalQuestions];
        String[] answerExplanation;
        answerExplanation = new String[totalQuestions];
        
        //Questions
        newQuestion[0] = "What are the all the editions available of windows 7?";
        newQuestion[1] = "Which editions are available commercially? (to be bought seperately from a system or organization)";
        newQuestion[2] = "What is Home Premium generally used for?";
        newQuestion[3] = "What is Professional generally used for?";
        newQuestion[4] = "What is the difference between Professional and Ultimate?";
        newQuestion[5] = "What is the primary difference(s) between 32-bit and 64-bit processors?";
        newQuestion[6] = "What is an upgrade path?";
        newQuestion[7] = "What Windows programs/sources can you use to identify program compatibility between OS.";
        newQuestion[8] = "What are the different installation types for Windows 7, and if any, what software do they use to do so?";
        
        //Answers
        answerExplanation[0] = "Starter, Home Basic, Home Premium, Professional, Ultimate, Enterprise.";
        answerExplanation[1] = "Home Premium, Professional, Ultimate.";
        answerExplanation[2] = "Home type environments, it contains the necessary features to be productive.";
        answerExplanation[3] = "Small businesses or power-users. It contains all of the features of Home Premium along with:\nThe ability to join a windows domain, location aware printing, remote desktop and encrypting file system.";
        answerExplanation[4] = "Ultimate has Bitlocker and Applocker for disc-wide encryption.";
        answerExplanation[5] = "The amount of ram you are able to use. 32-bit is capped at 4GB of ram while 64-bit is much more (16EB).\nNote: OS's come in 32-bit and 64-bit aswell so it is important to match them to your processor.\nA 64-bit processor can run 32-bit or 64-bit OS but a 32-bit processor likely can't run a 64-bit OS.";
        answerExplanation[6] = "A set of options for upgrading from one edition to another, be it one OS to another OS or simply an OS edition to the same OS but a different edition.\nNote: To use an upgrade path you must be going from a lesser edition to a higher one (basic to home premium for ex), it will still work from say Vista to Windows 7.\nHowever you cannot use an upgrade path to go from a higher edition to a lower (Ultimate to Home Premium for ex)\nFor that you must do a custom install which will erase all your files unless you back them up.";
        answerExplanation[7] = "Windows 7 Compatibility Centre, Windows 7 application compatibility list.";
        answerExplanation[8] = "High-Touch: (HTI) You must manually go from computer to computer with an external media and configure each.\nLight-Touch: (LTI) Semi-automated using Windows Automated Installation Kit.\nZero-Touch: (ZTI) Fully automated using System Centre Configuration Manager.";
        
        //Looping through the arrays
        for (int i = 0; i < totalQuestions; i++)
        {
            int questionNumber = i + 1;
            JOptionPane.showMessageDialog(null, newQuestion[i], "Question #" + questionNumber, JOptionPane.QUESTION_MESSAGE);
            JOptionPane.showMessageDialog(null, answerExplanation[i], "Question #" + questionNumber, JOptionPane.INFORMATION_MESSAGE);
        }
    }
    //**************************************************************Chapter 2 Test*************************************************************************
    //*****************************************************************************************************************************************************
    public static void windowsChapterTwo()
    {
        //Variables & Arrays to be used (add these seperately to each chapter as total questions may be different)
        int totalQuestions = 12;		//DONT FORGET TO CHANGE THIS WHEN YOU ADD NEW QUESTIONS, OR THE ARRAYS WON'T HAVE THE CORRECT # OF OBJECTS
        String[] newQuestion;
        newQuestion = new String[totalQuestions];
        String[] answerExplanation;
        answerExplanation = new String[totalQuestions];
        
        //Questions
        newQuestion[0] = "What are user accounts for?";
        newQuestion[1] = "What are the 3 types of users on?";
        newQuestion[2] = "Why is it best to use a standard user for day-to-day activities?";
        newQuestion[3] = "What is the benefits of an administrator account?";
        newQuestion[4] = "What is UAC?";
        newQuestion[5] = "Where can you find the admin tools?";
        newQuestion[6] = "What is the snipping tool?";
        newQuestion[7] = "What is the sync centre?";
        newQuestion[8] = "What is the mobility centre?";
        newQuestion[9] = "What is remote desktop connection and how is it different from remote assistance.";
        newQuestion[10] = "If remote services are disabled on your computer how can you turn them on?";
        newQuestion[11] = "What is Windows Powershell?";
        
        //Answers
        answerExplanation[0] = "User accounts specify what priveledges that user has. It also keeps track of preferences, backgrounds and settings.";
        answerExplanation[1] = "Administrator user, Standard User, Guest User";
        answerExplanation[2] = "Improves security if someone breaks into your computer they won't have access to all admin-level configuration.\nNote: You can still use run as administrator option on some programs";
        answerExplanation[3] = "Administrators can configure all settings, install programs and modify the registry.";
        answerExplanation[4] = "User Accounts Controls notifys you when changes are being made that affect security or user settings.\nIt has 4 levels ranging from always notify to never notify.";
        answerExplanation[5] = "Control Panel < System and Security < Admin Tools\nNote: You can use Microsoft Management Console (mmc) to create a custom set toolkit for yourself by adding or removing snap-ins";
        answerExplanation[6] = "It allows you to take screenshots (in specific shapes and areas), annotate them and e-mail them all from one place.";
        answerExplanation[7] = "Allows you to sync files between devices on a network.\nNote: Before this is possible you need to set up a sync partnership.";
        answerExplanation[8] = "Allows to adjust many features that are important to laptops such as, screen brightness, battery options and more.";
        answerExplanation[9] = "Remote desktop connection allows a user to connect to another over a network, when the person is connected to your computer you have no control and cannot see what is happening.\nRemote Assistance allows both to see and control the computer, it is also more secure require a file to be e-mailed and a password to be input.";
        answerExplanation[10] = "Open up your computer menu (win+e), locate your computer tab (not the c: drive), right-click, go to properties < remote settings < turn them on.";
        answerExplanation[11] = "An advanced version of the command prompt, allowing more administrative functions.";
        
        //Looping through the arrays
        for (int i = 0; i < totalQuestions; i++)
        {
            int questionNumber = i + 1;
            JOptionPane.showMessageDialog(null, newQuestion[i], "Question #" + questionNumber, JOptionPane.QUESTION_MESSAGE);
            JOptionPane.showMessageDialog(null, answerExplanation[i], "Question #" + questionNumber, JOptionPane.INFORMATION_MESSAGE);
        }
    }
    //**************************************************************Chapter 3 Test*************************************************************************
    //*****************************************************************************************************************************************************
    public static void windowsChapterThree()
    {
        JOptionPane.showMessageDialog(null, "This chapter has not yet been implemented.");
    }
    //**************************************************************Chapter 4 Test*************************************************************************
    //*****************************************************************************************************************************************************
    public static void windowsChapterFour()
    {
        JOptionPane.showMessageDialog(null, "This chapter has not yet been implemented.");
    }   
    //**************************************************************Chapter 5 Test*************************************************************************
    //*****************************************************************************************************************************************************
    public static void windowsChapterFive()
    {
        JOptionPane.showMessageDialog(null, "This chapter has not yet been implemented.");
    }
    //**************************************************************Chapter 6 Test*************************************************************************
    //*****************************************************************************************************************************************************
    public static void windowsChapterSix()
    {
        JOptionPane.showMessageDialog(null, "This chapter has not yet been implemented.");
    }
    //**************************************************************Chapter 7 Test*************************************************************************
    //*****************************************************************************************************************************************************
    public static void windowsChapterSeven()
    {
        JOptionPane.showMessageDialog(null, "This chapter has not yet been implemented.");
    }
}
