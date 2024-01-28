package latihan_uas.model;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import latihan_uas.entity.PeminjamanDetail;
public class PeminjamanDetailTableModel extends AbstractTableModel{
    private List<PeminjamanDetail> rows;
    public PeminjamanDetailTableModel(List<PeminjamanDetail>entitys){
        this.rows = entitys;
    }
    
    @Override
    public int getRowCount(){
        return this.rows.size();
    }
    
    @Override
    public int getColumnCount(){
        return 3;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
        PeminjamanDetail peminjamanDetail = this.rows.get(rowIndex);
        switch(columnIndex){
            case 0:
                return peminjamanDetail.getKode_buku();
            case 1:
                return peminjamanDetail.getNama_buku();
            case 2:
                return peminjamanDetail.getJumlah();
            default:
                return null;
        }
    }
    
    @Override
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "Kode Buku";
            case 1:
                return "Nama Buku";
            case 2:
                return "Jumlah";
            default:
                return null;
        }
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex){
        switch(columnIndex){
            case 0:
                return String.class;
            case 1:
                return String.class;
            case 2:
                return Integer.class;
            default:
                return super.getColumnClass(columnIndex);
        }
    }
    
    public List<PeminjamanDetail> getRows(){
        return rows;
    }
    
    public void setRows(List<PeminjamanDetail> rows){
        this.rows = rows;
    }
}
