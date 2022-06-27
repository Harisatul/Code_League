package aulia.haris;

public class Answer_2 {

    public String gobtaDanGobzo(int n) {
        String str = "";
        // checked 1st condition : when n is power of 5 then go ahead. everything fine
        if (isPower(n)){
            str = "DONE GAN";
        }else { // otherwise

            //checked n to nearest power of 5.
            int temp = n - Math.abs(nearestPowerOfK(n, 5));
            temp = Math.abs(temp);

            /*
                Check Possibilities of currency change :
                eg : 131 -- > nearest power of five is = 125,
                     that could be 125 (which is power 5),
                     5 (which is multiplication of 5 ),
                     then 1 (which is one of currency)
             */

            if ( temp % 5 == 0 || temp == 1){
                str = "DONE GAN";
            }  else {
                int foo = temp % 5;
                if (foo == 1){
                    str = "DONE GAN";
                }else {
                    str = "UP GAN";
                }
            }
        }
        return str;
    }

    // function to check power of n
    public  boolean isPower(long val) {
        if (val == 0) {
            return false;
        }
        int n = (int) (Math.log(val) / Math.log(5));
        return Math.pow(5, n) == val;
    }

    // function to check nearest power of n
    int nearestPowerOfK(int N, int K)
    {

        int lg = (int)(Math.log(N) / Math.log(K));

        int a = (int)Math.pow(K, lg);
        int b = (int)Math.pow(K, lg + 1);

        if ((N - a) < (b - N))
            return a;
        return b;
    }

}
