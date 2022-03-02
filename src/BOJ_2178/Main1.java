package BOJ_2178;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
 
public class Main1 {
 
	static int n;
	static int m;
	static int[][] arr;
	static boolean[][] visited;
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		n = sc.nextInt(); // 행
		m = sc.nextInt(); // 열
 
		arr = new int[n][m]; // 미로 지도
		visited = new boolean[n][m]; // 방문 여부
 
		for (int i = 0; i < n; i++) { // 지도 생성
			char[] chaArr = sc.next().toCharArray();
			for (int j = 0; j < m; j++) {
				arr[i][j] = chaArr[j] - '0';
			}
		}
 
		search(0, 0);
		System.out.println(arr[n - 1][m - 1]);
	}
 
	public static void search(int x, int y) {
		Queue<XY> queue = new LinkedList<XY>();
		queue.add(new XY(x, y));
 
		// 이동 할 수 있는 가지 수, 동서남북
		int[] dx = { 1, 0, -1, 0 };
		int[] dy = { 0, 1, 0, -1 };
 
		while (!queue.isEmpty()) { // 큐에 들어간 좌표 탐색이 모두 끝날 때까지 반복
			XY xy = queue.poll();
 
			// 현재 좌표 탐색처리
			visited[xy.x][xy.y] = true;
 
			for (int i = 0; i < 4; i++) { // 동, 서, 남, 북 탐색
				int nextX = xy.x + dx[i];
				int nextY = xy.y + dy[i];
 
				// 다음 지점이 미로를 벗어나거나, 벽이거나, 이미 탐색을 한 좌표이면 무시
				if (nextX < 0 || nextX >= n || nextY < 0 || nextY >= m || arr[nextX][nextY] == 0
						|| visited[nextX][nextY]) {
					continue;
				}
 
				// 다음 탐색 지점을 큐에 추가
				queue.add(new XY(nextX, nextY));
 
				//
				arr[nextX][nextY] = arr[xy.x][xy.y] + 1;
			}
		}
	}
}
 
class XY { // 좌표 저장
	int x;
	int y;
 
	public XY(int x, int y) {
		this.x = x;
		this.y = y;
	}
}