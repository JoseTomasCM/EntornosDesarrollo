package Entornos;

public class PrincipalDebug {

	public static void main(String[] args) {
		int a = 1;
		int r = 0;
		
		for (int i=2;i<6;i=i+2)
		{
			a++;
			for (int j=0;j<4;j++)
			{
				r += a*i;
			}
			r--;
		}
		System.out.println(r);
	}

}
