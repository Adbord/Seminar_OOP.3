import java.util.ArrayList;

public class Office {
    public String officeName;
    public ArrayList<Staff> listStaff;

    public Office(String n){
        this.officeName = n;
        this.listStaff = new ArrayList<>();
    }

    public void AddStaff(Staff staff){
        this.listStaff.add(staff);
    }

    public void PrintWorker(){
        for (Staff staff : listStaff) {
            System.out.printf("%s. Штат сотрудников:\n", staff.getStafName());
            //Staff d = new Staff(null)
            for (Persona p : staff.personaInStaf) {
                System.out.println(p.getInfo());
            }
        }
        System.out.println("----------------------------");
    }

    public void ClearList(Office e){
        e.listStaff.clear();

    }



}