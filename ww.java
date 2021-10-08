import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;



class TestClass {

    public static int solution(int n)
    {
        int div2=n/3;
        int ans1=Math.abs((div2)-(n-div2*2));
        int ans2=Math.abs((div2+1)-(n-(div2+1)*2));
        if(ans1<ans2)
            return Math.abs((div2)+(n-div2*2));
        return Math.abs((div2+1)+(n-(div2+1)*2));
    }


    public static void main(String args[] ) throws Exception {
        

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int answer=solution(n);
        System.out.println(answer);
        
    }
}
