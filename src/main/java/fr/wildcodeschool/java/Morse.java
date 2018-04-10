package fr.wildcodeschool.java;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Morse {

    public HashMap<String, String> morseMap = new HashMap<String, String>();

    public Morse() {
        morseMap.put("-.-.--", "!");
        morseMap.put("....-", "4");
        morseMap.put("..--..", "?");
        morseMap.put("--..--", ");");
        morseMap.put(".-.-.-", ".");
        morseMap.put("..---", "2");
        morseMap.put("...--", "3");
        morseMap.put("--...", "7");
        morseMap.put("-....", "6");
        morseMap.put(".....", "5");
        morseMap.put("---..", "8");
        morseMap.put("-...", "B");
        morseMap.put("----.", "9");
        morseMap.put(".--.", "P");
        morseMap.put("-----", "0");
        morseMap.put("--..", "Z");
        morseMap.put("-.--", "Y");
        morseMap.put("-..-", "X");
        morseMap.put("-.-.", "C");
        morseMap.put("...-", "V");
        morseMap.put(".----", "1");
        morseMap.put("..-.", "F");
        morseMap.put("....", "H");
        morseMap.put(".---", "J");
        morseMap.put("--.-", "Q");
        morseMap.put("-..-.", "/");
        morseMap.put(".-..", "L");
        morseMap.put("...", "S");
        morseMap.put("---", "O");
        morseMap.put("-.-", "K");
        morseMap.put(".-.", "R");
        morseMap.put("..-", "U");
        morseMap.put("-..", "D");
        morseMap.put(".--", "W");
        morseMap.put("--.", "G");
        morseMap.put("-.", "N");
        morseMap.put("--", "M");
        morseMap.put("..", "I");
        morseMap.put(".-", "A");
        morseMap.put("-", "T");
        morseMap.put(".", "E");
    }
/*
    public String convertLetter(String morse) {
        for (Map.Entry<String, String> entry : morseMap.entrySet()) {
            if (entry.getKey().equals(morse)) {
                return entry.getValue();
            }
        }
        return null;
    }
*/

    public String convertLetter(String morse) {
        return morseMap.get(morse);
    }

    public String convert(String morseComplet) {

        List<String> motsConvertis = new ArrayList<String>();

        String[] mots = morseComplet.split("[ ]{3}");
        for (String mot : mots) {
            StringBuffer motConverti = new StringBuffer();

            String[] lettres = mot.split(" ");
            for (String lettre : lettres) {
                motConverti.append(convertLetter(lettre));
            }
            motsConvertis.add(motConverti.toString());
        }
        //return String.join(" ", motsConvertis);
        return StringUtils.join(motsConvertis, " ");
    }
}
