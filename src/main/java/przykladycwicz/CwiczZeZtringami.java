package przykladycwicz;

import javax.security.auth.login.AccountException;
import java.util.StringTokenizer;

public class CwiczZeZtringami {
    public static void main(String[] args) {

        String str = "M a n u f a k t u r a"; // "Poniedz iałek Wto rek Sro da Czwartek Piątek Sobota Niedziela";
        String strReverse;
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(str);
        String nastepnyToken = "*";
        int counter=0;
        boolean insertSpace=true;
        while (st.hasMoreTokens()) {
            sb.insert(0, st.nextToken());
            if (st.hasMoreTokens()&& insertSpace) {
                sb.insert(0, "*");
            }
        }
        strReverse = sb.toString();
        System.out.println(strReverse);
    }


}

