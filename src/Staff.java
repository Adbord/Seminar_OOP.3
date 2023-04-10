import java.util.ArrayList;

public class Staff {
    public String staffName;
    public ArrayList<Persona> personaInStaf;

    public Staff (String dn){
        this.staffName = dn;
        this.personaInStaf = new ArrayList<>();
    }



    public void addPeople(Persona p){
        this.personaInStaf.add(p);
    }

    public String getStafName(){
        return this.staffName;
    }
}
