public class person1 {
    public static void main(String[] args) {
        Person persons = new Person();
         persons.setAge(15);

         int age = persons.getAge();
         System.out.println(age);
        //------------------------------------------
        persons.setName("Carlos");

        String name = persons.getName();
        System.out.println(name);
        //------------------------------------------
        persons.setTel(12345);

        int tel = persons.getTel();
        System.out.println(tel);
        //------------------------------------------
        

    }
}
    class Person {
        private int age;
        private String name;
        private int tel;
     //---------------------------------------------

     public void setAge(int age) {
        this.age = age;
     } 
    
     public int getAge() {
        return this.age;
     }
     //----------------------------------------------

     public void setName(String name) {
        this.name = name;
     } 
    
     public String getName() {
        return this.name;
     }
     //----------------------------------------------

     public void setTel(int tel) {
        this.tel = tel;
     } 
    
     public int getTel() {
        return this.tel;
     }
     //----------------------------------------------

    }
