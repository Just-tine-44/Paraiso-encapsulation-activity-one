public class encapsulationPerson {
   
   public static void main(String[] args) {
      
      Person p = new Person("Justiniano", "Antengteng", "Paradise", 23, 9, 7, 2001, "Pooc, Biasong City, Cebu");
      p.setFirstName("Justine");
      String first = p.getFirstName();
      
      p.setMiddleName("Intong");
      String two = p.getMiddleName();
      
      p.setLastName("Paraiso");
      String third = p.getLastName();
      
      p.setAge(20);
      int fourth = p.getAge();
      
      p.setBirthday(9, 7, 2003);
      String fifth = p.getBirthday();
      
      p.setAddress("Pooc, Talisay City, Cebu");
      String sixth = p.getAddress();
      
      System.out.println("First Name: " + first);
      System.out.println("Middle Name: " + two);
      System.out.println("Last Name: " + third);
      System.out.println("Age: " + fourth);
      System.out.println("Birthday: " + fifth);
      System.out.println("Address: " + sixth);
   }
}

class Person {
   
   private String firstName, middleName, lastName, address;
   private int age;
   private int birthdayDay, birthdayMonth, birthdayYear;
   
   Person(String firstName, String middleName, String lastName, int age, int birthdayMonth, int birthdayDay, int birthdayYear, String address) {
      this.firstName = firstName;
      this.middleName = middleName;
      this.lastName = lastName;
      this.age = age;
      this.birthdayMonth = birthdayMonth;
      this.birthdayDay = birthdayDay;
      this.birthdayYear = birthdayYear;
      this.address = address;
   }
   
   void setFirstName(String firstName) {
      this.firstName = firstName;
   }
   
   String getFirstName() {
      return firstName;
   }
   
   void setMiddleName(String middleName) {
      this.middleName = middleName;
   }
   
   String getMiddleName() {
      return middleName;
   }
   
   void setLastName(String lastName) {
      this.lastName = lastName;
   }
   
   String getLastName() {
      return lastName;
   }
   
   void setAge(int age) {
      this.age = age;
   }
   
   int getAge() {
      return age;
   }
   
   void setBirthday(int birthdayMonth, int birthdayDay, int birthdayYear) {
      this.birthdayMonth = birthdayMonth;
      this.birthdayDay = birthdayDay;
      this.birthdayYear = birthdayYear;
   }
   
   String getBirthday() {
      return String.format("%02d/%02d/%04d", birthdayMonth, birthdayDay, birthdayYear);
   }
   
   void setAddress(String address) {
      this.address = address;
   }
   
   String getAddress() {
      return address;
   }
}
