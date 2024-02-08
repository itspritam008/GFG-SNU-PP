class SelfDivideNos {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList <Integer> list = new ArrayList<Integer>();
      for (int i=left;i<=right;i++)
      {
          if(chkSelfDivide(i)==true)
          list.add(i);   
      } 
      return list; 
    }
    boolean chkSelfDivide(int n)
    {
        int cp=n,f=1;
        while (cp>0)
        {
            int k=cp%10;
            if (k==0)
            return false;
            if(n%k!=0)
            {
                f=0;
                break;
            }
            cp=cp/10;
        }
        if (f==1)
        return true;
        else
        return false;
    }
}
