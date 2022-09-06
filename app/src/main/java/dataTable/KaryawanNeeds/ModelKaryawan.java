

package dataTable.KaryawanNeeds;


public class ModelKaryawan {
    String  id_staf,password,name,position,phone,email;
    
    public ModelKaryawan(String id_staf, String password, String name, String position, String phone, String email){
        this.id_staf = id_staf;
        this.password = password;
        this.name = name;
        this.position = position;
        this.phone = phone;
        this.email = email;
    }

    public String getId_staf() {
        return id_staf;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
    
    
}
