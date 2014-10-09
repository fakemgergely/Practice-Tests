/**
 * Introduction to Object Oriented Programming Course
 * 
 * @author Michael Gergely
 */

//Imports
import javax.swing.JOptionPane;

//=====================================================================================================================================================
//===========================================Introduction to Object Oriented Programming Course========================================================
//=====================================================================================================================================================
public class IOOPTest 
{
    //Prompts the user for an IOOP Chapter to use
    public static void chapterSelection()
    {
        JOptionPane.showMessageDialog(null, "Welcome to the Introduction to Object Oriented Programming Test!", "1201", JOptionPane.INFORMATION_MESSAGE);
        //Chapter selection
        String chapterSelection = JOptionPane.showInputDialog(null, "What chapter are you looking to study?", "Input a chapter #", JOptionPane.QUESTION_MESSAGE);
        int chapterNumber = Integer.parseInt(chapterSelection);
        //Users parsed input == an int, then the corresponding chapter's number == true, then it runs that chapter.
        boolean chapterOne = (chapterNumber == 1), chapterTwo = (chapterNumber == 2), chapterThree = (chapterNumber == 3), 
        chapterFour = (chapterNumber == 4), chapterFive = (chapterNumber == 5), chapterSix = (chapterNumber == 6),
        chapterSeven = (chapterNumber == 7), chapterEight = (chapterNumber == 8), chapterNine = (chapterNumber == 9),
        chapterTen = (chapterNumber == 10), chapterEleven = (chapterNumber == 11), chapterTwelve = (chapterNumber == 12),
        chapterThirteen = (chapterNumber == 13), chapterFourteen = (chapterNumber == 14), chapterFifteen = (chapterNumber == 15),
        chapterSixteen = (chapterNumber == 16);
        //Runs the proper corresponding chapter
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
        else if (chapterSixteen == true)
        {
            chapterSixteen();
        } 
    }
    //**************************************************************Chapter 1 Test*************************************************************************
    //*****************************************************************************************************************************************************
    public static void chapterOne()
    {
        //Variables & Arrays to be used (add these seperately to each chapter as total questions may be different)
        int totalQuestions = 29;		//DONT FORGET TO CHANGE THIS WHEN YOU ADD NEW QUESTIONS, OR THE ARRAYS WON'T HAVE THE CORRECT # OF OBJECTS
        String[] newQuestion;
        newQuestion = new String[totalQuestions];
        String[] answerExplanation;
        answerExplanation = new String[totalQuestions];

        //Questions
        newQuestion[0] = "What is Application Software?";
        newQuestion[1] = "What is System Software?";
        newQuestion[2] = "What is Machine language or Machine Code?";
        newQuestion[3] = "What is a low-level programming language?";
        newQuestion[4] = "What is a high-level programming language?";
        newQuestion[5] = "What is syntax?";
        newQuestion[6] = "What is a program statement or command?";
        newQuestion[7] = "What is a compiler?";
        newQuestion[8] = "What is a interpreter?";
        newQuestion[9] = "What is a syntax error?";
        newQuestion[10] = "What is a logical error or a semantic error?";
        newQuestion[11] = "How should you prepare when you are about to write a new program?";
        newQuestion[12] = "What is procedural programming?";
        newQuestion[13] = "What is a procedure/method/module/function/subroutine?";
        newQuestion[14] = "Using programming terms what is object-oriented programming?";
        newQuestion[15] = "What is an Object?";
        newQuestion[16] = "What is encapsulation?";
        newQuestion[17] = "What is inheritence?";
        newQuestion[18] = "What is polymorphism?";
        newQuestion[19] = "Java is architectually neutral. What does that mean, and what allows Java to do this?";
        newQuestion[20] = "What are Java's 3 program types? Explain each.";
        newQuestion[21] = "What are the naming rules for your main class in Java.";
        newQuestion[22] = "What is a literal string?";
        newQuestion[23] = "What is an access specifier?";
        newQuestion[24] = "How do you compile then run a java file in a terminal(command prompt)?";
        newQuestion[25] = "What are the three ways to comment in java?";
        newQuestion[26] = "When you scan an integer with java.util.Scanner and then scan a string directly after, what will happen?";
        newQuestion[27] = "What are the methods used to output to the command prompt?";
        newQuestion[28] = "How do you prompt the user for input with the JOptionPane?";

        //Answer Explanations
        answerExplanation[0] = "A program that performs a task for the user, such as calculating, word processing etc";
        answerExplanation[1] = "A program that manages the system itself such as Windows or Linux";
        answerExplanation[2] = "The most basic set of instructions that a computer can execute.\n Each type of processor has it's own set of machine language instructions.";
        answerExplanation[3] = "A low-level programming language is a language that correspond closely to the computers processor circuitry.";
        answerExplanation[4] = "A high-level programming language allows you to use english-like syntax.";
        answerExplanation[5] = "Each high-level programming language has it's own syntax, meaning it's own keywords and rules for using that vocabulary.";
        answerExplanation[6] = "The lines of code, similar to giving orders to the computer; such as: output this word or multiply these digits.";
        answerExplanation[7] = "A compiler reads through an entire program, turning it to machine code and then executes it.";
        answerExplanation[8] = "An interpreter reads one line at a time, turning it into machine code and then executing it before moving to the next line.";
        answerExplanation[9] = "A syntax error occurs from the misuse of a language, such as typing system instead of System";
        answerExplanation[10] = "A logical error is when the code passes the compiler, but something about the program isin't right.\nExample: A spelling error in a literal strings.";
        answerExplanation[11] = "You should plan the program logic first and then write the program source code.";
        answerExplanation[12] = "A style of programming in which operations are executed one after another in sequence or in other words top to bottom.";
        answerExplanation[13] = "A series of statements that carry out a task.\nIn order for a program to run in Java it needs a main method.\nExample: one statements adds 3 numbers, the next divides that sum by 3 and outputs the final answer which is the average.\n *TIP: Java programmers use the term method most often.";
        answerExplanation[14] = "A style of programming in which you create classes, which are essentially blueprints for making objects, then making applications that use those objects.";
        answerExplanation[15] = "An object is a specific instance of a class.\nLike real-world objects such as my chairs, it has a state (variables) and certain behaviors which can influence state (methods).\n Example: My chair has variables such as height, armrests, wheels. And behavior such as increase height and spin around.";
        answerExplanation[16] = "Encapsulation is the enclosure of data and methods within an object.\nIf you have a class that has\nprivate int myMoney = 50;\npublic int showMoney(){\nreturn myMoney;\n}\nThey can see how much money I have, but not modify it.";
        answerExplanation[17] = "The ability to create classes that share the same attributes and methods of existing classes, and allowing you to make them more specific.\nExample: If you have a Car class and then a convertible it can inherit Cars attributes because it is a car, but can add more data such as removable roof.";
        answerExplanation[18] = "The ability to use the same methods correctly in different situations\nThe + sign is polymorphic because between two strings it cascades them, but between two integers it does arithmetic.";
        answerExplanation[19] = "Architecturally neutral means it can run on any OS or device.\nJava can do this because it does not execute the instruction on the computer directly, rather it goes through the Java Virtual Machine (JVM).";
        answerExplanation[20] = "Applets: Programs embedded in a web page\nConsole applications is output to a terminal(command prompt)\nWindowed applications use GUI features.";
        answerExplanation[21] = "Your main class must be the same name as your saved .java file.\nConvetion is to use UpperCamelCasing.\nClasses must begin with either a letter, underscore or dollar-sign(Instructors in this course want only letters).";
        answerExplanation[22] = "Text that is output exactly as it is written in the source code. In java literal strings are always written between double-quotation marks.";
        answerExplanation[23] = "It defines where that thing can be accessed from within the application.\nJava has 3 access specifiers: Public, Private and Protected.";
        answerExplanation[24] = "Open a terminal window & make sure you're in the correct directory\nCompile: javac FileName.java\nRun: java FileName";
        answerExplanation[25] = "Line Comment: //Comment\nBlock Comment /*Comment*/\nJavaDoc Comment: /**Comment*/";
        answerExplanation[26] = "The keyboard buffer will execute the stored enter-key from the integer scan giving you no time to enter a string.\nTo fix this, execute a blank scanner before the string scanner, this will \"eat\" the enter key instead of the string scanner.\nBlank Scanner: scannerName.nextLine();";
        answerExplanation[27] = "System.out.println() & System.out.print()";
        answerExplanation[28] = "JOptionPane.showInputDialog()\nYour first argument in these methods should be null, it centers the dialog in the screen\nexample: (null, \"text\")";
        
        //Looping through the arrays
        PracticeTests.qaLoop(newQuestion, answerExplanation);
    }
    //**************************************************************Chapter 2 Test*************************************************************************
    //*****************************************************************************************************************************************************
    public static void chapterTwo()
    {
        int totalQuestions = 24;		//DONT FORGET TO CHANGE THIS WHEN YOU ADD NEW QUESTIONS, OR THE ARRAYS WON'T HAVE THE CORRECT # OF VARIBLES
        String[] newQuestion;
        newQuestion = new String[totalQuestions];
        String[] answerExplanation;
        answerExplanation = new String[totalQuestions];

        //Questions
        newQuestion[0] = "What values can a Boolean data-type store?";
        newQuestion[1] = "Dealing with only digits (no decimals) what is the order from smallest to largest memory required for Java's primitive data types.";
        newQuestion[2] = "What is a variable?";
        newQuestion[3] = "What is a data-type?";
        newQuestion[4] = "What is a char data-type?";
        newQuestion[5] = "How do you declare a variable?";
        newQuestion[6] = "What is an uninitialized variable?";
        newQuestion[7] = "How do you write multiple variables on the same line?";
        newQuestion[8] = "What is a named constant?";
        newQuestion[9] = "In the statement (\"My age is\" + myAge) where myAge is an integer, what happens?";
        newQuestion[10] = "What are the relational operators used in Java?";
        newQuestion[11] = "What are Java's floating-point data-types.";
        newQuestion[12] = "How do you make a literal float data-type?";
        newQuestion[13] = "How do you create a scanner with the import: java.util.Scanner?";
        newQuestion[14] = "What are the scanner class methods to retrive: an integer, a whole line, the next token.";
        newQuestion[15] = "What is the import statement for JOptionPane?";
        newQuestion[16] = "If you prompt the user for their age with JOptionPane the number will be a string. How do you fix this?";
        newQuestion[17] = "What are Java's standard arithmatic operators?";
        newQuestion[18] = "What happens when you divide the integer 45 by 2?";
        newQuestion[19] = "What is the arithmetic operator precedence?";
        newQuestion[20] = "When does Java do automatic type-conversion in arithmetic? (implicit type-conversion)";
        newQuestion[21] = "How do you perform a type cast? (explicit type-conversion)";
        newQuestion[22] = "What should you remember about default floating-point values?";
        newQuestion[23] = "What is the assignment operator is Java?";

        //Answer Explanations
        answerExplanation[0] = "A Boolean stores only 2 values. True or False.";
        answerExplanation[1] = "Byte < Short < Int < Long";
        answerExplanation[2] = "A named memory location that holds certain data-types of variable values.";
        answerExplanation[3] = "A data type determines what type of data can be stored there, how much memory it utilizes and what operations can be performed with it.";
        answerExplanation[4] = "A data type that holds only 1 character at a time.";
        answerExplanation[5] = "write the data-type, then a name for the variable, optionally assign it a value and end with a semicolon.";
        answerExplanation[6] = "A varible that has not been assigned a value (int myAge;)\nAn uninitialized variable holds a garbage value";
        answerExplanation[7] = "The variables must be of the same data-type and you must seperate them with a comma.\nint myAge = 19, yourAge = 20;\nYou should only declare variables on the same line if they are closely related.";
        answerExplanation[8] = "A variable that once initilized can no longer change it's value. To do this you use the final keyword.\nfinal int DAYS_OF_THE_WEEK = 7;\nBy convention, when naming constants all letters should be capitals and seperate words with underscores.";
        answerExplanation[9] = "The integer is concatenated into a string, making the entire expression a string.";
        answerExplanation[10] = "< smaller than\n> bigger than\n== equal to\n<= smaller than or equal to\n>= bigger than or equal to \n!= does not equal";
        answerExplanation[11] = "Float and Double";
        answerExplanation[12] = "float myAge = 4.56F\nBy default a float is a double.";
        answerExplanation[13] = "Scanner scannerName = new Scanner(System.in)";
        answerExplanation[14] = "Integer: nextInt()\nA whole line: nextLine()\nThe next token: next()";
        answerExplanation[15] = "import javax.swing.JOptionPane;";
        answerExplanation[16] = "You can parse the string into an integer.\nExample: answer = \"19\"\nint numberAge = Integer.parseInt(answer);";
        answerExplanation[17] = "Addition: +\nSubtraction: -\nMultiplication: *\nDivision: /\nRemainder: %";
        answerExplanation[18] = "The answer will be 22, not 22.5.\nIt will not give decimals because it is an integer.\nYou can solve this by using type-conversion.\nType conversion is when you change one data-type to another.";
        answerExplanation[19] = "* / % are before + -.\nYou can alter the order it operates by using parenthesis'\n4 * 2 + 3 = 11\n4 * (2 + 3) = 4 * 5 = 20.";
        answerExplanation[20] = "When performing an operation with unlike data-types. It will select a unifying type, going up in the type list until it can find one both fit into.\n4 + 2.0 = 6.0 (a double)";
        answerExplanation[21] = "You use a cast operator.\nint one = 45, two = 2;\ndouble properDivision = (double) one / two;\n\nThis will give the proper quotient of 22.5\nIf you left the data-types as integers it would have = 22.";
        answerExplanation[22] = "They are imprecise.";
        answerExplanation[23] = "the = sign.\nDo not confuse this with ==, which is for comparing values.";
        
        //Looping through the arrays
        PracticeTests.qaLoop(newQuestion, answerExplanation);
    }
    //**************************************************************Chapter 3 Test*************************************************************************
    //*****************************************************************************************************************************************************
    public static void chapterThree()
    {
        int totalQuestions = 23;		//DONT FORGET TO CHANGE THIS WHEN YOU ADD NEW QUESTIONS, OR THE ARRAYS WON'T HAVE THE CORRECT # OF VARIBLES
        String[] newQuestion;
        newQuestion = new String[totalQuestions];
        String[] answerExplanation;
        answerExplanation = new String[totalQuestions];
        
        //Questions
        newQuestion[0] = "What is a method?";
        newQuestion[1] = "Why is creating methods outside the main method beneficial?";
        newQuestion[2] = "What are the elements of a method header?";
        newQuestion[3] = "What is a return type?";
        newQuestion[4] = "How do you call a method?";
        newQuestion[5] = "In a method header what do it's parameters do?";
        newQuestion[6] = "When dealing with multiple parameters being passed into a method, what must you make sure to do?";
        newQuestion[7] = "When dealing with methods, what is the difference between it's \"actual\" parameters and it's \"formal\" parameters?";
        newQuestion[8] = "What must you include at the end of a method that has a non-void return type?";
        newQuestion[9] = "What are data-fields?";
        newQuestion[10] = "What is the difference between static and non-static data/methods etc.";
        newQuestion[11] = "What are Getter and Setter methods?";
        newQuestion[12] = "How do you create a new object?";
        newQuestion[13] = "What is a constructor?";
        newQuestion[14] = "How do you call an object that you want to retrieve information from inside? (using a getter method)";
        newQuestion[15] = "When using Java's default constructor what values does it give to it's data-types?";
        newQuestion[16] = "How do you create your own constructor?";
        newQuestion[17] = "How are classes data-type?";
        newQuestion[18] = "What is the process that you should follow when starting a new project?";
        newQuestion[19] = "What is pseudocode/algorithm?";
        newQuestion[20] = "The next slide is an example of basic pseudocode:";
        newQuestion[21] = "What is a flowchart?";
        newQuestion[22] = "What are the basic flow chart symbols and what do they mean?";
     
        //Answers
        answerExplanation[0] = "A collection of statements grouped together to perform some sort of operation.";
        answerExplanation[1] = "When you want to perform a series of tasks you only need to call the method that performs those tasks, as opposed to re-writing all the steps.";
        answerExplanation[2] = "Access Specificer, if it's static of not, return type, legal identifier(optional parameters){}/nExample: private static void aMethod(){}";
        answerExplanation[3] = "A return type indicates what type of data that method will be returning, if it's void it does not return any data.";
        answerExplanation[4] = "You type the methods name followed by parenthesis, which optionally will intake some parameters.\n\nNote: If you are calling a method from a different class you must include it's class name first ie:\nClassName.methodName();";
        answerExplanation[5] = "It's parameters allow for outside data to be sent inside the method, which it can then manipulate.";
        answerExplanation[6] = "You must input them in the correct order.\nIf your method header parameters are int age then String name, but you pass in name first then age the types will be incompatible resulting in errors.";
        answerExplanation[7] = "Actual parameters: These are the values you pass into the method call from outside\nFormal parameters: These are the parameters in the method header, they are called formal because they receive their values from the actual parameters";
        answerExplanation[8] = "You must include a return statement.\nNote: The data that you are returning must match the data-type of the return type you declared\nExample: If your methods return type is double, the value in your return statement must be a double also.";
        answerExplanation[9] = "Varibles that you declare inside of a class but outside of any methods.";
        answerExplanation[10] = "Static: You do not need to instantiate any objects. There is only ever one version of that data, if you write over that data, the other data is lost.\nNon-static: Only usable if objects were instantiated. If you create more than one, each one will be saved to a seperate memory location allowing you to have multiple versions of that specific variable.\nNote: To write something non-static you simply don't write static.";
        answerExplanation[11] = "Setters are used to set the variables, usually of an object when their data fields are encapsulated. The getter methods are then used to acquire these variables.\nAnother name for these are accessor method (getter) and mutator method (setter).";
        answerExplanation[12] = "You declare it's type (Which must be the class it's making an object from), a legal identifier. An equal sign, then use the keyword new followed by the type with parenthesis.\nExample: Employee aJanitor = new Employee()";
        answerExplanation[13] = "A constructor is a special method that creates and initializes objects.";
        answerExplanation[14] = "objectName.getData();";
        answerExplanation[15] = "Numeric fields: 0\nCharacter fields \\u0000\nBoolean fields: false\nObject references: null";
        answerExplanation[16] = "You must name it the same as the class it's constructing, it should be public and you can't put a return type, not even void.\nExample:\npublic Employee{\nsalary = 300;}\nThis will give the numeric field a value of 300, do not put a data-type, it auto-assigns it.";
        answerExplanation[17] = "They are built much the same way as any data-types are creating, they have an:/nAn identifier\nThey store specific things\nThey perform specific tasks\nYou assign them specific methods.";
        answerExplanation[18] = "1) Problem Solving Phase: Produce an ordered sequence of steps that describe the solution to the problem (Pseudocode / Algorithm)\n2) Implementation Phase: Implement the program in a programming language.";
        answerExplanation[19] = "An informal language that helps programmers develop official algorithms in a programming language.\nIt is very similar to everyday english.";
        answerExplanation[20] = "Input a set of 4 marks.\nCalculate their average by summing the marks then dividing by 4.\nIf the average is < 50 print FAIL.\nElse print PASS.\nNote: You can go farther by making this pseudocode closer to an actual programming language but you will have to decide if you thinks it's necessary or not.";
        answerExplanation[21] = "A flowchart is a physical representation of a sequence of operations, letting you visually see how 1 operation affects another.";
        answerExplanation[22] = "Oval: Start and End of a program.\nParallelogram: Input statement\nRectangle: A process to be carried out\nDiamond: Decision (IF/ELSE etc)\nHybrid: Output statement\n Line-Arrow: Shows the logical flow.";
        
        //Looping through the arrays
        PracticeTests.qaLoop(newQuestion, answerExplanation);
    }
    //**************************************************************Chapter 4 Test*************************************************************************
    //*****************************************************************************************************************************************************
    public static void chapterFour()
    {
        JOptionPane.showMessageDialog(null, "This chapter has not yet been implemented.");
    }
    //**************************************************************Chapter 5 Test*************************************************************************
    //*****************************************************************************************************************************************************
    public static void chapterFive()
    {
        JOptionPane.showMessageDialog(null, "This chapter has not yet been implemented.");
    }
    //**************************************************************Chapter 6 Test*************************************************************************
    //*****************************************************************************************************************************************************
    public static void chapterSix()
    {
        JOptionPane.showMessageDialog(null, "This chapter has not yet been implemented.");
    }
    //**************************************************************Chapter 7 Test*************************************************************************
    //*****************************************************************************************************************************************************
    public static void chapterSeven()
    {
        JOptionPane.showMessageDialog(null, "This chapter has not yet been implemented.");
    }
    //**************************************************************Chapter 8 Test*************************************************************************
    //*****************************************************************************************************************************************************
    public static void chapterEight()
    {
        JOptionPane.showMessageDialog(null, "This chapter has not yet been implemented.");
    }
    //**************************************************************Chapter 9 Test*************************************************************************
    //*****************************************************************************************************************************************************
    public static void chapterNine()
    {
        JOptionPane.showMessageDialog(null, "This chapter has not yet been implemented.");
    }
    //**************************************************************Chapter 10 Test************************************************************************
    //*****************************************************************************************************************************************************
    public static void chapterTen()
    {
        JOptionPane.showMessageDialog(null, "This chapter has not yet been implemented.");
    }
    //**************************************************************Chapter 11 Test************************************************************************
    //*****************************************************************************************************************************************************
    public static void chapterEleven()
    {
        JOptionPane.showMessageDialog(null, "This chapter has not yet been implemented.");
    }
    //**************************************************************Chapter 12 Test************************************************************************
    //*****************************************************************************************************************************************************
    public static void chapterTwelve()
    {
        JOptionPane.showMessageDialog(null, "This chapter has not yet been implemented.");
    }
    //**************************************************************Chapter 13 Test************************************************************************
    //*****************************************************************************************************************************************************
    public static void chapterThirteen()
    {
        JOptionPane.showMessageDialog(null, "This chapter has not yet been implemented.");
    }
    //**************************************************************Chapter 14 Test************************************************************************
    //*****************************************************************************************************************************************************
    public static void chapterFourteen()
    {
        JOptionPane.showMessageDialog(null, "This chapter has not yet been implemented.");
    }
    //**************************************************************Chapter 15 Test************************************************************************
    //*****************************************************************************************************************************************************
    public static void chapterFifteen()
    {
        JOptionPane.showMessageDialog(null, "This chapter has not yet been implemented.");
    }
    //**************************************************************Chapter 16 Test************************************************************************
    //*****************************************************************************************************************************************************
    public static void chapterSixteen()
    {
        JOptionPane.showMessageDialog(null, "This chapter has not yet been implemented.");
    }
}
