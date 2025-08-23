import java.util.Scanner;
class Employee1 {
    String name;
    int Salary;
    Employee1(String name,int Salary){
this.name=name;
this.Salary=Salary;
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Salary : "+ Salary);
    }
    public static void main(String[] args) {
        Employee1 emp[]=new Employee1[3];
        Scanner sc=new Scanner(System.in);
        System.out.println("Data of the employees: ");
        for(int i=0;i<3;i++){
            String name;
            int Salary;
name=sc.next();
Salary=sc.nextInt();
           emp[i]=new Employee1(name,Salary);

            
        }
        emp[1].display();
        sc.close();
    }
    
}