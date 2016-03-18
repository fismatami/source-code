package kelompok7;

public class Mahasiswa extends Orang{
	private String nim;
	private String kelas;
	private int nilai;
	
	public Mahasiswa(String nama, String nim, String kelas, int nilai){
		this.nama=nama;
		this.nim=nim;
		this.kelas=kelas;
		this.nilai=nilai;
	}
	
	public void setNim(String nim){
		this.nim=nim;
	}
	
	public String getNim(){
		return nim;
	}
	
	public void setKelas(String kelas){
		this.kelas=kelas;
	}
	
	public String getKelas(){
		return kelas;
	}
	
	public void setNilai(int nilai){
		this.nilai=nilai;
	}
	
	public int getNilai(){
		return nilai;
	}
	
	public void displayInfo(){
		System.out.println("Nama :"+getNama());
		
	}
	
}
