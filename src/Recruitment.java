import java.util.Scanner;

public class Recruitment {

    public void setRecruitment(Staff dep1, Staff dep2){
        Persona p = AddCandidate();

        System.out.println("Когда удобно Вам устроиться?");
        System.out.println("Если Вы передумали - 0; если в отдел маркетинга - 1; если отдел сбыта -2");
        String option = (new Scanner(System.in)).nextLine();
        switch (option) {
            case "0":
                System.out.println("Как решите приходите");
                break;
            case "1":
                p.setStaff(dep1.getStafName());
                dep1.addPeople(p);
                break;
            case "2":
                p.setStaff(dep2.getStafName());
                dep2.addPeople(p);
                break;
        }

    }

    public Persona AddCandidate(){
        String fio;
        int age;
        String staff;
        System.out.println("ФИО работника: ");
        fio = (new Scanner(System.in)).nextLine();
        System.out.println("Возраст работника: ");
        age = (new Scanner(System.in)).nextInt();
        staff = "кандидат";
        Persona persona =  new Persona(fio, age, staff);
        return persona;
    }

}
