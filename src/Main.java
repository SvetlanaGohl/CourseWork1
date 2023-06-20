public class Main {


    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.printAllPersons();
        System.out.println("Сумма затрат на заработную плату составляет - " + storage.printAllSalary() + " рублей.");
        System.out.println("С максимальной зарплатой - " + storage.findMaxSalaryPerson());
        System.out.println("С минимальной зарплатой - " + storage.findMinSalaryPerson());
        System.out.println("Среднее значение по зарплате сотрудников составляет - " + storage.findAverageSalary() + " рублей.");
//        storage.printFIOEmployee();
    }
}