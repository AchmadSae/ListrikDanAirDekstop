
package dataTable.PengecekanNeeds;

import config.Connection_db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ControllerPengecekan {
    static private Connection conn = new Connection_db().Connect();
    //create objek array form modelpengecekan
    static ArrayList<ModelPengecekan> cekList;
    static ArrayList<ModelProgres> listProses;
    //create table model
    DefaultTableModel model;
    //class for array list objek
    public ControllerPengecekan() {
    cekList = new ArrayList();
    listProses = new ArrayList();
    
    }
    

    
    //function select data form database
    public static ArrayList<ModelPengecekan> CekAll(){
        //query used in tables
            String qryTbPengecekan ="SELECT monthly.unit, monthly.date, monthly.id_staf, monthly.id_monthly, facility.name, data.current_number, data.amount "
                + "FROM ((data INNER JOIN monthly ON data.id_monthly = monthly.id_monthly) INNER JOIN facility ON data.id_facility = facility.id_facility) ";
          try{
            java.sql.Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(qryTbPengecekan);
            
           // reObject arrayList class ModelPengecekan
           ModelPengecekan cek;
            while (rs.next()){
                    cek = new ModelPengecekan(
                            rs.getString("unit"),
                            rs.getString("date"),
                            rs.getString("id_staf"),
                            rs.getString("id_monthly"),
                            rs.getString("name"),
                            rs.getInt("current_number"),
                            rs.getInt("amount")
                    );
                    cekList.add(cek);
            }
            
        } catch (Exception e){
                JOptionPane.showMessageDialog(null, "An Error to get some Data in Your Application in Table Pengecekan"+e);
        }
        return cekList;
    }
    
    //show data in table
    public DefaultTableModel showData(){
        String[] kolom = {"UNIT","TANGGAL","ID_STAF","ID MONTHLY","FASILITAS","ANGKA METERAN","TOTAL PEMAKAIAN"};
        Object[][] objData = new Object[cekList.size()][7];
        int i = 0;
        
        for(ModelPengecekan n : cekList){
            String[] arrData = {n.getUnit(), n.getDate(), n.getId_staf(),n.getId_monthly(), n.getName(), String.valueOf(n.getCurrent_number()), String.valueOf(n.getAmount())};
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
    //prepare to progres cek session
    public static ArrayList<ModelProgres> ProsesCek(){
      
      //query used proses select form db
      String qry = "SELECT id_cek, username, progres, created_at, isValid FROM tb_cek";
      
      try{
          java.sql.Statement stm = conn.createStatement();
          ResultSet rs = stm.executeQuery(qry);
          
          ModelProgres proses;
          
          while (rs.next()){
              proses = new ModelProgres(
                      rs.getString("id_cek"),
                      rs.getString("username"),
                      rs.getString("progres"),
                      rs.getString("created_at"),
                      rs.getBoolean("isValid")
              );
             listProses.add(proses);
          }
          
      }catch(Exception e){
          JOptionPane.showMessageDialog(null, "An Error to get some Data in Your Application in request value proses cek table");
      }
      return listProses;
      
  }
  //function update pengecekan result
    public void updatePengecekan(String unit,String id_staf,Integer  current_number, Integer amount, String date, byte[] attachment, String fasilitas){
        System.out.println(unit+id_staf+current_number+amount+date+attachment);
        
        String qry = "UPDATE data AS pakai JOIN monthly AS Moon ON Moon.id_monthly = pakai.id_monthly JOIN facility AS fas ON pakai.id_facility = fas.id_facility "
                + "SET pakai.current_number = ?,"
                + "pakai.amount = ?,"
                + "pakai.attachment = ?"
                + " WHERE moon.unit = '"+unit+"' AND moon.date ='"+date+"' AND fas.name ='"+fasilitas+"'";
        
        try {
            PreparedStatement val = conn.prepareStatement(qry);
            val.setInt(1, current_number);
            val.setInt(2, amount);
            val.setBytes(3, attachment);
            

            
            val.executeUpdate();
            JOptionPane.showMessageDialog(null, "Update Data Pengecekan is OK");
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Eror Update | Ada data kosong!");
            System.out.println(e);
        }
    }
 //function insert first record cek progres
     //insert progres cek
    public void insertProgres(String username, String progres, String id_monthly) {

        String qry = "INSERT INTO tb_cek (id_cek,username,progres) VALUES(?,?,?)";
        try {
            PreparedStatement val = conn.prepareStatement(qry);
            val.setString(1,id_monthly);
            val.setString(2, username);
            val.setString(3, progres);

            
            val.executeUpdate();
            JOptionPane.showMessageDialog(null, "Progres Cek is Uptodate");
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Eror in request create record !"+e);
        }
    }
    //update progres
    public void updateProgres(String username, String progres, String id_cek, Boolean valid) {
        
        System.out.println("update progres in : username "+username+"&"+progres+"by id cek = "+id_cek+"");
        
        
        String qry = "UPDATE tb_cek SET username= ?, progres= ?, isValid=? WHERE id_cek =? ";
             
         try {
            PreparedStatement val = conn.prepareStatement(qry);
            val.setString(1, username);
            val.setString(2, progres);
            val.setBoolean(3, valid);
            val.setString(4, id_cek);
            
            val.executeUpdate();
            JOptionPane.showMessageDialog(null, "Progres Cek is Uptodate");
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Eror in request update !"+e);
        }
    }
    

    
}
