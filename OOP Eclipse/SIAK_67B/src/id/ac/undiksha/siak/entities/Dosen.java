package id.ac.undiksha.siak.entities;

public class Dosen {
	
	private String 	nama;
	private String 	alamat;
	private String 	nip;
	private boolean jenisKelamin; //0 (Perempuan), 1 (Laki-Laki)
	private String 	prodi;
	private String 	jurusan;
	private String 	fakultas;
	private String 	jabatan;
	

	public Dosen(String nama, String alamat, String nip, boolean jenisKelamin, String prodi, String jurusan,
			String fakultas, String jabatan) {
	super();
	this.nama = nama;
	this.alamat = alamat;
	this.nip = nip;
	this.jenisKelamin = jenisKelamin;
	this.prodi = prodi;
	this.jurusan = jurusan;
	this.fakultas = fakultas;
	this.jabatan = jabatan;
	}
	
/*	public Dosen() {
		this.setNama("<Nama belum diisi");
		this.setNip("Nip nya isi dlu ya :)");
		this.setAlamat("<Alamat Tidak Terdekteksi");
		this.setProdi("<Prodi tidak terisi");
		this.setFakultas("<Fakultas tidak terisi");
		this.setJurusan("Jurusan tidak terdekteksi");
		this.setJabatan("Jabatan tidak terdekteksi");
	}
*/	
	public void printAllInfo() {
		System.out.println("Nama: " + this.getNama());
		System.out.println("Alamat: " + this.getAlamat());
		System.out.println("NIM: " + this.getNip());
		System.out.println("Prodi: " + this.getProdi());
		System.out.println("Jurusan: " + this.getJurusan());
		System.out.println("Fakultas: " + this.getFakultas());
		System.out.println("Jabatan: " + this.getJabatan());
		
		System.out.println("Jenis Kelamin: "+
		(jenisKelamin ? "Laki-Laki" : "Perempuan"));
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getNip() {
		return nip;
	}

	public void setNip(String nip) {
		this.nip = nip;
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

	public String getJabatan() {
		return jabatan;
	}

	public void setJabatan(String jabatan) {
		this.jabatan = jabatan;
	}
	
	
}
