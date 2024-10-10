
import java.util.*;
public class Temp_Cal {

	public static void main(String[] args) {
		
		    Scanner scan= new Scanner(System.in);
		    System.out.println("Select a unit of temperature to Convert \n (1)Fahrenheit (°C) \n (2)Celsius (°F) \n (3)Kelvin (K)");
		    int i=scan.nextInt();
		    
		    if(i==1){
		    	System.out.println("You Entered a Option: "+i+"\nEnter a Value to Convert:");
		        int input=scan.nextInt();
		        System.out.println("In Fahrenheit: "+input+"°F");
		        double c=(input-32)/1.8;
		        System.out.println("In Celsius: "+ Math.round(c*10.0)/10.0+"°C");
		        System.out.println("In Kelvin: "+((input-32)*(5/9))+273.15);

		    }else if(i==2){
		    	System.out.println("You Entered a Option: "+i+"\nEnter a Value to Convert:");
		    	int input=scan.nextInt();
		    	System.out.println("In Fahrenheit:"+((input*9/5)+32)+"°F");
		    	System.out.println("In Celsius: "+ input+"°C");
		    	System.out.println("In Kelvin: "+ (input+273.15));


		}
		else if(i==3){
	    	System.out.println("You Entered a Option: "+i+"\nEnter a Value to Convert;");
	    	int input=scan.nextInt();
	    	System.out.println("In Fahrenheit: "+Math.round((((input-273.15)*9/5)+32)*10.0)/10.0+"°F");
	    	System.out.println("In Celsius: "+ Math.round((input-273.15)*10.0)/10.0+"°C");
	    	System.out.println("In Kelvin: "+input);



		}
		else{
		    System.out.println("You Entered Wrong Option");
		}
		scan.close();
	}

}
