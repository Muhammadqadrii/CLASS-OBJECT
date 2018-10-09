package muhqadri;

public class Main {

	public static void main(String[] args) {
		System.out.println("------Object Kelas Kotak------");
		// membuat object dari class kotak
		kotak main = new kotak();
			
		// method setter kotak
		main.setpanjang(2.5);
		main.setlebar(3.1);
			
		// method getter kotak
		System.out.println("panjang  : " + main.getpanjang());
		System.out.println("lebar    : " + main.getlebar());
		System.out.println("luas     : " + main.getpanjang()*main.getlebar());
		System.out.println("keliling : " + main.getlebar()*main.getpanjang()*main.getlebar()*main.getpanjang());
		
		System.out.println("***Object Kelas mahasiswa***");
		//membuat object dari class mahasiswa
		Mahasiswa mahasiswa = new Mahasiswa();
		
		//method setter mahasiswa
		mahasiswa.nama = "Muhammad qadrii";
		mahasiswa.nim = "D0217377";
		mahasiswa.alamat = "PAREPARE";
		mahasiswa.golonganDarah = "--";
		mahasiswa.status = "Mahasiswa";
		mahasiswa.tinggiBadan = "168";
		mahasiswa.beratBadan = "53";
		
		//method getter mahasiswa
		System.out.println("Nama           : " + mahasiswa.getnama());
		System.out.println("Nim            : " + mahasiswa.getnim());
		System.out.println("Alamat         : " + mahasiswa.getalamat());
		System.out.println("Golongan Darah : " + mahasiswa.getgolongnDarah());
		System.out.println("Status         : " + mahasiswa.getstatus());
		System.out.println("Tinggi badan   : " + mahasiswa.gettinggiBadan());
		System.out.println("Berat badan    : " + mahasiswa.getberatBadan());

		System.out.println("***Object Kelas Node***");
		//membuat object dari kelas node
		Node node = new Node();
		
		//method setter node
		node.label = "PEDJUANG DCINTAH";
		node.Value = 6;
		
		//method getter node
		System.out.println("Nama Kelas       : " + node.getlabel());
		System.out.println("Jumlah Mahasiswa : " + node.getValue());

		System.out.println("***Object Kelas Stack***");
		//membuat object dari kelas stack
		Stack stack = new Stack();
		
		stack.value[0] = "1.Muhammadqadrii";
		stack.value[1] = "2.Mufli";
		stack.value[2] = "3.Wafiq";
		stack.value[3] = "4.Aming";
		stack.value[4] = "5.Fajrin";
		stack.value[5] = "6.Anmar";
	

		//menampilkan stack
		for(int i=0;i<stack.value.length;i++){System.out.println(stack.value[i]);};

		
		}
	

	}




