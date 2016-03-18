package kelompok7;

public abstract class Orang {
    String nama;
	private String alamat;
	
	public void setNama(String nama){
		this.nama=nama;
	}
	
	public String getNama(){
		return nama;
	}
	
	public void setAlamat(String alamat){
		this.alamat=alamat;
	}
	
	public String getAlamat(){
		return alamat;
	}
}
