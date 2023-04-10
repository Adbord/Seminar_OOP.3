public class Program {
    public static void main(String[] args){
        // Создаем организацию(небольшой офис)
        Office gb = new Office("GB");
        // Создаем отдел и добавляем его в список отделов
        Staff acc = new Staff("Менеджеры");
        gb.AddStaff(acc);
        Staff teach = new Staff("Руководители");
        gb.AddStaff(teach);
        // Первоначальное добавление кандидатов в отделы
        Recruitment rec = new Recruitment();
        rec.setRecruitment(acc, teach);
        rec.setRecruitment(acc, teach);
        rec.setRecruitment(acc, teach);
        rec.setRecruitment(acc, teach);

        // Вывод в консоль списков отделов
        gb.PrintWorker();

        // Перевод сотрудника из одного отдела в другой
        Transfer tr = new Transfer();
        tr.getTransfer(gb, acc, teach);

        // Вывод в консоль списков отделов
        gb.PrintWorker();
    }

}
