package latihan_uas.entity;
import java.util.Date;
public class Peminjaman {
    private String no_peminjaman;
    private String peminjam;
    private Date tanggal;

    public String getNo_peminjaman() {
        return no_peminjaman;
    }

    public void setNo_peminjaman(String no_peminjaman) {
        this.no_peminjaman = no_peminjaman;
    }

    public String getPeminjam() {
        return peminjam;
    }

    public void setPeminjam(String peminjam) {
        this.peminjam = peminjam;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }
    
    
}
