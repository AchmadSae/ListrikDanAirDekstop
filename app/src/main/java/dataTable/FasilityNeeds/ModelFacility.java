
package dataTable.FasilityNeeds;


public class ModelFacility {
    String id_facility,name,default_cost;
    
    public ModelFacility(String id_facility, String name, String default_cost){
        this.id_facility = id_facility;
        this.name = name;
        this.default_cost =default_cost;
    }

    public String getId_facility() {
        return id_facility;
    }

    public String getName() {
        return name;
    }

    public String getDefault_cost() {
        return default_cost;
    }
    
}
