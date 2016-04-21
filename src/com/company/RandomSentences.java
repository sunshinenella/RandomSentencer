package com.company;

import java.util.Random;

class RandomSentences {


    /**
     * Arrays with rules
     */
    static final private String[] Conjuction = {"and", "or", "but", "because"};
            static final private String Proper_noun [] = {"Fred", "Jane", "Richard Nixon", "Miss America"};
            static final private String Common_noun [] = {"man", "woman", "fish", "elephant", "unicorn"};
            static final private String Determiner [] = {"a", "the", "every", "some"};
            static final private String Adjective [] = {"big", "tiny", "pretty", "bald"};
            static final private String Intransitive_verb [] = {"runs", "jumps", "talks", "sleeps"};
            static final private String[] Transitive_verb = {"loves", "hates", "sees", "knows", "looks for", "finds"};


    /**
     * The main routine prints out one random sentence every three
     * seconds, forever (or until the program is killed).
     */
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Random t = new Random();
        }


        }






    /**
     * Generate a random sentence, following the grammar rule for a sentence.
     */
    static void randomSentence() {

		/* A simple sentence */

        randomSimpleSentence();

		/* Optionally, "and" followed by another simple sentence.*/

        if (Math.random() > 0.75) {
            // 25% of sentences continue with another clause.
            System.out.print(" and ");
            randomSimpleSentence();
        }
    }

    /**
     * Generate a random simple_sentence, following the grammar rule for a simple_sentence.
     */
    static void randomSimpleSentence() {



        System.out.print("this is ");
        if (Math.random() > 0.15) { // 85% of sentences have a noun phrase.
            randomNounPhrase();
        }
        System.out.print("the house that Jack built");
    }

    /**
     * Generates a random noun_phrase, following the grammar rule for a noun_phrase.
     */
    static void randomNounPhrase() {



        int n = (int)(Math.random()*Proper_noun.length);
        System.out.print("the " + Proper_noun[n]);



        if (Math.random() > 0.75) {
            int m = (int)(Math.random()*Conjuction.length);
            System.out.print(" " + Conjuction[m]);
        }



        int v = (int)(Math.random()*Intransitive_verb.length);
        System.out.print(" that " + Intransitive_verb[v] + " ");



        if (Math.random() > 0.5) {
            randomNounPhrase();
        }

        int p = (int)(Math.random()*Common_noun.length);
        System.out.println("" + Common_noun);

        int r = (int)(Math.random()* Determiner.length);
        System.out.println("" + Determiner);

        int s = (int)(Math.random()*Adjective.length);
        System.out.println("" + Adjective);

        int o = (int) (Math.random()*Transitive_verb.length);
        System.out.println("" + Transitive_verb);
    }

}










