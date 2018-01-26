import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Zeno on 1/26/18.
 */
public class Solution {
    public static String replaceWords(List<String> dict, String sentence) {
        if(sentence == ""){
            return "";
        }
        String[] splitSentence = sentence.split("\\s+");
        dict.sort(Comparator.naturalOrder());
        int sentenceLength = splitSentence.length;
        int dictLength = dict.size();
        for(int i = 0; i < sentenceLength; i ++){
            for(int j = 0; j < dictLength; j ++){
                if(splitSentence[i].startsWith(dict.get(j))){
                    splitSentence[i] = dict.get(j);
                }
            }
        }
//        System.out.println(splitSentence.toString());
        String ret = "";
        ret += splitSentence[0];
        for(int i = 1; i < sentenceLength; i ++){
            ret += " ";
            ret += splitSentence[i];
        }
        return ret;
    }
    public static void main(String[] args){
        List<String> dict = new ArrayList<String>();
        dict.add("cat");
        dict.add("bat");
        dict.add("rat");

        String sentence = "the cattle was rattled by the battery";
        System.out.println(replaceWords(dict, sentence));

    }
}
