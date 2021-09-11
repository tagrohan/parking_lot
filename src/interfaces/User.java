package interfaces;

public abstract class User {

   String id;

   String name;
   String email;
   String phoneNo;


   public User() {
   }

   public User(String id, String name, String email, String phoneNo) {
      this.id = id;
      this.name = name;
      this.email = email;
      this.phoneNo = phoneNo;
   }

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getPhoneNo() {
      return phoneNo;
   }

   public void setPhoneNo(String phoneNo) {
      this.phoneNo = phoneNo;
   }

   @Override
   public String toString() {
      return "User{" +
              "id='" + id + '\'' +
              ", name='" + name + '\'' +
              ", email='" + email + '\'' +
              ", phoneNo='" + phoneNo + '\'' +
              '}';
   }
}
