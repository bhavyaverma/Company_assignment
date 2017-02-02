
package String;

import java.util.Arrays;

import com.sun.tools.hat.internal.util.ArraySorter;

/**
 * Created by bhavyaverma on 1/31/17.
 */
public class Anagram {

    public  void Anagram1(String str1, String str2)
    {

        boolean status = true;
        if (str1.length() != str2.length())
        {
            status = false;
        }
        else
        {
            char[] s1 = str1.toCharArray();
            char[] s2 = str2.toCharArray();

            Arrays.sort(s1);
            Arrays.sort(s2);
            status = Arrays.equals(s1,s2);
            boolean c = Arrays.equals(s1, s2);
            if(status)
            {
                System.out.println(status);
            }
            else
            {
                System.out.println(status);
            }


        }
    }

    public static void main(String[] args) {
        Anagram a = new Anagram();
        a.Anagram1("abc", "bac"); //is Anagram
        a.Anagram1("abc", "jda"); //is not anagram
    }
}
