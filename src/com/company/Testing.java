package com.company;

import java.util.Random;

/**
 * Created by $Nela on 4/16/2016.
 */
public class Testing {
    public static void main(String[] args) {
        String[] Conjuction = {"and", "or", "but", "because"};
        String[] Proper_noun = {"Oliver", "Jane", "Mike", "Miss America"};
        String[] Common_noun = {"man", "woman", "fish", "elephant", "unicorn"};
        String[] Determiner = {"a", "the", "every", "some"};
        String[] Adjective = {"big", "tiny", "pretty", "bald"};
        String[] Intransitive_verb = {"runs", "jumps", "talks", "sleeps"};
        String[] Transitive_verb = {"loves,", "hates", "sees", "knows", "looks for", "finds"};
      /* rules for the sentences */




        for (int i = 0; i <= 10; i++) {
            String randomSelection = MakeSentence(Conjuction, Proper_noun, Common_noun,
                    Determiner, Adjective, Intransitive_verb, Transitive_verb);
            System.out.println(randomSelection);
        }
    }

    /* limited sentences to 10 */




    private static String randomItem(String[] listOfStrings) {
        int listSize = listOfStrings.length;
        Random random = new Random();
        int randomNumberWithinIndex = random.nextInt(listSize);
        return listOfStrings[randomNumberWithinIndex];

    }


    /* choosing random item from list of strings */

    private static String MakeSentence(String[] conjuction, String[] proper_noun, String[] common_noun, String[] determiner,
                                       String[] adjective, String[] intransitiveverb, String[] transitiveverb) {
        return randomItem(proper_noun) + " " + randomItem(transitiveverb) + " " + randomItem(conjuction) + " "
                + randomItem(intransitiveverb) + " " + randomItem(determiner) + " " + randomItem(adjective)
                + " " + randomItem(common_noun);


    }
    }
    /* printing out the results */

