import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);//set up scanner. 

        System.out.println("Hello. What is your name?");
        String name = scan.nextLine();//Pick up user's name and store it. 

                           
        //add new a line before asking next question. 
        System.out.println("\nHi " + name + "! I'm Javabot. Where are you from?");
        String home = scan.nextLine();//Pick up user's home and store it. 
                        

        //add new a line before asking next question.
        System.out.println("\nI hear it's beautiful at " + home + "! I'm from a place called Oracle.");
        System.out.println("How old are you?");
        int age = scan.nextInt();//Pick up age and store it.

        scan.nextLine(); //throwaway

        //add new a line before asking next question.
        System.out.println("\nSo you're " + age + ", cool! I'm 400 years old.");
        System.out.println("This means I'm " + (400/age) + " times older than you.");
        System.out.println("Enough about me. What's your favourite language? (just don't say Python)");
        String language = scan.nextLine();//Pick up language and store it. 


        //add new a line here.
        System.out.println("\n" + language + ", that's great! Nice chatting with you, " + name + ". I have to log off now. See ya!");
        
        scan.close();//close scanner. 

        
    }
}
