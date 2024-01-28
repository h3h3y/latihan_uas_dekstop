package latihan_uas.model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import latihan_uas.entity.Peminjaman;
public class PeminjamanModel {
    private Connection connection;
    public PeminjamanModel (Connection connection){
        this.connection = connection;
    }
    
    public void insert(Peminjaman peminjaman) throws SQLException{
        String sql = 
                "INSERT INTO "
                    + "tr_peminjaman("
                        + "no_peminjam, "
                        + "peminjam, "
                        + "tanggal"
                    + ") "
                + "VALUES("
                    + "?, "
                    + "?, "
                    + "?"
                + ")";
        
        PreparedStatement statemen = connection.prepareStatement(sql);
        statemen.setString(1, peminjaman.getNo_peminjaman());
        statemen.setString(2, peminjaman.getPeminjam());
        statemen.setDate(3, new java.sql.Date(peminjaman.getTanggal().getTime()));
        statemen.executeUpdate();
        statemen.close();
    }
}
