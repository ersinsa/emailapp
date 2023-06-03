import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity=500;
    private int defaultPasswordLength=10;
    private String alternateEmail;
    private String companySuffix="ersacompany.com";

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created =" + this.firstName + " " + this.lastName);

        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        this.password = randomPasswordSet(defaultPasswordLength);
        System.out.println("Your Password is: " + this.password);

        email = firstName.toLowerCase() + "." + lastName.toLowerCase() +"@"+ department+ "." +companySuffix;
        System.out.println("Your Email is:"+ email);


    }

    private String setDepartment() {
        System.out.println("Enter the department: \n1 for Sales\n2 for Development\n3 for Accounting \n0 for None\nEnter Department Code:   ");
        Scanner scanner = new Scanner(System.in);
        int depChoice = scanner.nextInt();
        if (depChoice == 1) {
            return "sales";
        } else if (depChoice == 2) {
            return "dev";

        } else if (depChoice == 3) {
            return "acct";

        } else {
            return "";
        }
    }

    private String randomPasswordSet  (
    int length)

    {
        String randomPasswordSet = "ABCDEFGHJKLMNPORSTYUZX0123456789!@#$%^";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * randomPasswordSet.length());
            password[i] = randomPasswordSet.charAt(rand);
        }
        return new String(password);

    }

    public void setMailboxCapacity(int capacity ) {
        this.mailboxCapacity=capacity;

    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }
    public void changePassword (String password){
        this.password=password;
    }
    public int getMailboxCapacity(){return mailboxCapacity;}
    public String getAlternateEmail(){return alternateEmail;}
    public String getPassword(){return password;}


    public String showInfo(){
        return "DISPLAY NAME: " + firstName + " " + lastName +
                "\nCOMPANY EMAIL: " + email +
                "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
    }
}


