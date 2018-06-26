package przykladycwicz;

import com.sun.xml.internal.messaging.saaj.packaging.mime.internet.ContentDisposition;

import javax.jws.Oneway;

public class TextRevers {
    public static void main(String[] args) {
        String text="123456789";
        StringBuilder sb= new StringBuilder();
        for (int position=text.length()-1;position>=0; position--){
            sb.append(text.charAt(position));
            sb.append(text.charAt(text.length()-1-position));
        }
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

    }


}
