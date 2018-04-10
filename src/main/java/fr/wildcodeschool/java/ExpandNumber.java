package fr.wildcodeschool.java;

import org.apache.commons.lang3.StringUtils;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ExpandNumber {

    public static String expandedForm1(int num) {
        // découpage en caractères
        char[] chars = Integer.toString(num).toCharArray();

        String[] array = new String[chars.length];
        int maxLength = 0;

        // replissage du tableau
        for(int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if(c != '0') {
                array[maxLength] = padWithZeroes(c, chars.length - i -1);
                maxLength++;
            }
        }

        // fabrication du résultat
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < maxLength; i++) {
            sb.append(array[i]);
            if(i < maxLength -1) {
                sb.append(" + ");
            }
        }
        return sb.toString();
    }

    private static String padWithZeroes(char c, int amountOfZeroes) {
        StringBuffer sb = new StringBuffer();
        sb.append(c);
        for(int p = 0; p < amountOfZeroes; p++) {
            sb.append('0');
        }
        return sb.toString();
    }



    public static String expandedForm2(int num) {
        List<String> list = new LinkedList<>();

        int pad = 0;
        while(num != 0) {
            int d = num % 10;
            if(d != 0) {
                String paddedDecimal = StringUtils.rightPad(Integer.toString(d), pad + 1, '0');
                list.add(0, paddedDecimal);
            }
            num = num/10;
            pad++;
        }

        return String.join(" + ",list);
    }


    public static String expandedForm3(int num) {
        List<Integer> list = new LinkedList<>();

        for(int pad = 0; num != 0; num/=10,pad++) {
            int d = num % 10;
            if(d != 0) {
                list.add(0, d * (int) (Math.pow(10, pad)));
            }
        }

        return list.stream()
                   //.filter(i -> i != 0)
                   .map(String::valueOf)
                   .collect(Collectors.joining(" + "));
    }


    public static String expandedForm4(int num) {
        List<String> list = new LinkedList<>();

        char[] chars = Integer.toString(num).toCharArray();
        for(int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if(c != '0') {
                String operand = StringUtils.rightPad(String.valueOf(c), chars.length - i, '0');
                list.add(operand);
            }
        }

        return list.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" + "));
    }

}
