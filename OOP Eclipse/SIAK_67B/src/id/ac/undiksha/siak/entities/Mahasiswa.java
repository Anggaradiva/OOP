package id.ac.undiksha.siak.entities;

public class Mahasiswa {
	
	private String 	nama;
	private String 	alamat;
	private String 	nim;
	private boolean jenisKelamin; //0 (Perempuan), 1 (Laki-Laki)
	private String 	prodi;
	private String 	jurusan;
	private String 	fakultas;
	
	
	public Mahasiswa(String nama, String alamat, String nim, boolean jenisKelamin, String prodi, String jurusan,
			String fakultas) {
		super();
		this.nama = nama;
		this.alamat = alamat;
		this.nim = nim;
		this.jenisKelamin = jenisKelamin;
		this.prodi = prodi;
		this.jurusan = jurusan;
		this.fakultas = fakultas;
	}

	public Mahasiswa() {
		this.setNama("<nama belum ada bro");
		this.setNim("Nim nya isi dlu ya :)");
		this.setAlamat("<Alamat lu ga ada bre");
		this.setProdi("<Prodi lu apaan bro");
		this.setFakultas("<Fakultas nya isi dulu");
		this.setJurusan("Jurusan isi dulu ya bro");
	}
	
	public void printAllInfo() {
		System.out.println("Nama: " + this.getNama());
		System.out.println("Alamat: " + this.getAlamat());
		System.out.println("NIM: " + this.getNim());
		System.out.println("Prodi: " + this.getProdi());
		System.out.println("Jurusan: " + this.getJurusan());
		System.out.println("Fakultas: " + this.getFakultas());
		
		System.out.println("Jenis Kelamin: "+
		(jenisKelamin ? "Laki-Laki" : "Perempuan"));
	}
	
	public String getNama() {
		return this.nama;
	}
	
	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getAlamat() {
		return this.alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getNim() {
		return nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}

	public boolean isJenisKelamin() {
		return jenisKelamin;
	}

	public void setJenisKelamin(boolean jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}

	public String getProdi() {
		return prodi;
	}

	public void setProdi(String prodi) {
		this.prodi = prodi;
	}

	public String getJurusan() {
		return jurusan;
	}

	public void setJurusan(String jurusan) {
		this.jurusan = jurusan;
	}

	public String getFakultas() {
		return fakultas;
	}

	public void setFakultas(String fakultas) {
		this.fakultas = fakultas;
	}

}
