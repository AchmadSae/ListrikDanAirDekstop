
package dataTable.PengecekanNeeds;


public class ModelProgres {
    String id_cek,username, progres, created_at;
   Boolean isValid;
    
    public ModelProgres( String id_cek, String username, String progres, String created_at, Boolean isValid){
        this.id_cek = id_cek;
        this.username = username;
        this.progres = progres;
        this.created_at = created_at;
        this.isValid = isValid;
    }

    public String getId_cek() {
        return id_cek;
    }

    public String getUsername() {
        return username;
    }

    public String getProgres() {
        return progres;
    }

    public String getCreated_at() {
        return created_at;
    }

    public Boolean getIsValid() {
        return isValid;
    }

  
}
