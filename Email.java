import java.util.Scanner;
class Email
{
private String firstName;
private String lastName;
private String password;
private String department;
private int mailboxCapacity = 500;
private String alternateEmail;
private final int passwordLength = 8;
private String email;
private String companySuffix = ".company.com";

Email (String fName,String lName)
{
  firstName = fName;
  lastName = lName;
  
  department = setDepartment();
  System.out.println(department);
  password = setPassword(passwordLength);
  System.out.println("Your password is: " + password);
  
  email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + companySuffix;
  System.out.println("Your email is: " + email);
  
}// end Const.

private String setDepartment()
{
  System.out.println("Enter your department: \n1 for Sales \n2 for Development \n3 for Accounting \n0 for none ");
   Scanner dep = new Scanner(System.in);
    int depChoice = dep.nextInt();
     if (depChoice == 1)
       {
        return "Sales";
       }
     else if (depChoice == 2)
       {
        return "Development";
       }
     else if (depChoice == 3)
       {
        return "Accounting";
       }
     else 
       {
        return "none";
       }
}

private String setPassword(int length)
{
 String passwordSet = "ABCDEFGHIJKLMNabcderfghi123459870!@#";
  char[] password = new char[length]; 
   for (int i = 0; i < length; i++)
   { 
     int rand = (int) (Math.random()*passwordSet.length());
     password[i] = passwordSet.charAt(rand);
   
   }
     return new String(password);


}// end setPassword method 

void setMailboxCapacity(int capacity)
{
  this.mailboxCapacity = capacity;

}// end setMAilboxCAp method

void setAlternateEmail(String altEmail)
{
  this.alternateEmail = altEmail;
  
}// end method

void changePassword(String password)
{
  this.password = password;
  
}// end method

public int getMailboxCapacity()
{
  return mailboxCapacity;
}

String getAlternateEmail()
{
  return alternateEmail;
}

String getPassword()
{
  return password;
}// end gets methods

String showInfo()
{
return     "Name: " + firstName +
        "\n Last Name: " + lastName + 
        "\n Company Email: " + email +
        "\n Mailbox Capacity: " + mailboxCapacity;
        
}

}//end email class