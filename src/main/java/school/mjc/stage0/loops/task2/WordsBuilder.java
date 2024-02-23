package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {

        String phrase = "";
        int index = 0;
        while (index < chars.length){
            phrase += chars[index];
            index++;
        }
        System.out.println(phrase);

       }
    }

