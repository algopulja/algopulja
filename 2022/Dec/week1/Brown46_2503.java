package pr;

import java.util.ArrayList;

public class Brown46_2503 {
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
	

	public static void main(String[] args) {

		ArrayList<Integer> b = new ArrayList<Integer>();

		for (int i = 123; i < 988; i++) {
			if ((i / 100 != (i % 100) / 10) && (i / 100 != i % 10) && ((i % 100) / 10 != i % 10)
					&& ((i % 100) / 10 != 0) && (i % 10 != 0))
				b.add(i);
		}


		System.out.println(check(baseball(123,1, 1),check(check(baseball(327, 2, 0),baseball(356, 1, 0)),baseball(489, 0, 1))).size());
		

	}

}

