public class Rev_Word {
    public String reverseWords(String s) {
        s=s+" ";
        int l = s.length();
        String w="";
        String str="";
        for (int i=0;i<l;i++)
        {
            char ch = s.charAt(i);
            if (ch!=' ')
            w=w+ch;
            else
            {
                for (int j=w.length()-1;j>=0;j--)
                str=str+(w.charAt(j));
                if (i!=l-1)
                str=str+" ";
                w="";
            }
        }
        return str;
    }
}
