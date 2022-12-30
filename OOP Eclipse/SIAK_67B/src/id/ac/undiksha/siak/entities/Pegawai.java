package id.ac.undiksha.siak.entities;

public class Pegawai {

	private String 	nama;
	private String 	alamat;
	private String 	nip;
	private boolean jenisKelamin; //0 (Perempuan), 1 (Laki-Laki)
	private String 	unit;
	private String 	jabatan;
	
	public Pegawai(String nama, String alamat, String nip, boolean jenisKelamin, String unit,String jabatan) {
	super();
	this.nama = nama;
	this.alamat = alamat;
	this.nip = nip;
	this.jenisKelamin = jenisKelamin;
	this.unit = unit;
	this.jabatan = jabatan;
	}
	
	public void printAllInfo() {
		System.out.println("Nama: " + this.getNama());
		System.out.println("Alamat: " + this.getAlamat());
		System.out.println("NIP: " + this.getNip());
		System.out.println("Unit: " + this.getUnit());
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

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getJabatan() {
		return jabatan;
	}

	public void setJabatan(String jabatan) {
		this.jabatan = jabatan;
	}
	
	
	
}
