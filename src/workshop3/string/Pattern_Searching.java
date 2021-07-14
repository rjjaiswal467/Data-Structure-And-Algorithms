package workshop3.string;

public class Pattern_Searching {
    static void search(String txt, String pat)
    {
        txt= txt.trim();
        pat = pat.trim();
        int M = pat.length();
        int N = txt.length();

        for (int i = 0; i <= N - M; i++)
        {
            int j;
            for (j = 0; j < M; j++) {
                if(pat.charAt(j)!=txt.charAt(i+j))
                break;
            }
            if(j==M){
                System.out.println("Found at: " +i);
            }
        }
    }
    public static void main(String[] args)
    {
        String txt = "AABASD";
        String pat = "AABA";
        search(txt, pat);
    }
}
