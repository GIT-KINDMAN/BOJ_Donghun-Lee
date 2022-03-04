package BOJ_12904;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        String N = br.readLine();
        String M = br.readLine();

        String[] X = N.split("");
        String[] Y = M.split("");


        // while (X.length < Y.length) {
        
        int yTlen = Y.length;
        for (int i=Y.length-1; i>0; i--) {
            if(yTlen == X.length) {
                for (int j=0; j<X.length-1; j++) {
                    if(X[j]!=Y[j]) {

                    }
                }
            }
            if (Y[i]==)
        }
    }
}
