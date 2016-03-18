package kelompok7;

import java.util.ArrayList;

public class Lokasi 
{
        private String lokasi;
        private Pembimbing pembimbing;
        private int nokelp=0;
        private int maxkel=10;
	private ArrayList<Kelompok> k=new ArrayList<Kelompok>();

        public Lokasi(String lokasi, Pembimbing pemb){
            this.lokasi=lokasi;
            this.pembimbing=pemb;
        }

        public Pembimbing getPembimbing() {
        return pembimbing;
        }

        public void setPembimbing(Pembimbing pembimbing) {
        this.pembimbing = pembimbing;
        }
   
        public String getLokasi() {
        return lokasi;
    
        }

        public int getnokelp() {
        return nokelp;
        }
	
	
	public void createKelompok(String jurusan)
	{
            Kelompok kelp = new Kelompok(this.nokelp, jurusan, this.pembimbing);
            k.add(kelp);
        }
        
        public Kelompok searchKelompok(int noKelp){
            Kelompok kelp =null;
            noKelp--;
            kelp=k.get(noKelp);
            return kelp;
        }
        
        public void addMahasiswaToKelompok(int noKelp, Mahasiswa m){
            Kelompok search = searchKelompok(noKelp);
            search.addAnggota(m);
            System.out.println(m.getNama()+" Telah Ditambahkan dalam kelompok "+noKelp);
        }
        
        public void displayInfo() {
		System.out.println("DATA KELOMPOK");
                System.out.println();
                for(int i=0; i<k.size(); i++){
                    System.out.println("Kelompok\t:"+(k.get(i).getNoKelp()+1));
                    System.out.println("Jurusan \t:"+k.get(i).getJurusan());
                    System.out.println("Pembimbing : "+k.get(i).getPembimbing().getNama());
                    System.out.println("Anggota : ");
                    k.get(i).displayKelompok();
                }
                
	}
        
        
}
