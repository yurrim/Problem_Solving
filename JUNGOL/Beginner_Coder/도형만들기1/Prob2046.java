package JUNGOL.Beginner_Coder.도형만들기1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prob2046 {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] map = new int[n][n];

        if (m == 1) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    map[i][j] = (i+1);
                }
            }
        } else if (m == 2) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if(i%2==0) map[i][j] = (j+1);
                    else map[i][j] = (n-j);
                }
            }
        } else if (m == 3) {

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    map[i][j] = (i+1)*(j+1);
                }
            }
        }
 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) System.out.print(map[i][j] + " ");
            System.out.println();
        }
    }
}
