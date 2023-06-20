public class Storage {
    private Employee[] employees = new Employee[10];

    public Storage() {

        employees[0] = new Employee("Иванов ", "Андрей ", "Анатольевич", 1, 15300);
        employees[1] = new Employee("Негаева ", "Кира ", "Владимировна", 1, 16800);
        employees[2] = new Employee("Орлова ", "Ольга ", "Эдуардовна", 2, 15700);
        employees[3] = new Employee("Алиева ", "Агата ", "Александровна", 2, 20500);
        employees[4] = new Employee("Петров ", "Кирилл ", "Константинович", 3, 14500);
        employees[5] = new Employee("Серов ", "Максим ", "Алексеевич", 3, 16000);
        employees[6] = new Employee("Сидоров ", "Олег ", "Вячеславович", 4, 19300);
        employees[7] = new Employee("Бакунин ", "Данил ", "Олегович", 4, 17300);
        employees[8] = new Employee("Белова ", "Вера ", "Ивановна", 5, 18700);
        employees[9] = new Employee("Есенина ", "София ", "Дмитриевна", 5, 14800);

    }

    public void printAllPersons() {
        for (Employee person : employees) {
            System.out.println(person);
        }
    }

    public int printAllSalary() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        return sum;
    }

    public Employee findMaxSalaryPerson() {
        Employee maxSalaryPerson = employees[0];
        for (Employee person : employees) {
            if (person.getSalary() > maxSalaryPerson.getSalary()) {
                maxSalaryPerson = person;
            }
        }
            return maxSalaryPerson;

    }

    public Employee findMinSalaryPerson() {
        Employee minSalaryPerson = employees[0];
        for (Employee person : employees) {
            if (person.getSalary() < minSalaryPerson.getSalary()) {
                minSalaryPerson = person;
            }
        }
        return minSalaryPerson;
    }
    public double findAverageSalary() {
         return printAllSalary() / employees.length;
    }
    public void printFIOEmployee() {
        for (Employee person : employees) {
            System.out.println(person.getFIOEmployee());
        }
    }
}
