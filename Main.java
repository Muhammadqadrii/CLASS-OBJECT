package muhqadri;

public class Main {

	public static void main(String[] args) {
		System.out.println("------Object Kelas Kotak------");
		// membuat object dari class kotak
		kotak main = new kotak();
			
		// method setter kotak
		main.setpanjang(11.11);
		main.setlebar(2.12);
			
		// method getter kotak
		System.out.println("panjang : " + main.getpanjang());
		System.out.println("lebar : " + main.getlebar());
		System.out.println("luas : " + main.getpanjang()*main.getlebar());
		System.out.println("keliling : " + main.getlebar()*main.getpanjang()*main.getlebar()*main.getpanjang());
		
		System.out.println("------Object Kelas mahasiswa------");
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
		System.out.println("nama : " + mahasiswa.getnama());
		System.out.println("nim : " + mahasiswa.getnim());
		System.out.println("alamat : " + mahasiswa.getalamat());
		System.out.println("golongan Darah : " + mahasiswa.getgolongnDarah());
		System.out.println("Status : " + mahasiswa.getstatus());
		System.out.println("tinggi badan : " + mahasiswa.gettinggiBadan());
		System.out.println("berat badan : " + mahasiswa.getberatBadan());

		System.out.println("------Object Kelas node------");
		//membuat object dari kelas node
		Node node = new Node();
		
		//method setter node
		node.label = "Orang Nub";
		node.Value = 6;
		
		//method getter node
		System.out.println("Nama Label : " + node.getlabel());
		System.out.println("jumlah label : " + node.getValue());

		System.out.println("------Object Kelas stack------");
		//membuat object dari kelas stack
		Stack stack = new Stack();
		
		stack.value[0] = "Muhammadqadrii";
		stack.value[1] = "mufli";
		stack.value[2] = "wafiq";
		stack.value[3] = "aming";
		stack.value[4] = "Fajrin";
		stack.value[5] = "Anmar";
	

		//menampilkan stack
		for(int i=0;i<stack.value.length;i++){System.out.println(stack.value[i]);};

		
		}
	

	}


