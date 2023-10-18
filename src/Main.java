import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        boolean cont = false;
        String contYN;
        String word;

        System.out.println("Enter a word or phrase:");
        word = scan.nextLine();

        if(word.length() > 1){
            do{
                int random = (int) (Math.random()*word.length());
                word = word.substring(0, random) + word.substring(random +1);
                System.out.println("Your new word/phrase is: " + word);
                if (word.length() > 1){
                    System.out.println("Again?[Y/N]");
                    contYN = scan.nextLine();
                    if(contYN.equals("N")){
                        cont = false;
                    }
                }
                else{
                    System.out.println("Your word/phrase can't be smaller.");
                    cont = false;
                }
            } while (!cont);
        } else{
            System.out.println("Your word/phrase is too small to continue");
        }
    }
}