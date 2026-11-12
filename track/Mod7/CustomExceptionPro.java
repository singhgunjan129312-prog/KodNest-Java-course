
import java.util.Scanner;
class DrivingLicence {
    int age;

    void takeUserAge(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your Age:");
        age = sc.nextInt();
    }
    void verify() throws UnderAgeException{
        if(age < 18){
         UnderAgeException uae = new UnderAgeException();
         throw uae;
        } else {
            
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
class CustomExceptionPro

{

    public static void main(String[] args)

    {

        DrivingLicence dl = new DrivingLicence();

        dl.takeUserAge();



        try

        {

            dl.verify();

        }

        catch(Exception e)

        {

        		e.printStackTrace();

        }

    }

}



