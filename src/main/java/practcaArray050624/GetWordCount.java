package practcaArray050624;

/*Create a method that takes a string and returns the word count. The string will be a sentence.

Examples
countWords("Just an example here move along") ➞ 6

countWords("This is a test") ➞ 4

countWords("What an easy task, right") ➞ 5*/
public class GetWordCount {

    public static int countWords(String str) {

        String[] arr = str.split(" ");

        int cont = 0;

        for (int i = 0; i < arr.length; i++) {

            if (!arr[i].isEmpty()) {

                cont++;

            }

        }
        return cont;
    }
        public static void main (String[]args ){

            String frase = ("Just an example here move along");

            System.out.println(countWords(frase));
        }
    }

