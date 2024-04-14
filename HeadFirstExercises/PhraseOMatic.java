import java.util.Random;
public class PhraseOMatic{
    


    public static void main(String[] args){
        String[] word1 = {"marriage", "eavesdrop", "director", "relation", "temperature", "mature", "sustain", "admission", "spend", "approach"};
        String[] word2 = {"belt", "mosquito","domestic","nest","monk","cluster","dish","presentation","line","joint"};
        String[] word3 = {"choice", "stubborn", "possible", "competence", "thoughtful", "insurance", "review", "unlikely","comfortable", "positive"};
        Random randomNumber = new Random();

        String randomPhrase = word1[randomNumber.nextInt(word1.length)] +" "+ word2[randomNumber.nextInt(word2.length)] +" "+ word3[randomNumber.nextInt(word3.length)];

        System.out.println(randomPhrase);
    }

}
