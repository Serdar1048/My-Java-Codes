import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class Wordle {
    public static void main(String[] args) throws IOException {
        Random rand = new Random();
        //configuration
        int argCount = args.length;
        String[] confWords = new String[argCount];
        for (int i = 0; i < argCount; ++i) {
            confWords[i] = args[i].toUpperCase();
        }

        // I read file
        String path = "dict.txt";
        int lineCount = 2317;
        String[] wordsArr = new String[lineCount];

        BufferedReader br = new BufferedReader(new FileReader(path));
        String line;
        int index = 0;
        while ((line = br.readLine()) != null && index < lineCount) {
            wordsArr[index++] = line;
        }


        // I select a keyword
        String keyWord = wordsArr[rand.nextInt(2318)];
        check(wordsArr, keyWord, confWords);
    }

    public static void check(String[] wordsArr, String keyWord, String[] confWords) {
        int counter = 0;
        //if fewer than six parameters are entered
        while (counter < 6) {
            if (confWords.length < 6) {
                System.out.println("You must enter at least 6 parameters!");
                break;
            } else {
                for (String userWord : confWords) { // I assign my words that are parameters to my userWord variable one by one.
                    boolean isExist = false;
                    if (!userWord.equals(keyWord)) {

                        // I'm checking the number of letters
                        if (userWord.length() == 5) {

                            // I'm checking to see if the user's word is in the file
                            for (String word : wordsArr) {
                                if (userWord.equals(word)) {
                                    isExist = true;
                                    printWrongWord(keyWord, userWord, counter);
                                    counter++;
                                    break;
                                }
                            }
                            // if does not exist in file
                            if (!isExist) {
                                System.out.println("Try" + (counter + 1) + " (" + userWord + "): Word does not exist in dictionary!");
                                counter++;
                            }
                            //if less or more than word length
                        } else {
                            System.out.println("Try" + (counter + 1) + " (" + userWord + "): The length of word must be five! ");
                            counter++;
                        }
                        // if win
                    } else {
                        System.out.println("Congratulations! you guess right in " + (counter + 1) + suffixForNumber(counter + 1)
                                + " shot!");
                        break;
                    }
                    // if fail
                    if (counter == 6) {
                        System.out.println("You exceeded maximum try shot!");
                        System.out.println("You failed! The keyword is " + keyWord);
                        break;
                    }
                }
            }
            break;
        }
    }

    //I print wrong word
    public static void printWrongWord(String keyWord, String userWord, int counter) {
        String subsKeyWord[] = new String[5];
        String subsUserWord[] = new String[5];

        System.out.println("Try" + (counter + 1) + " (" + userWord + "): ");

        // I separated keyword into letters
        // I separated userword into letters
        for (int i = 0; i < 5; i++) {
            subsKeyWord[i] = keyWord.substring(i, i + 1);
            subsUserWord[i] = userWord.substring(i, i + 1);
        }

        //I check the locations of the letters and their state of existence
        for (int i = 0; i < 5; i++) {
            if (subsKeyWord[i].equals(subsUserWord[i])) {
                System.out.println((i + 1) + ". letter does exists and located in right position.");
            } else {
                boolean exist = false;
                for (int j = 0; j < 5; j++) {
                    if (subsKeyWord[j].equals(subsUserWord[i])) {
                        exist = true;
                        break;
                    }
                }
                if (exist) {
                    System.out.println((i + 1) + ". letter does exists but located in wrong position.");
                } else {
                    System.out.println((i + 1) + ". letter does not exist.");
                }
            }
        }
    }

    public static String suffixForNumber(int counter) {
        switch (counter) {
            case 1:
                return "st";
            case 2:
                return "nd";
            case 3:
                return "rd";
            case 4, 5, 6:
                return "th";
        }
        return null;
    }
}