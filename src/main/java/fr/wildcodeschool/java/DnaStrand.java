package fr.wildcodeschool.java;

public class DnaStrand {

    /**
     *
     * @param dna
     * @return
     */
    public static String makeComplement(String dna) {
        StringBuffer sb = new StringBuffer();
        for(char c : dna.toCharArray()) {
            sb.append(convert(c));
        }
        return sb.toString();
    }

    private static char convert(char c) {
        switch (c) {
            case 'A':
                return 'T';
            case 'T':
                return 'A';
            case 'C':
                return 'G';
            case 'G':
                return 'C';
            default:
                throw new IllegalArgumentException();
        }
    }
}