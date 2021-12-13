import java.lang.reflect.Array;
import java.util.ArrayList; // import the ArrayList class
import java.util.LinkedList;



import javax.sound.midi.Patch;


public class Main {
    public static void main(String[] args) {

        //WINNING PLAN -- CREATING CLASSES & OBJECTS SECTIONS

        System.out.println("CREATING A CLASS");

        WinningPlan wp = new WinningPlan();
        wp.wakeUp();
        wp.study();
        wp.win();
        System.out.println("--------------");



        // CLASSOBJECTDEF - DEFINTIONS
        System.out.println("DEFINING CLASS/OBJECTS/CONSTRUCTORS");

        ClassObjectsDef cbd = new ClassObjectsDef();
        cbd.classDef();
        cbd.objectDef();
        cbd.ConstrDef();
        cbd.ClassConstdef();

        System.out.println("--------------");



        //ENCAPUSALTION

        System.out.println("ENCAPSULATION");

        System.out.println("Encapsulations is the enclosing or protecting of data");

        System.out.println("ADD THIS INFORMATOIN AFTER I FIND OUT MORE ABOUT THIS INFORMATION");

        System.out.println("--------------");


        //Inheritance

        System.out.println("INHERETANCE");


        System.out.println("Inhereitnace is the passing of class properties to their children elements");

        
        Soccer sc = new Soccer();
        //INHERRITED THROUGH THE CLASS
        sc.makeContactWithBall();
        sc.makeToKickTheBall();
        sc.bringASoccerBall();
        //INHERRITED THROUGH THE CLASS
        sc.bringABall();

        Tennis ten = new Tennis();
        ten.makeContactWithBall();
        ten.bringATennisBall();
        ten.makeToHitTheBall();
        ten.bringABall();

        System.out.println("--------------");

        //POLYMORPHISM

        System.out.println("POLYMORPHSIM");


        System.out.println("Polylmorphism is the ability of an object ot behave in multiple forms.");

        Painting pg = new Painting();
        pg.supplies();
        pg.paintingIdea();

        Painting1 p1 = new Painting1();
        p1.supplies();
        p1.paintingIdea();

        Painting2 p2 = new Painting2();
        p2.supplies();
        p2.paintingIdea();

        System.out.println("--------------");


        // //ABSTRACTIONS

        System.out.println("ABSTRACTION");

        System.out.println("--------------");


        //INTERFACE 

        System.out.println("INTERFACE");

        System.out.println("--------------");


       //STATIC/VOID/KEYWORD 

       System.out.println("STATIC/VOID/KEYWORD");

       System.out.println("---Static");

        String[] StaticFact = {"Used for memory storage and works with methods/variables", "can label anythat static that is available and not an an object", "it a keyword that mark an item as a class memebr"};

        for(int i = 0; i < StaticFact.length; i++) {
            System.out.println(StaticFact[i]);
        }

        System.out.println("---Void");
            String[] voidFact = {"changes the state of an object without updateing the statuts"};

            for (int a = 0; a < voidFact.length; a++) {
                System.out.println(voidFact[a]);
            }

        System.out.println("---Final");

        String[] finalFact = {"when the state is constant and can't be changes"};

        for(int b = 0; b < finalFact.length; b++) {
            System.out.println(finalFact[b]);
        }

       System.out.println("--------------");

       //WHILE LOOP

       System.out.println("WHILE LOOP");

       System.out.println("While loops are used with user input");
       System.out.println("Execututes a block of code based on condition");


       int appleseed = 10;
       System.out.println("---While Loop Results:----");
       while(appleseed > 8) {
        System.out.println("While loop is true");
        appleseed = appleseed - 1;

       }
       
       System.out.println("While loop is failed");

       System.out.println("--------------");

        //Do WHILE LOOP

        System.out.println("Do WHILE LOOP");

        System.out.println("DO WHILE LOOPS USED WITH BANK PIN TYPE PROGRAMMING");
        System.out.println("it will always execute the code at least once");
 
       int pinInput = 12223;

      do {
        System.out.println("What is you bank pin code");

      } while (pinInput == 1234);

        System.out.println("While loop is failed");
 
        System.out.println("--------------"); 
        
       
      //ARRAYS

      System.out.println("ARRAYS");

      String[] ArrayFact = {"Allows for easy search features with index", "it uses a linear collection of data", "can use lots of types of data", "CON - it has a set size that is needed...but I dont use them"};

      for(int c = 0; c < ArrayFact.length; c++) {
        System.out.println(ArrayFact[c]);
      }

      System.out.println("--------------"); 


      System.out.println("VECTOR / LIST");

      //FIRST IMPORT THIS import java.util.ArrayList; // import the ArrayList class


      ArrayList ListFact = new ArrayList();

      ListFact.add("List size is flexible");
      ListFact.add("it's a wrapper over an array");
      ListFact.add("when full it doubles by half, while vector double by double the amount");
      ListFact.add("adding and removing content in the list is slower and effects preformance");

      //REMOVING IT WITH THIS TOO
    //   ListFact.remove("List size is flexible");

      System.out.println(ListFact);

      System.out.println("--------------"); 

    

      System.out.println("lINKED LIST");

      //FIRST IMPORT THIS import java.util.LinkedList; // import the ArrayList class


      LinkedList LinkedListFact = new LinkedList();

      LinkedListFact.add("Is familiar with any items before or after it");
      LinkedListFact.add("it uses nodes to connect the list");
      LinkedListFact.add("time consuming to search for the list");
      LinkedListFact.add("because of its connection with it;s nieborphors, it is quick and effectient");

      System.out.println(LinkedListFact);

      System.out.println("--------------"); 

    

      System.out.println("Exceptions");

      String[] ExepDef = {"indicate when there is a problem", "Thrown/checked is where the error is immediatley caught and through back", "Uncheck is when it passes throuhg and runs and then spots the error", "Try > needs at least one catch or final block", "Catch will find bugs with the method Try"};

      for(int d = 0; d < ExepDef.length; d++) {
        System.out.println(ExepDef[d]);
      }

      System.out.println("--------------"); 



    }   


}
