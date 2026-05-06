public class Company {
    
    public static void main(String[] args) {

        Employee Alex=new Employee();
        Employee Martin=new Employee();
        Project p1=new Project();

        p1.setProjectname("Bank Management System");
        p1.setTeammember("Alex");
    



        /*Alex.Employeeid=145;
        Alex.Employeename="Alex";
        Alex.EmployeeSalary=45000;

        Martin.Employeeid=124;
        Martin.Employeename="Martin";
        Martin.EmployeeSalary=55000;*/

    

        Alex.setEmployeeid(123);
        Alex.setEmployeename("Alex");
        Alex.setEmployeeSalary(45000);


         Martin.setEmployeeid(124);
         Martin.setEmployeename("Martin");
         Martin.setEmployeeSalary(55000);







        System.out.println(Alex.Employeeid);
        System.out.println(Alex.Employeename );
        System.out.println(Alex.EmployeeSalary);
        

        System.out.println(Martin.Employeeid);
        System.out.println(Martin.Employeename );
        System.out.println(Martin.EmployeeSalary);
        
        System.out.println("Project Name: " +p1.Projectname);
        System.out.println("Team Member: " + p1.Teammember);

    }
}
