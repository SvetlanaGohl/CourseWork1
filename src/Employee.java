public class Employee {

    private String personSurname;
    private String personName;

    private String personPatronymic;
    private int dept;
    private int salary;
    private static int idCounter = 126487;
    private int id;


    public Employee(String personSurname, String personName, String personPatronymic, int dept, int salary) {
        this.personSurname = personSurname;
        this.personName = personName;
        this.personPatronymic = personPatronymic;
        this.dept = dept;
        this.salary = salary;
        this.id = idCounter++;

    }

    public String getPersonSurname() {
        return personSurname;
    }

    public String getPersonName() {
        return personName;
    }

    public String getPersonPatronymic() {
        return personPatronymic;
    }

    public int getId() {
        return id;
    }

    public int getDept() {
        return dept;
    }

    public void setDept(int dept) {
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String toString() {
        return "Сотрудник - " + personSurname + personName + personPatronymic + ", отдел - " + dept + ", заработная плата - " + salary + " рублей." + "id " + id + ";";
    }
    public String getFIOEmployee() {
        return "Сотрудник - " + personSurname + personName + personPatronymic;
    }

}
