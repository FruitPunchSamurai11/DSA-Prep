import java.util.HashSet;
import java.util.Set;

public class happynumber {
    public boolean isHappy(int n) {
        if(n==1)
        return true;
        int x;
        Set<Integer> res = new HashSet<>();
        while(true)
        {
            if(!res.add(n))
            {
                return false;
            }
            x=sumofsquares(n);
            if(x==1)
            return true;
            else
            n=x;

        }
    }

    int sumofsquares(int n)
    {
        int sum=0;
        while(n!=0)
        {
            sum+=(n%10)*(n%10);
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        happynumber obj = new happynumber();
        int n=19;
        boolean result = obj.isHappy(n);
        System.out.println(result);
    }
}

