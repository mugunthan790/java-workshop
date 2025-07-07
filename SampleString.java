public class SampleString {

    public static void main(String[] args) {
    String sentance = "this program show how can we split a"+ " string into nultiple string. we need to find sentance,"+"word and letter";
    String words[] = sentance.split(sentance);
    String[] sentence = sentance.split(\\.);
    String[] letters = sentance.split(" ");
    System.out.println("The sentence is: " + sentance);
    System.out.println("The words are: ");


   }
}