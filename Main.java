class Main{
    public static void main(String[] args){
        Teacher teacobj[]=new Teacher[2];
        teacobj[0]=new Teacher("1","A","AA",11,"AAA","AAAA");
        teacobj[1]=new Teacher("2","B","BB",11,"BBB","BBBB");
        teacobj[0].display();
        teacobj[1].display();
    
    }
}
class Employees{
    String Empid;
    String Name;
    String Address;
    int Salary;
    Employees(String id,String name,String addr,int salary){
    this.Empid=id;
    this.Name=name;
    this.Address=addr;
    this.Salary=salary;
}
void display(){
    System.out.println("Empid: "+this.Empid);
    System.out.println("Name: "+this.Name);
    System.out.println("Address: "+this.Address);
    System.out.println("Salary: "+this.Salary);

}
}
class Teacher extends Employees{
    String Department;
    String Subject;
    Teacher(String id,String name,String address,int salary,String dept,String subj){
        super(id,name,address,salary);
        this.Department=dept;
        this.Subject=subj;
    }
void display(){
    System.out.println("..............");
    super.display();
    System.out.println("Dept Name: "+this.Department);
    System.out.println("Subject Name: "+this.Subject);
    System.out.println("..............");
}  
}