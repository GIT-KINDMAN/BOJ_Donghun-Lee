// package BOJ_11501;

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.StringTokenizer;

// public class Main2 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         StringTokenizer st;

//         int N = Integer.parseInt(br.readLine());

//         for (int i = 0; i < N; i++) {
//             long sum = 0;
//             int point = 0;
//             int M = Integer.parseInt(br.readLine());
//             int arr[] = new int[M + 1];
//             st = new StringTokenizer(br.readLine());
//             for (int j = 0; j < M; j++) {
//                 arr[j] = Integer.parseInt(st.nextToken());
//             }

//             for (int j = 0; j < M; j++) {
//                 if (arr.length == 1)
//                     break;
//                 if (arr[j] > arr[j + 1]) {
//                     int len = j - point;
//                     float sub = 0;
//                     if (len != 0) {
//                         for (int k = point; k < j; k++) {
//                             sub += arr[k];
//                         }
//                         sum += len * (arr[j] - sub / len);
//                         point = j + 1;
//                     }
//                 }
//                 if (j == M - 1 && point == 0) {
//                     if (arr[M - 2] < arr[M - 1]) {
//                         for (int k = 0; k < M; k++) {
//                             sum += arr[arr.length - 1] - arr[k];
//                         }
//                     }
//                 }
//             }
//             if (sum<0) sum=0;
//             System.out.println(sum);
//         }
//     }
// }