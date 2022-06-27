package aulia.haris;

public class Answer_3 {

    public String tentukanTeamLomba(int a, int b, int c){
        // matematika
            // kelas a = 1
            int combinationA = combination(a, 1);
            // kelas b = 2
            int combinationB = combination(b, 2);
            // kelas c = 2
            int combinationC = combination(c, 2);

        int mathComb = combinationA * combinationB * combinationC;


        // kimia
            // kelas a = 2
            int kimA = combination(a, 2);
            // kelas b = 3
            int kimB = combination(b, 3);
            // kelas c = 1
            int kimC = combination(c, 1);
        int kimComb = kimA * kimB * kimC;

        return "Matematika: " + mathComb  + "\n" +
                "Kimia: " + kimComb;
    }

    static int fact(int number) {
        int f = 1;
        int j = 1;
        while(j <= number) {
            f = f * j;
            j++;
        }
        return f;
    }

    static int combination(int n, int r){
        int result = fact(n) / (fact(r) * fact(n-r));
        return result;
    }

}
