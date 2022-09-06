
package dataTable.KomplainNeeds;

import config.Connection_db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ControllerKomplain {
    static private Connection conn = new Connection_db().Connect();
    
    static ArrayList<ModelKomplain> kompList;
    //cretae table model
    DefaultTableModel model;
    
    public ControllerKomplain(){
    kompList = new ArrayList();
    }
    
        //function select data form database
    public static ArrayList<ModelKomplain> CekAllKomplain(){
        //query used in tables
        String qryTbPengecekan ="SELECT tb_komplain.no_unit, penghuni.name, tb_komplain.id_komplain, tb_komplain.date, tb_komplain.komplain, tb_komplain.progres, tb_komplain.isDone FROM "
                + "(penghuni INNER JOIN tb_komplain ON penghuni.unit = tb_komplain.no_unit) ";
          try{
            java.sql.Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(qryTbPengecekan);
            
           // reObject arrayList class ModelPengecekan
           ModelKomplain cek;
            while (rs.next()){
                    cek = new ModelKomplain(
                            rs.getString("no_unit"),
                            rs.getString("name"),
                            rs.getString("id_komplain"),
                            rs.getString("date"),
                            rs.getString("komplain"),
                            rs.getString("progres"),
                            rs.getBoolean("isDone")
                    );
                    kompList.add(cek);
            }
            
        } catch (Exception e){
                JOptionPane.showMessageDialog(null, "An Error to get some Data in Your Application in Table Pengecekan");
                System.out.println(e);
        }
        return kompList;
    }
    
        //show data in table
    public DefaultTableModel showData(){
        String[] kolom = {"UNIT","NAMA PENGHUNI","ID_KOMPLAIN","TANGGAL","KOMPLAIN","PROGRES","SELESAI"};
        Object[][] objData = new Object[kompList.size()][7];
        int i = 0;
        
        for(ModelKomplain n : kompList){
            String[] arrData = {n.getNo_unit(), n.getName(), n.getId_komplain(),n.getDate(),n.getKomplain(), n.getProgres(), String.valueOf(n.getIsDone())};
            objData[i] = arrData;
            i++;
        }
        
        model = new DefaultTableModel(objData,kolom){
            //disable edit row table
            @Override
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }
        };
        return model;    
    }
    //insert
        public void insertProgres(String id_komplain,String no_unit, String komplain) {

        String qry = "INSERT INTO tb_komplain (id_komplain,no_unit,komplain) VALUES(?,?,?)";
        try {
            PreparedStatement val = conn.prepareStatement(qry);
            val.setString(1,id_komplain);
            val.setString(2, no_unit);
            val.setString(3, komplain);

            
            val.executeUpdate();
            JOptionPane.showMessageDialog(null, "Create or Update Progres Komplain is succses");
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Eror in request create record !");
            System.out.println(e);
        }
    }
        //update progres
    public void updateProgresKomplain(String progres,Boolean isDone, String date,String id_komplain) {
        
        System.out.println("update progres in : username "+id_komplain+"&"+progres);
        
        
        String qry = "UPDATE tb_komplain SET progres= ?, isDone= ?, date = ?, WHERE id_komplain = ?";
             
         try {
            PreparedStatement val = conn.prepareStatement(qry);
            val.setString(1, progres);
            val.setBoolean(2, isDone);
            val.setString(3, date);
            val.setString(4,id_komplain);
            
            val.executeUpdate();
            JOptionPane.showMessageDialog(null, "Progres Cek is Uptodate");
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Eror in request update !");
            System.out.println(e);
        }
    }
    
    //delted
    public void deletedKomplain(String id_komplain){
        String qry = "DELETE FROM tb_komplain WHERE id_komplain ='"+id_komplain+"'";
        
            try{
                PreparedStatement stat = conn.prepareStatement(qry);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "Deleted is Succses !");
             }
                catch (SQLException e){
                JOptionPane.showMessageDialog(null, "Error in Deleted");
                System.out.println(e);
             }
    }
}
