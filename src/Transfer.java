import java.util.Scanner;
import java.util.ArrayList;

public class Transfer {
    public void getTransfer(Office e, Staff d1, Staff d2){
        System.out.println("Введите ФИО сотрудника:");
        Scanner scan = new Scanner(System.in);
        String fio = scan.nextLine();
        if (Consenting()) {
            for (Persona p : d1.personaInStaf) {
                if (fio.equals(p.getFIO())){
                    Persona temp = p;
                    int index = d1.personaInStaf.indexOf(p);
                    d1.personaInStaf.remove(index);
                    temp.setStaff(d2.getStafName());
                    d2.personaInStaf.add(temp);
                    e.ClearList(e);
                    e.listStaff.add(d1);
                    e.listStaff.add(d2);
                    fio = "";
                    break;
                }
            }
            for (Persona p : d2.personaInStaf) {
                if (fio.equals(p.getFIO())){
                    Persona temp = p;
                    int index = d2.personaInStaf.indexOf(p);
                    d2.personaInStaf.remove(index);
                    temp.setStaff(d1.getStafName());
                    d1.personaInStaf.add(temp);
                    e.ClearList(e);
                    e.listStaff.add(d1);
                    e.listStaff.add(d2);
                    break;
                }
            }
        }
    }

    public boolean Consenting(){
        System.out.println("Хотите перейти в другой отдел?");
        //Scanner scan = ;
        System.out.println("0 - НЕТ;   1 - ДА");
        int choice = (new Scanner(System.in)).nextInt();
        return choice != 0;
    }
}
