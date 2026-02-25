public class Assignment5 {
    public static void main(String[] args) {
       
    

/*Assignment5.java

git checkout -b add-all-student-names
git checkout master 
 - this goes back to the master branch
git checkout branch add-all-student-names
 - this goes back to the branch add-all-student-names
git merge master
 - this merges the master branch into the add-all-student-names branch




 */
     System.out.println("Would you like to see a dog, cat, or fish?");
    String answer = System.console().readLine();
    while (!answer.equals("dog") && !answer.equals("cat")) {
        System.out.println("Please input either dog or cat");
        answer = System.console().readLine();
    }
    
    if (answer.equals("dog")) {
        System.out.println("                                            .-.");
        System.out.println("               (___________________________()6 `-,");
        System.out.println("                (   ______________________   /''\"`");
        System.out.println("                //\\\\                      //\\\\");
        System.out.println("               \"\" \"\"                     \"\" \"\"");

    
    } else if(answer.equals("cat")) {
        System.out.println("(\"`-''-/\").___..--''\"`-._");
        System.out.println(" `6_ 6  )   `-.  (     ).`-.__.`)");
        System.out.println(" (_Y_.)'  ._   )  `._ `. ``-..-'");
        System.out.println("   _..`--'_..-_/  /--'_.'");
        System.out.println("  ((((.-''  ((((.'  (((.-'");



    } else {
        System.out.println("  _");
        System.out.println("><_>");

    }

}
}