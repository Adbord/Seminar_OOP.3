public class Persona {
    String FIO;
    int age;
    String staff;

    public Persona(String f, int a, String d){
        this.FIO = f;
        this.staff = d;
        this.age = a;
    }

    public void setStaff(String staffName){
        this.staff = staffName;
    }

    public String getInfo(){
        return String.format("ФИО: %s; Возраст: %d", FIO, age);
    }

    public String getFIO() {
        return FIO;
    }

    public String getStaff() {
        return staff;
    }

}
