import java.lang.String;
public class str1 {
    public static void main(String[] args) {
        String word1 = "abcdw";
        String word2 = "pqrs";

        String str = "";
        int l1 = word1.length();
        int l2 = word2.length();
    }
}

        /*
        for (int i = 0; i < l1; i++) {
            str = str + word1.charAt(i);
            for (int j = 0; j < l2; j++) {
                str = str + word2.charAt(j);
                j++;
            }
        }
        System.out.println(str);
    }
}

         */

        /*
        int maxi = Math.max(l1, l2);
        String result = " ";

        for (int i = 0; i < maxi; i++) {
            if (i < l1) {
                result = result + word1.charAt(i);
            }
            if (i < l2) {
                result = result + word2.charAt(i);
            }
        }
        System.out.println(result);
    }
}


        /*
        while (i < l1) {
            str = str + word1.charAt(i);
            while (i < l2) {
                str = str + word2.charAt(i);
            }
            i++;
        }
        System.out.println(str);
    }

    }
    */

        //

        /*
        int a = word1.length();
        int b = word2.length();
        int i = 0;
        String ans = "";
        if (a > b) {
            while (i < b) {
                ans = ans + word1.charAt(i) + word2.charAt(i);
                i++;
            }
            while (i < a) {
                ans = ans + word1.charAt(i);
                i++;
            }
            return ans;
        }
        if (a<b) {
            while (i < a) {
                ans = ans + word1.charAt(i) + word2.charAt(i);
                i++;
            }
            while (i < b) {
                ans = ans + word2.charAt(i);
                i++;
            }
            return ans;
        }
        if (b == a) {
            while (i < a) {
                ans = ans + word1.charAt(i) + word2.charAt(i);
                i++;
            }
            return ans;
        }
        return ans;
        */
