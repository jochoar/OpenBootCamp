public class typeUser {
    public static void main(String[] args) {
        workerUser worker = new workerUser();
        worker.setAge(25);
        worker.setName("Andres");
        worker.setTel(2345);
        worker.setSalary(1500);

        System.out.println("Age " + worker.getAge());
        System.out.println("Name " + worker.getName());
        System.out.println("Tel " + worker.getTel());
        System.out.println("Salary " + worker.getSalary());
    }
}

class personUser {
    int age;
    String name;
    int tel;
    
    //---------------------------------
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age; 
    }
    //---------------------------------
    
    public void setName(String name) {
        this.name = name;
     } 
    
    public String getName() {
        return this.name;
     }
    //---------------------------------

    public void setTel(int tel) {
        this.tel = tel;
     } 
    
    public int getTel() {
        return this.tel;
     }
    //--------------------------------- 
}

class clientUser extends personUser {
    String credit;
    //------------------------------------
    public void setCredit(String credit){
        this.credit = credit;
    }

    public String getCredit(){
        return this.credit;
    }
    //------------------------------------
}

class workerUser extends personUser {
    int salary;
    //------------------------------------
    public void setSalary(int salary){
        this.salary = salary;
    }

    public int getSalary(){
        return this.salary;
    }
}
