package kelompok7;

public class Kelompok7 {

    public static void main(String[] args) {
        
      Pembimbing p = new Pembimbing(1201144,"Dosen","Pa Mahmud");
      Lokasi l = new Lokasi("DKI Jakarta",p);
      l.createKelompok("Teknik Informatika"); 
      Mahasiswa m = new Mahasiswa("Coba","1301144363","IF-38-03",3);
      l.addMahasiswaToKelompok(1, m);
      l.displayInfo();
    }
    
}
