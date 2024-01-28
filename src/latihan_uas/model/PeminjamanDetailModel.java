package latihan_uas.model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import latihan_uas.entity.PeminjamanDetail;
public class PeminjamanDetailModel {
    private Connection connection;
    public PeminjamanDetailModel (Connection connection){
        this.connection = connection;
    }
    
    public void insert(PeminjamanDetail peminjamanDetail) throws SQLException{
        String sql = 
                "INSERT INTO "
                    + "tr_detail_peminjaman("
                        + "kode_buku, "
                        + "nama_buku, "
                        + "jumlah, "
                        + "peminjam"
                    + ") "
                + "VALUES("
                    + "?, "
                    + "?, "
                    + "?, "
                    + "?"
                + ")";
        
        PreparedStatement statemen = connection.prepareStatement(sql);
        statemen.setString(1, peminjamanDetail.getKode_buku());
        statemen.setString(2, peminjamanDetail.getNama_buku());
        statemen.setInt(3, peminjamanDetail.getJumlah());
        statemen.setString(4, peminjamanDetail.getPeminjaman().getPeminjam());
        statemen.executeUpdate();
        statemen.close();
    }
    
}
