package ag;

import java.util.ArrayList;

public class Nbaseball {
	public static ArrayList<Integer> baseball(int num, int strike, int ball) {
		int a = num / 100;
		int b = (num % 100) / 10;
		int c = num % 10;

		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i = 123; i < 988; i++) {
			if (   (i / 100 != (i % 100) / 10)    &&     (i / 100 != i % 10)     &&    ((i % 100) / 10 != i % 10)   &&   ((i % 100) / 10 != 0)     &&      (i % 10 != 0))
				al.add(i);
		}

		if (strike == 0 && ball == 1) {
			ArrayList<Integer> tmp = new ArrayList<Integer>();
			for (int i : al) {
				if (       (i / 100 != b && i / 100 != c      &&      (i % 100) / 10 == a       &&        i % 10 != b && i % 10 != c)
						|| (i / 100 != b && i / 100 != c      &&      (i % 100) / 10 != b&&(i % 100) / 10 != c       &&           i % 10 == a)
						|| (i / 100 == b          &&        (i % 100) / 10 != a && (i % 100) / 10 != c           &&            i % 10 != a && i % 10 != c)
						|| (i / 100 != a && i / 100 != c      &&      (i % 100) / 10 != a && (i % 100) / 10 != c      &&         i % 10 == b)
						|| (i / 100 == c          &&        (i % 100) / 10 != a && (i % 100) / 10 != b            &&           i % 10 != a && i % 10 != b)
						|| (i / 100 != a && i / 100 != b      &&      (i % 100) / 10 == c       &&        i % 10 != a && i % 10 != b)) {

				tmp.add(i);
				}
			}
			return tmp;
		}else if (strike == 0 && ball == 2) {
			ArrayList<Integer> tmp = new ArrayList<Integer>();
			for (int i : al) {
				if ((i / 100 == b    &&  (i % 100) / 10 == a     &&  i % 10 != c)
						|| (i / 100 == b        &&          (i % 100) / 10 != c         &&       i % 10 == a)
						|| (i / 100 != c        &&          (i % 100) / 10 == a         &&       i % 10 == b)
						|| (i / 100 == c        &&          (i % 100) / 10 != b         &&       i % 10 == a)
						|| (i / 100 == c        &&          (i % 100) / 10 == a         &&       i % 10 != b) 
						|| (i / 100 != b        &&          (i % 100) / 10 == c         &&       i % 10 == a)
						|| (i / 100 != a        &&          (i % 100) / 10 == c         &&       i % 10 == b)
						|| (i / 100 == c        &&          (i % 100) / 10 != a         &&       i % 10 == b)
						|| (i / 100 == b        &&          (i % 100) / 10 == c         &&       i % 10 != a)) {

					tmp.add(i);
				}
			}
			return tmp;
		}else if (strike == 0 && ball == 3) {
			ArrayList<Integer> tmp = new ArrayList<Integer>();
			for (int i : al) {
				if (       (i / 100 == c        &&          (i % 100) / 10 == a         &&       i % 10 == b)
						|| (i / 100 == b        &&          (i % 100) / 10 == c         &&       i % 10 == a)) {

					tmp.add(i);
				}
			}
			return tmp;
		}else if (strike == 1 && ball == 0) {
			ArrayList<Integer> tmp = new ArrayList<Integer>();
			for (int i : al) {
				if (       (i / 100 == a    &&    (i % 100) / 10 != b &&(i % 100) / 10 != c        &&         i % 10 != b && i % 10 != c)
						|| ((i / 100) != a && (i / 100) != c      &&     (i % 100) / 10 == b       &&       i % 10 != a && i % 10 != c)
						|| ((i / 100) != a && (i / 100) != b      &&     (i % 100) / 10 != a && (i % 100) / 10 != b          && i % 10 ==c)) {
				tmp.add(i);
				}
			}
			return tmp;
		}else if (strike == 1 && ball == 1) {
			ArrayList<Integer> tmp = new ArrayList<Integer>();

			for (int i : al) {

				if (  ( i/100==a       &&        (i % 100)/10!=c       &&        i%10 ==b)
					|| ( i/100!=c      &&        (i % 100)/10==b       &&        i%10 ==a)
					||( i/100==a       &&        (i % 100)/10==c       &&        i%10!=b   )
					||( i/100!=b       &&        (i % 100)/10==a       &&        i%10==c   )
					||( i/100==c       &&        (i % 100)/10==b       &&        i%10!=a   )
					||( i/100==b       &&        (i % 100)/10!= a      &&        i%10==c     )) {
			
					tmp.add(i);

				}
			}
			return tmp;
		}else if (strike == 1 && ball == 2) {
			ArrayList<Integer> tmp = new ArrayList<Integer>();
			for (int i : al) {
				if (  ( i/100==a       &&        (i % 100)/10==c       &&    i%10 ==b )
					||( i/100==c       &&        (i % 100)/10==b       &&    i%10 ==a ) 
					||( i/100==b       &&        (i % 100)/10==a      &&    i%10 ==c )) {

					tmp.add(i);
				}
			}
			return tmp;
		}else if (strike == 2 && ball == 0) {
			ArrayList<Integer> tmp = new ArrayList<Integer>();
			for (int i : al) {
				if (  ( i/100==a       &&        (i % 100)/10==b       &&    i%10 !=c )
					||( i/100==a       &&        (i % 100)/10!=b       &&    i%10 ==c ) 
					||( i/100!=a       &&        (i % 100)/10==b      &&    i%10 ==c )) {

					tmp.add(i);
				}
			}
			return tmp;
		}
		return null;
	}
	
	public static ArrayList<Integer> check(ArrayList<Integer> a, ArrayList<Integer> b){
		ArrayList<Integer> tmp = new ArrayList<Integer>();
	        for (Integer t : a) {
	            if (b.contains(t)) {
	                tmp.add(t);
	            }
	        } 
	        return tmp;
	}
	
//	public static void count(ArrayList<Integer>...str) {
//		
//       for(int i=0; i<str.length;i++) {
//    	   
//       }
//         
//}
	public static void main(String[] args) {

		ArrayList<Integer> b = new ArrayList<Integer>();

		for (int i = 123; i < 988; i++) {
			if ((i / 100 != (i % 100) / 10) && (i / 100 != i % 10) && ((i % 100) / 10 != i % 10)
					&& ((i % 100) / 10 != 0) && (i % 10 != 0))
				b.add(i);
		}

//		System.out.println(baseball(123, 1, 1));
//		System.out.println(baseball(356, 1, 0));
		System.out.println(check(baseball(123,1, 1),check(check(baseball(327, 2, 0),baseball(356, 1, 0)),baseball(489, 0, 1))).size());
		


	}

}
/*
 * 123~987
 *
 */
/*
 * 123 1 1
 * 
 * i/100 , (i % 100)/10, i%10 i/100 && (i % 100)/10 && i%10
 * 
 */
/*
 * abc 0 1 0a0 00a not b and c / b00 00b not a and c / c00 0c0! not a and b 
 * 		0 2 ba0 b0a 0ab not c/ c0a ca0 0ca not b/ 0cb c0b bc0 not a 
 * 		0 3 cab bca 
 * 		1 0 a00 not b and c / 0b0 not a and c/ 00c not a and b 
 *		1 1 a0b not c / 0ba not c/  ac0 not b/ 0ac not b/ cb0! not a/ b0c not a 
 *a0b not c / ac0 not b/ b0c not a / 
 *		1 2 acb / cba / bac
 * 		2 0 ab0 not c/ a0c not b/ 0bc! not a
 * 
 * 
 * 
 * 
 */
