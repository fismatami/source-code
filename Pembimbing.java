package kelompok7;

public class Pembimbing extends Orang{
    private int nip;
    private String jabatan;

    public Pembimbing(int nip, String jabatan, String nama) {
        this.nip = nip;
        this.jabatan = jabatan;
        this.nama=nama;
    }
    
    
    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
    
    
}
