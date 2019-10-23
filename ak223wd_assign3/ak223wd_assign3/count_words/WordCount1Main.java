package ak223wd_assign3.count_words;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class WordCount1Main {

    public static void main(String[] args){
        ArrayList<Word> wordss = new ArrayList<>();
        Set<Word> hashSet = new HashSet<>(); //Create an empty set with no duplicate
        Set<Word> treeSet = new TreeSet<>();

        try {
            Scanner sc = new Scanner(new File("/Users/AK47/IdeaProjects/1DV507/src/ak223wd_assign3/words"));
            while (sc.hasNext()){
                String tempString = sc.next();
                wordss.add(new Word(tempString));
            }

            for(Word w : wordss){
                hashSet.add(w);
                treeSet.add(w);
            }
            sc.close();

        } catch (IOException ioe){
            ioe.getCause();
        }

        System.out.println("***************HashSet Test******************\n");
        System.out.println("HashSet size : "+ hashSet.size());
        //Iterator of HashSet
        Iterator iterator1 = hashSet.iterator();
        System.out.println("HashSet iterator : ");
        while(iterator1.hasNext()){
            System.out.println(iterator1.next()+" ");
        }
        System.out.println("HashSet contains : "+hashSet.contains(1)+"\n");

        System.out.println("***************TreeSet Test******************\n");
        System.out.println("TreeSet size : "+treeSet.size());

        //Iteration of a TreeSet
        Iterator iterator;
        iterator = treeSet.iterator();
        System.out.println("TreeSet iterator : ");
        while (iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }
        //System.out.println("TreeSet contains : "+treeSet.contains(3));

        /*Word obj1 = new Word("Object number 1");
        Word obj2 = new Word("Object number 1");
        hashSet.add(obj1);
        hashSet.add(obj2);

        System.out.println(hashSet.size());*/




    }
}
