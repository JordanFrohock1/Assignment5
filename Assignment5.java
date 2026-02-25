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
     System.out.println("Would you like to see a dog or a cat?");
    String answer = System.console().readLine();
    while (!answer.equals("dog") && !answer.equals("cat")) {
        System.out.println("Please input either dog or cat");
        answer = System.console().readLine();
    }
    
    if (answer.equals("dog")) {
        System.out.println("Dog ASCII ART HERE");
    
    } else if(answer.equals("cat")) {
        System.out.println("Cat ASCII ART HERE");


    } 

}
}