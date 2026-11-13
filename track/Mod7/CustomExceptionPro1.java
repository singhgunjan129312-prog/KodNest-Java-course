
import java.util.Scanner;
class DrivingLicence {
    int age;

    void takeUserAge(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your Age:");
        age = sc.nextInt();
    }
    void verify() throws UnderAgeException,OverAgeExceptionverAgeException{
        if(age < 18){
         UnderAgeException uae = new UnderAgeException();
         throw uae;
        } else if(age > 65)           OverAgeException 5) {
            throw new OverAgeException();
        } 
        else if(age > 65) {
            throw new OverAgeException();
        } 
        else {
            
            System.out.println("DrivingLicence will be issued");
        }

    }

}
class UnderAgeException extends Exception

{

	UnderAgeException()

	{

		super("You are tooo young,,,, still have a time");

	}

}
class OverAgeException extends Exception {

    public OverAgeException() {
        super("You are tooo old,,,take rest");
    }
    
}
class CustomExceptionPro1

{

    public static void main(String[] args)

    {

        DrivingLicence dl = new DrivingLicence();

        dl.takeUserAge();



        try

        {

            dl.verify();

        }

  UnderAge      cat | Overch(UnderAgeException | OverAgeException e)

        {

        		e.printStackTrace();

        }

    }

}