package fr.wildcodeschool.java;

import java.util.HashMap;

public class DnaStrand2 {

    private final static HashMap<Character, Character> map = new HashMap<>();

    static {
        map.put('T', 'A');
        map.put('A', 'T');
        map.put('C', 'G');
        map.put('G', 'C');
    }


    /**
     *
     * @param dna
     * @return
     */
    public static String makeComplement(String dna) {

        StringBuffer sb = new StringBuffer();
        for(char c : dna.toCharArray()) {
            char subsChar = map.getOrDefault(c, c);
            sb.append(subsChar);
        }
        return sb.toString();
    }
}