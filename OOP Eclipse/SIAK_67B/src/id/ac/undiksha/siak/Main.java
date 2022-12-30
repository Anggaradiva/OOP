package id.ac.undiksha.siak;

import id.ac.undiksha.siak.entities.Dosen;
import id.ac.undiksha.siak.entities.Mahasiswa;
import id.ac.undiksha.siak.entities.Pegawai;

public class Main {

	public static void main(String[] args) {

		/*Mahasiswa mhs1 = new Mahasiswa();
		
		mhs1.setNama("Yuda Mahendra");
		mhs1.setAlamat("Singaraja");
		
		mhs1.printAllInfo();
		*/
		
		Dosen dosen1 = new Dosen(
				"A.A. Gede Yudhi Paramartha, S.Kom., M.Kom.",
				"Klungkung",
				"21141413",
				true,
				"Ilmu Komputer",
				"Teknik Informatika",
				"Teknik dan Kejuruan", 
				"Dosen"
		);
		
		dosen1.printAllInfo();
		
		Pegawai pegawai1 = new Pegawai(
				"Karim Benjamin",
				"Bangli",
				"354687",
				true,
				"01",
				"Pegawai UPT TIK"
		);
		
		pegawai1.printAllInfo();
				
		
		Mahasiswa mhs2 = new Mahasiswa(
			"Udin",
			"Badung",
			"2135423",
			true,
			"Ilmu Komputer",
			"Teknik Informatika",
			"Teknik dan Kejuruan"
		);
		
		mhs2.printAllInfo();


	}

}
