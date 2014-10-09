/**
 * Network Communications Course
 * 
 * @author Michael Gergely
 */

//Imports
import javax.swing.JOptionPane;

//=====================================================================================================================================================
//===================================================Network Communications Course=====================================================================
//=====================================================================================================================================================
public class NCTest 
{
    //Prompts the user for an IOOP Chapter to use
    public static void chapterSelection()
    {
        JOptionPane.showMessageDialog(null, "Welcome to the Network Communications Test!", "1360", JOptionPane.INFORMATION_MESSAGE);
        //Chapter selection
        String chapterSelection = JOptionPane.showInputDialog(null, "What chapter are you looking to study?", "Input a chapter #", JOptionPane.QUESTION_MESSAGE);
        int chapterNumber = Integer.parseInt(chapterSelection);
        //Users parsed input == an int, then the corresponding chapter's number == true, then it runs that chapter.
        boolean chapterOne = (chapterNumber == 1), chapterTwo = (chapterNumber == 2), chapterThree = (chapterNumber == 3), 
        chapterFour = (chapterNumber == 4), chapterFive = (chapterNumber == 5), chapterSix = (chapterNumber == 6),
        chapterSeven = (chapterNumber == 7), chapterEight = (chapterNumber == 8), chapterNine = (chapterNumber == 9),
        chapterTen = (chapterNumber == 10), chapterEleven = (chapterNumber == 11), chapterTwelve = (chapterNumber == 12);
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
    }
    
    //**************************************************************Chapter 1 Test*************************************************************************
    //*****************************************************************************************************************************************************
    public static void chapterOne()
    {
        //Variables & Arrays to be used (add these seperately to each chapter as total questions may be different)
        int totalQuestions = 24;		//DONT FORGET TO CHANGE THIS WHEN YOU ADD NEW QUESTIONS, OR THE ARRAYS WON'T HAVE THE CORRECT # OF OBJECTS
        String[] newQuestion;
        newQuestion = new String[totalQuestions];
        String[] answerExplanation;
        answerExplanation = new String[totalQuestions];
        
        //Questions
        newQuestion[0] = "At it's basics what is a computer network?";
        newQuestion[1] = "What is a sneaker net?";
        newQuestion[2] = "What is a mainframe computer?";
        newQuestion[3] = "What is ARPANet?";
        newQuestion[4] = "What is the World Wide Web?";
        newQuestion[5] = "What is the difference between WAN, LAN & MAN Netoworks?";
        newQuestion[6] = "What is a peer-to-peer network?";
        newQuestion[7] = "What are the pros and cons of a peer-to-peer network?";
        newQuestion[8] = "What is a client/server network?";
        newQuestion[9] = "How does a client/server network work internally?";
        newQuestion[10] = "What are the pros and cons of a client/server network?";
        newQuestion[11] = "What is a physical topology? What is a logical topology?";
        newQuestion[12] = "What is a bus topology?";
        newQuestion[13] = "What are the pros and cons of a bus topology?";
        newQuestion[14] = "What is a star topology?";
        newQuestion[15] = "What are the pros and cons of a star topology?";
        newQuestion[16] = "What is a ring topology?";
        newQuestion[17] = "How does a ring topology work internally?";
        newQuestion[18] = "What are the pros and cons of a ring topology?";
        newQuestion[19] = "What is a mesh topology?";
        newQuestion[20] = "What are the pros and cons of a mesh topology?";
        newQuestion[21] = "What is a point-to-point topology?";
        newQuestion[22] = "What is a point-to-multipoint topology?";
        newQuestion[23] = "What is a hybrid topology?";
        
        //Answers
        answerExplanation[0] = "A group of computers that are connected to eachother and can transfer data back and forth.";
        answerExplanation[1] = "A network that you literally have to transport data by foot with some sort of external device.";
        answerExplanation[2] = "A computer that stores all information, usually has dumb terminal hooked up to it.\nDumb terminals are literally just a keyboard and monitor that can access the data from the mainframe computer.";
        answerExplanation[3] = "It used several mainframe computers in different areas that were all connected, It later evolved into what we know today as the Internet.";
        answerExplanation[4] = "A service that runs ontop of the Internets infrastructure, allowing us to utilize web browser to view content in a more appealing way.\nThe Internet and World Wide Web are NOT the same thing. The Internet is software and hardware infrastucture.";
        answerExplanation[5] = "WAN: Wide Area Networks that stretch across large geographical areas ranging from several cities to the size of the Internet itself.\nLAN: Local Area Networks can be as small as 1 room up to around 2-3 close buildings maximum.\nMAN: Metropolitan Area Networks have a maximum range of about 50km's, such as a city.";
        answerExplanation[6] = "Each computer acts independantly but can share data and resources with others on the network.";
        answerExplanation[7] = "Pros: Easy to set up, no extra computers required.\nCons: Each user must create an account on their computer for each other user on the network, and when a user must change settings each other users needs to change their settings aswell.";
        answerExplanation[8] = "There is one main server that handles network management, stores all users, and the resources they share.";
        answerExplanation[9] = "To access data on the network an authentication is sent to the server and the server figures out what access that user has.\nIt sends a token to the user which details what it has access to.\nEach time after when the user tries to access data on the network it will review the token to see if he can use it or not.";
        answerExplanation[10] = "Pros: All users are managed by the server itself, making it simpler for the users themselves.\nCons: You need a server for it to run on, making it more expensive that peer-to-peer.";
        answerExplanation[11] = "Physical: Meaning the actual shape and type of the cables etc\nLogical: Meaning the shape that the data takes while travelling through the network.";
        answerExplanation[12] = "All computers on the network are attached to a main cable called a backbone.";
        answerExplanation[13] = "Pros: Easy to build.\nCons: If the backbone breaks all computers will go down. Data can collide if more than one send their data at once.";
        answerExplanation[14] = "A number of devices are connected to a central switch or router.";
        answerExplanation[15] = "Pros: If a cable breaks only the computer connected to that cable will go down.\nIf central device breaks, all go down.";
        answerExplanation[16] = "Like a bus it has a backbone but it forms a ring instead of a line.";
        answerExplanation[17] = "A token travels constantly in a set direction checking when passing a computer if it wants to send any data.\nA computer will send a data pack, when the designation computer receives the data pack it send back an acknowledgement packet.\nThe token then proceeds to travel normally again.";
        answerExplanation[18] = "Pros: Data does not collide like in a default bus network.\nCons: If backbone goes down all devices lose connection. Network becomes very slow when multiple devices need to send data.";
        answerExplanation[19] = "All devices are directly connected to every other device on the network.\nNote: You can calculate how many connections are needed with this equation:\n n(n-1) / 2.    n = number of devices.";
        answerExplanation[20] = "Pros: High redundancy.\nCons: Can become very expensive.\nNote: You can create a partial-mesh topology by not connecting some devices to others.";
        answerExplanation[21] = "One device is connected to one other inside a network. Commonly used when a computer needs to remotely access another.";
        answerExplanation[22] = "One device is connected to multiple devices.\nNote: It is rarely used to connect one computer to multiple computers. Rather a switch or router to multiple other devices.";
        answerExplanation[23] = "Any combination of basic topologies, such as a star-bus topology.";
        
        //Looping through the arrays
        PracticeTests.qaLoop(newQuestion, answerExplanation);
    }
    //**************************************************************Chapter 2 Test*************************************************************************
    //*****************************************************************************************************************************************************
    public static void chapterTwo()
    {
        //Variables & Arrays to be used (add these seperately to each chapter as total questions may be different)
        int totalQuestions = 19;		//DONT FORGET TO CHANGE THIS WHEN YOU ADD NEW QUESTIONS, OR THE ARRAYS WON'T HAVE THE CORRECT # OF OBJECTS
        String[] newQuestion;
        newQuestion = new String[totalQuestions];
        String[] answerExplanation;
        answerExplanation = new String[totalQuestions];
        
        //Questions
        newQuestion[0] = "What is the OSI model?";
        newQuestion[1] = "What are the 7 layers of the OSI model?";
        newQuestion[2] = "In what form is the data on the various layers?";
        newQuestion[3] = "What is it called as data moves down from layer 7 to layer 1, what is it called when it moves from layer 1 to layer 7?";
        newQuestion[4] = "What is the application layer responsible for?";
        newQuestion[5] = "What is the presentation layer responsible for?";
        newQuestion[6] = "What is the session layer responsible for?";
        newQuestion[7] = "What is the transport layer responsible for?";
        newQuestion[8] = "What is the network layer responsible for?";
        newQuestion[9] = "What is the data-link layer responsible for?";
        newQuestion[10] = "What are the two sub-layers of the data-link layer and what are their purpose?";
        newQuestion[11] = "What is the physical layer responsible for?";
        newQuestion[12] = "What is the TCP/IP model?";
        newQuestion[13] = "What are the layers of the TCP/IP model?";
        newQuestion[14] = "What is the application layer responsible for?";
        newQuestion[15] = "What is the transport layer responsible for?";
        newQuestion[16] = "What is the internet layer responsible for?";
        newQuestion[17] = "What is the network interface layer responsible for?";
        newQuestion[18] = "How can you find your IP address and related information from the command prompt?";
        
        //Answers
        answerExplanation[0] = "Open Systems Interconnection model. It is a framework to describe the steps data takes when travelling a network.";
        answerExplanation[1] = "7) Application Layer 6) Presentation Layer 5) Session Layer 4) Transport Layer\n3) Network Layer 2) Data-Link layer 1) Physical Layer";
        answerExplanation[2] = "7-5) Data 4) Segment 3) Packet 2) Frame 1) Bits";
        answerExplanation[3] = "7 to 1 = Encapsulation / 1 to 7 = de-encapsulation.";
        answerExplanation[4] = "The application layer contains all the services and protocols that are required by the OS or application to communicate with the network.";
        answerExplanation[5] = "The presentation layer is concerned with how data is presented to the network.\nTranslation: Makes data from 1 device compatible with another device.\nCompression: Makes data smaller so that more can move across the network faster\nEncryption: Encrypts data that it sends and decrypts data it receives.";
        answerExplanation[6] = "The session layer is responsible for managing dialog b/w devices, it can establish, manage and terminate connections.\nThe type of communication can be duplex (2 way), half-duplex (1 at a time) or simplex (1 way (one receiver + one sender))";
        answerExplanation[7] = "The transport layer is concerned with reliably getting data to it's destination.\nUsing either connection-oriented (TCP) or connectionless(UDP) protocols.";
        answerExplanation[8] = "The network layer is responsible for end-to-end communications (one network to another) using logical addresses (IP).\nRouting is using on this level to assure data will get to it's destination no matter how far away.";
        answerExplanation[9] = "The data-link layer is concerned with MAC addresses for node-to-node communications.";
        answerExplanation[10] = "Logical Link Control: LLC is used to communicate b/w upper and lower layers, address notification and error correction.\nMedia Access Control: MAC is used to determine what devices have access to the network, aswell as frame synchronization (where they end and begin)";
        answerExplanation[11] = "The physical layer deals with all physical aspects of moving data such as cable standards, wireless (microwaves, AM & FM etc), fibre-optic and other ways of moving data in bits.";
        answerExplanation[12] = "A model that was built around the TCP/IP protocol suite, which is a collection of the most commonly used protocols today.";
        answerExplanation[13] = "4) Application layer 3) Transport layer 2) Internet layer 1) Network Interface layer";
        answerExplanation[14] = "Includes the functions of the layers 7-5 of the OSI model.";
        answerExplanation[15] = "It has the same function as the transport layer of the OSI model, but also has some protocols that use session layer utility.";
        answerExplanation[16] = "This layer functions the same as the network layer of the OSI model, but also uses LLC from the data-link layer.";
        answerExplanation[17] = "This layer provides the MAC functionality of the data-link layer as well as the physical layer.";
        answerExplanation[18] = "Use the ipconfig command, or ipconfig /all for a more detailed output.\nTyping ipconfig ? will give you many more commands that are related.";
        
        //Looping through the arrays
        PracticeTests.qaLoop(newQuestion, answerExplanation);
    }
    //**************************************************************Chapter 3 Test*************************************************************************
    //*****************************************************************************************************************************************************
    public static void chapterThree()
    {
        //Variables & Arrays to be used (add these seperately to each chapter as total questions may be different)
        int totalQuestions = 28;		//DONT FORGET TO CHANGE THIS WHEN YOU ADD NEW QUESTIONS, OR THE ARRAYS WON'T HAVE THE CORRECT # OF OBJECTS
        String[] newQuestion;
        newQuestion = new String[totalQuestions];
        String[] answerExplanation;
        answerExplanation = new String[totalQuestions];
        
        //Questions
        newQuestion[0] = "How is cable denoted?";
        newQuestion[1] = "What is UTP and what are it's attributes?";
        newQuestion[2] = "What are the common RJ Connectors used today, what is their purpose and how many pairs does each have?";
        newQuestion[3] = "What are the differences between CAT5, CAT5e and CAT6 cabling?\n(How many pairs it has, how many MHz, how many pairs do they transmit on at once)";
        newQuestion[4] = "What is the order of TIA/EIA 568 standards A and B?";
        newQuestion[5] = "If a cable has 568a on one end and 568b on the other what is it called? If it has the same standard on both ends what is it called?";
        newQuestion[6] = "When would you use a standard cable?\nWhen would you use a crossover cable?";
        newQuestion[7] = "What are the characteristics of baseband signaling?";
        newQuestion[8] = "What are the characteristics of broadband signaling?";
        newQuestion[9] = "What is a rollover cable?\nWhat is a hardware loopback?";
        newQuestion[10] = "With coaxial cable what are the common RG types and their purpose?";
        newQuestion[11] = "What is BPL?";
        newQuestion[12] = "When sending bits over a network what is the difference between serial and paralell transmission?";
        newQuestion[13] = "What are the speeds of USB 1.0, 2.0 & 3.0";
        newQuestion[14] = "What are problems related to copper cabling?";
        newQuestion[15] = "When talking about speed what does bandwidth, latency and throughput mean?";
        newQuestion[16] = "What are the 2 mediums(cores) that fibre op supports for transmitting data?\nWhat type of light-source is used on each core?";
        newQuestion[17] = "What are the pros of fibre op over copper cabling?";
        newQuestion[18] = "What are the cons of fibre op cabling?";
        newQuestion[19] = "What is the main differences between multi-mode fiber and single-mode fiber?";
        newQuestion[20] = "What are the common fiber op connectors?";
        newQuestion[21] = "What is the most commonly used wireless LAN standard?";
        newQuestion[22] = "What are the properties of 801.11a?\nFrequency range, speed, how many non-overlapping channels.";
        newQuestion[23] = "What are the properties of 801.11b?\nFrequency range, speed, how many non-overlapping channels.";
        newQuestion[24] = "What are the properties of 801.11g?\nFrequency range, speed, how many non-overlapping channels.";
        newQuestion[25] = "What are the properties of 801.11n?\nFrequency range, speed, how many non-overlapping channels.";
        newQuestion[26] = "What standard has the farthest range, which has the shortest?";
        newQuestion[27] = "802.11n uses channel bonding. What does this mean?";
        
        //Answers
        answerExplanation[0] = "n <signaling type>-X\nN = rate in mbps\n<sinaling type> = broadband or baseband\nX = Identifier of cabling scheme";
        answerExplanation[1] = "Unshielded Twisted Pair cable. Minimizes crosstalk, cheap and easy to work with.\nShield Twisted Pair (STP) is rarely used, same concept as UTP but with foil around wires.";
        answerExplanation[2] = "RJ-11: Used for Telephone + DSL (2 Pairs)\nRJ-45: Standard for ethernet networks. (4 Pairs)";
        answerExplanation[3] = "CAT5: 4 pairs, 100MHz, transmits on 2 pairs at a time.\nCAT5e: 4 pairs, 100MHz, transmits on all 4 at once.\nCAT6: 4 pairs, 250MHz, transmits on all 4 at once.";
        answerExplanation[4] = "568a: 1)green-white 2) green 3) orange-white 6) orange\n568b: 1) orange-white 2) orange 3) green-white 6) green\n*Both have 4) blue 5) blue-white 7) brown-white 8) brown";
        answerExplanation[5] = "568a one end, 568b other end: Standard Cable\nSame standard on both ends: Crossover cable.";
        answerExplanation[6] = "Standard: For connecting dissimilar devices\nCrossover: For connection similar devices.";
        answerExplanation[7] = "Digital signal. Single channel (bi-directional).";
        answerExplanation[8] = "Analog signal. 2 channels (uni-directional). Multiplexes signals by overlapping on a portion of bandwidth.";
        answerExplanation[9] = "Rollover: Allows you to connect to a router to confgure it.\nHardware loopback: Tricks the device into thinking it's output is input (for testing purposes).";
        answerExplanation[10] = "RG-59: Cable tv RG-6: Cable tv + modems\nCoaxial cable is plenum-rated (It does not release toxic fumes when burnt)";
        answerExplanation[11] = "Broadband over Powerline: Used in less developed area, using power cables to carry data.";
        answerExplanation[12] = "Serial: Sends 1 bit after another.\nParallel: Sends 8 bits at once in-line. (This is not suggested at higher speeds as bits arrive at different intervals)";
        answerExplanation[13] = "1.0: 12Mbps\t2.0: 480Mbps\t3.0: 4.8Gbps";
        answerExplanation[14] = "Attenuation: Signals degrade over long distances.\nCrosstalk: Signals from 1 wire can bleed over into nearby cables.\nSecurity: Electromagneticism can be manipulated to intercept data as it travels the cable.";
        answerExplanation[15] = "Bandwidth: THe number of signals a wire can carry.\nLatency: The time it takes for a signal to travel from point a to point b.\nThroughput: Takes into account bandwidth and latency to provide the true functional speed of a network.";
        answerExplanation[16] = "Plastic: LED light\nGlass: Lasers";
        answerExplanation[17] = "Immunity to EMI & RFI. Ability to travel much farther in a single hop (25 miles).";
        answerExplanation[18] = "Difficult + expensive to install.\nDifficult to troubleshoot + expensive troubleshooting equipment.";
        answerExplanation[19] = "Multi-mode: Used for smaller distances (plastic core + LED light source)\nSingle-mode: Used for longer distances (glass core + laser light source)";
        answerExplanation[20] = "Subscriber Connector, Straight tip, small-form factor.";
        answerExplanation[21] = "IEEE 802.11";
        answerExplanation[22] = "Frequency range: 5GHz\nSpeed:22mbps\nNon-overlapping channls: 8";
        answerExplanation[23] = "Frequency range: 2.4GHz\nSpeed:2.5mbps\nNon-overlapping channls: 3";
        answerExplanation[24] = "Frequency range:2.4GHz\nSpeed:22mbps\nNon-overlapping channls: 3";
        answerExplanation[25] = "Frequency range: 5GHz & 2.4GHz\nSpeed:100-200mbps\nNon-overlapping channls: 3 in 2.4GHz range, 12 or 24 in 5GHz range.";
        answerExplanation[26] = "Farthest: 802.11n, shortest: 802.11a";
        answerExplanation[27] = "Channle bonding allows adjacent channles to be linked together to increase the throughput of the network.";
        
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
}
