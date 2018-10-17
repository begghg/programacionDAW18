package eval1;

public class Ejer6b {

	public static void main(String[] args) {
		int h=0, m=59, s=59;
		System.out.println("La hora introducida es :"+h+"/"+m+"/"+s);
		System.out.println();
		s=s+1;
		if (s > 59){
			m=m+1;
			s=0;
			if(m > 59){
				h=h+1;
				m=0;
				if(h > 23){
					h=0;
				}
			}
		}
		System.out.println("La hora es :"+h+"/"+m+"/"+s);
	}

}
