package BOJ_1855;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int col = Integer.parseInt(br.readLine());
        String str = br.readLine();

        String[] a = str.split("");
        int row = str.length() / col;
        StringBuilder sb = new StringBuilder();

        String[][] s = new String[row][col];

        for (int i = 0; i < row; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < col; j++) {
                    s[i][j] = a[i * col + j];
                }
            } else {
                for (int j = col - 1; j >= 0; j--) {
                    s[i][col - 1 - j] = a[i * col + j];
                }
            }
        }

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(s[j][i]);
            }
        }

        System.out.println(sb);

    }
}
// int tmp = 0;
// for (int i = 0; i < row; i++) {
// for (int j = 0; j < col; j++) {
// s[i][j] = a[tmp];
// tmp++;
// }
// int count = 0;
// for (int i = 0; i < a.length / col; i++) {
// if (i % 2 == 1) {
// for (int j = col - 1; j >= 0; j--) {
// sb.append(a[i + j + count]);
// }

// } else {
// for (int j = 0; j < col; j++) {
// sb.append(a[i + j + count]);
// }
// }
// count = +col;
// }

// for (int i=0; i<a.length; i++) {
// 0
// 0+col
// 0+col+col
// 0+col+col+col (row-1만큼)

// 1+

// 총 col만큼
// 총 row 만큼 +col for row-1
// }