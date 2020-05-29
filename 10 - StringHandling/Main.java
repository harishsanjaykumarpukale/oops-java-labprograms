
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String sentence;
        int choice;
        Scanner scanner = new Scanner(System.in);
        while(true) {

            System.out.print("\n Press \n 1 for penulutimate word \n 2 for replace \n 3 for substrings \n 4 for exit \n :");
            choice = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter the sentence:");
            sentence = scanner.nextLine();
            String[] subStrings = sentence.split(" ");
            switch(choice) {
                case 1:
                    if(subStrings.length<2) {
                        System.out.print("The sentence entered should contain atleast 2 words ");
                        break;
                    }

                    System.out.print("The penultimate word is " + subStrings[subStrings.length-2]);

                    break;
                case 2:
                    String newSentence = "";
                    for(String subString : subStrings) {
                        if(subString.equalsIgnoreCase("python")) {
                            newSentence = newSentence.concat("java");
                        }
                        else if(subString.equalsIgnoreCase("java")) {
                            newSentence = newSentence.concat("python");
                        }
                        else {
                            newSentence = newSentence.concat(subString);
                        }

                        if(!subString.equals(".")){
                            newSentence = newSentence.concat(" ");
                        }
                    }
                    System.out.print("The sentence after replacement is :" + newSentence);
                    break;
                case 3:
                    System.out.print("The sub-strings are:\n");
                    for(String subString : subStrings)
                        System.out.println(subString);
                    break;
                case 4:
                default:
                    System.exit(0);
            }
        }
    }
}
