package String;

/**
 * Created by bhavyaverma on 1/31/17.
 */
public class StringReverse {
    public static void main(String[] args) {
        String s = "Bhavya Verma";
        char[] temp = s.toCharArray();
        int i, j;
        j = temp.length-1;
        for(i=0; i<j; i++, j--)
        {
            char t = temp[i];
            temp[i] = temp[j];
            temp[j] = t;

        }
        for (char reverse : temp)
        {
            System.out.println(reverse);

        }

    }
}
