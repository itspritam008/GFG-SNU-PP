public class Palindrome {
    boolean isPalindrome(int x) {
        long r=0;
        long cp=x;
        while (cp>0)
        {
            r=r*10+(cp%10);
            cp=cp/10;
        }
        if (r==x)
        return true;
        else
        return false;
    } 
}
