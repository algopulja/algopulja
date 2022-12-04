package pr;

import java.util.Scanner;

public class Brown46_1051 {

	public static void main(String[] args) {

	


		Scanner sc = new Scanner(System.in);
		
		System.out.println("n입력");
		int n = sc.nextInt(); sc.nextLine();
		System.out.println("m입력");
		int m = sc.nextInt(); sc.nextLine();
		int arr[][] = new int[n][m];
		
		
	
		
	
		 for (int i=0; i<n; i++) {
			 	String line;
			 	line=sc.nextLine();
			 char[] ch=line.toCharArray();
		        for (int j=0; j<m; j++) {
		            arr[i][j] = ch[j] - '0';
		        }
		        
		    }
		
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < m; j++) {
//				arr[i][j]=(int)(Math.random()*9)+1;
//			}
//		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

		if (n > m) {

			loop1: while (true) {
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < m; j++) {
						if ((i + m > n)||(j+m>m))
							continue;
						if (m == 1) {
							System.out.println(m * m);
							break loop1;
						}
						
						if (arr[i][j] == arr[i + m-1][j + m-1] && arr[i][j] == arr[i][j + m-1]
								&& arr[i][j] == arr[i + m-1][j]) {
							System.out.println(m * m);
							break loop1;
						}
					}
				}
				m--;
			}

		}
		if (m >= n) {

			loop1: while (true) {
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < m; j++) {
						if ((i + n > n)||(j+n>m))
							continue;
						if (n == 1) {
							System.out.println(n * n);
							break loop1;
						}
						
						if (arr[i][j] == arr[i + n-1][j + n-1] && arr[i][j] == arr[i][j + n-1]
								&& arr[i][j] == arr[i + n-1][j]) {
							System.out.println(n * n);
							break loop1;
						}
					}
				}
				n--;
			}

		}


	}

}
