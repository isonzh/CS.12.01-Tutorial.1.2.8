import java.util.ArrayList;

public class Delimiters {
    private String openDel;
    private String closeDel;

    public Delimiters(String open, String close) {
        openDel = open;
        closeDel = close;
    }

    public String getOpenDel() {
        return openDel;
    }

    public String getCloseDel() {
        return closeDel;
    }


    public ArrayList<String> getDelimitersList(String[] token) {
        ArrayList<String> delimiters = new ArrayList<>();
        for (int i = 0; i < token.length; i++) {
            if (token[i] == ("(") || token[i] == ")" || (token[i].contains("<") && token[i].contains(">"))) {
                delimiters.add(token[i]);
            }

        }
        return delimiters;
    }

    public boolean isBalanced(ArrayList<String> delimiters) {
        int count = 0;

        for (String i : delimiters) {
            if (i.equals(openDel) && count >= 0) {
                count++;
            } else if (i.equals(closeDel) && count >=0) {
                count--;
            } else return false;
        }
        return count==0;
    }

    }

