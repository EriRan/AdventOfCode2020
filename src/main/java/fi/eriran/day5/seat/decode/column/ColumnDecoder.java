package fi.eriran.day5.seat.decode.column;

public class ColumnDecoder {

    /**
     * Its actually a binary int in disguise
     */
    public int decode(String substring) {
        return Integer.parseInt(convertToBinaryString(substring), 2);
    }

    private String convertToBinaryString(String substring) {
        StringBuilder binaryStringBuilder = new StringBuilder();
        for (char character : substring.toCharArray()) {
            switch (character) {
                case 'L':
                    binaryStringBuilder.append("0");
                    break;
                case 'R':
                    binaryStringBuilder.append("1");
                    break;
                default:
                    throw new IllegalArgumentException("Encountered unknown character: " + character);
            }
        }
        return binaryStringBuilder.toString();
    }
}
