
package dataTable.PengecekanNeeds;


public class ModelProgres {
    String id_cek,username, progres, created_at;
    
    public ModelProgres( String id_cek, String username, String progres, String created_at){
        this.id_cek = id_cek;
        this.username = username;
        this.progres = progres;
        this.created_at = created_at;
    }

    public String getId_cek() {
        return id_cek;
    }

    public void setId_cek(String id_cek) {
        this.id_cek = id_cek;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getProgres() {
        return progres;
    }

    public void setProgres(String progres) {
        this.progres = progres;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }




}
