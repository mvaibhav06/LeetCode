public class ExcelSheetColumnTitle {
    public static String getTitle(int columnNumber){
        String out = "";
        int input;
        while (columnNumber!=0){
            if (columnNumber > 26) {
                input = columnNumber % 26;
                columnNumber /= 26;
            }else {
                input = columnNumber;
                columnNumber = 0;
            }
            switch (input){
                case 1:
                    out += "A";
                    break;
                case 2:
                    out +="B";
                    break;
                case 3:
                    out +="C";
                    break;
                case 4:
                    out +="D";
                    break;
                case 5:
                    out +="E";
                    break;
                case 6:
                    out +="F";
                    break;
                case 7:
                    out +="G";
                    break;
                case 8:
                    out +="H";
                    break;
                case 9:
                    out +="I";
                    break;
                case 10:
                    out +="J";
                    break;
                case 11:
                    out +="K";
                    break;
                case 12:
                    out +="L";
                    break;
                case 13:
                    out +="M";
                    break;
                case 14:
                    out +="N";
                    break;
                case 15:
                    out +="O";
                    break;
                case 16:
                    out +="P";
                    break;
                case 17:
                    out +="Q";
                    break;
                case 18:
                    out +="R";
                    break;
                case 19:
                    out +="S";
                    break;
                case 20:
                    out +="T";
                    break;
                case 21:
                    out +="U";
                    break;
                case 22:
                    out +="V";
                    break;
                case 23:
                    out +="W";
                    break;
                case 24:
                    out +="X";
                    break;
                case 25:
                    out +="Y";
                    break;
                case 26:
                    out +="Z";
                    break;
            }
        }

        return out;
    }
    public static void main(String[] args) {
        System.out.println(getTitle(52));
    }
}
