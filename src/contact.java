public class contact{
   private String number ;
   private String name;
   private String email ;
   public contact(String num , String name , String mail){
       this.number = num;
       this.name = name ;
       this.email = mail;
   }
   public String getName(){
       return name;
   }
   public String getNumber(){
       return number ;
   }
   public String getEmail(){
       return email;
   }
   public void setNumber(String num){
       this.number = num ;
   }
   public void setName(String name){
       this.name = name ;
   }
   public void setEmail(String email){
       this.email = email;
   }
   public String toString(){
       return "Name : "+name+"Email : "+email + "Number : "+number;
   }

}
