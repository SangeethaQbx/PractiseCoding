import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.util.stream.Collectors;

public class LongestTextInFile {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("src\\main\\resources\\Sample.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        List<String> l=br.lines().collect(Collectors.toList());
        ArrayList<String> list=new ArrayList<>();
        for (String str:l){
         String[] s= str.split(" ");
            Collections.addAll(list,s);
        }
        System.out.println(list);
        String max=list.get(0);
        for (String s:list) {
            if (max.length()<s.length()) {
                max = s;
            }
        }  System.out.println("The Largest String in the text is "+max);
    }
}
