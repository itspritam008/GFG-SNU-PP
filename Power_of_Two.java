public class Power_of_Two {
    public boolean isPowerOfTwo(int n) {
        if (n==0)
        return false;
        int k =(int)(Math.log(n)/Math.log(2));
        if (Math.pow(2,k)==n)
        return true;
        else
        return false;
    }
}
