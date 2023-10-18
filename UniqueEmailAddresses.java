import java.util.HashSet;

public class UniqueEmailAddresses {
    public static int numOfUniqueEmails(String[] emails){
        HashSet<String> validEmails = new HashSet<>();
        for (int i=0; i<emails.length; i++){
            String[] localDomain = emails[i].split("@");
            String local = localDomain[0];
            char[] trimLocal = local.toCharArray();
            String out = "";
            for (int j=0; j<localDomain[0].length(); j++){
                if (trimLocal[j] == 43) break;
                if (trimLocal[j] != 46){
                    out += trimLocal[j];
                }
            }
            out += "@" + localDomain[1];
            validEmails.add(out);
        }
        return validEmails.size();
    }
    public static void main(String[] args) {
        String[] emails = {"a@leetcode.com","b@leetcode.com","c@leetcode.com"};
        System.out.println(numOfUniqueEmails(emails));
    }
}
