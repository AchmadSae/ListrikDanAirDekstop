
package dataTable.KomplainNeeds;


public class ModelKomplain {
    String no_unit, name, id_komplain,date,komplain,progres;
    Boolean isDone;
    
    public ModelKomplain(String no_unit,String name,String id_komplain,String date,String komplain, String progres, Boolean isDone){
        this.no_unit = no_unit;
        this.name = name;
        this.id_komplain = id_komplain;
        this.date = date;
        this.komplain = komplain;
        this.progres = progres;
        this.isDone = isDone;
    }

    public String getNo_unit() {
        return no_unit;
    }

    public String getName() {
        return name;
    }

    public String getId_komplain() {
        return id_komplain;
    }

    public String getDate() {
        return date;
    }

    public String getKomplain() {
        return komplain;
    }

    public String getProgres() {
        return progres;
    }

    public Boolean getIsDone() {
        return isDone;
    }
}
