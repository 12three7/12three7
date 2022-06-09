package dasar;

public class Variabel {
	
	public static void main(String[] args) {
		int a = 0;
		int b = 0 - 100;
		String c = "+'+#(&!$)=€]^";
		boolean d = false;
		char e = 'n';
		float f = 7282642974.9473857299f;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
		// lu juga bisa bikin variabel pake var, tapi kalo pake var lu harus langsung isi variablenya.
		var g = "hello world";
		var h = 123456789;
		/*
		 * ingat: variabel cuma bisa diakses dari tempat dimana dia dibuat. -- tiap variabel punya scopenya sendiri.
		 * lu gak bisa ngakses variable diluar scope
		 * contoh lihat kebawah:
		 */
		int ohno = 5; // gw bikin variabel disini
	}
	ohno = 8; // gw gak bisa ganti value variablenya disini
}
