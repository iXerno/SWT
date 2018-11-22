import java.util.GregorianCalendar;
import java.time.YearMonth;

public class Kalender 
{
	public static void main(String[] args) 
	{	
		GregorianCalendar c = new GregorianCalendar();
		
		// Gibt aus, welcher Tag der erste im aktuellen Monat ist.
		YearMonth ym = YearMonth.now();
		String firstDay = ym.atDay(1).getDayOfWeek().name();
		
		int firstday = 0;
		switch (firstDay)
		{	
			case "SUNDAY": 
				firstday = 1;
				break;
			case "MONDAY": 
				firstday = 2;
				break;
			case "TUESDAY": 
				firstday = 3;
				break;
			case "WEDNESDAY": 
				firstday = 4;
				break;
			case "THURSDAY": 
				firstday = 5;
				break;
			case "FRIDAY": 
				firstday = 6;
				break;
			case "SATURDAY": 
				firstday = 7;
				break;
		}
		
		//Gibt den momentanen Tag im Monat aus.
		int momtMonat = c.get(GregorianCalendar.DAY_OF_MONTH);
		
		//Gibt an, wie viele Tage der aktuelle Monat hat.
		int maxMonat = c.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
	
		//Gibt an, mit welchem Tag die Woche beginnt z.b. in DE Montag, USA mit Sonntag (abhängig von der lokalen Einstellung)
		int day = c.getFirstDayOfWeek();
		
	
		
			   	    
	    //Kalender
	    String[] tage = {"Su","Mo","Tu","We","Th","Fr","Sa"};
	    int counter = 1;
	    for(int i = (day-1); ;i++)
	    {
	    	if(i == 7)
	    	{
	    		i = 0;
	    	}
	    	System.out.print(tage[i]+ "  ");
	    	if (counter == 7)break;
	    	counter++;
	    }
	    	    
	    firstday = firstday - day;
	    switch(firstday)
	    {
	    	case (-1):
	    		firstday = 6;
	    		break;
	    	case (-2):
	    		firstday = 5;
	    		break;
	    	case (-3):
	    		firstday = 4;
	    		break;
	    	case (-4):
	    		firstday = 3;
	    		break;
	    	case (-5):
	    		firstday = 2;
	    		break;
	    	case (-6):
	    		firstday = 1;
	    		break;
	    }
	  
	    System.out.println();
	    for(int i = 0 ; i < firstday ; i++)
	    {
	    	System.out.print("    ");
	    }	    
	  
	    firstday++;
	    for(int i = 1;i <= maxMonat;i++)
	    {	    	
	    	if(i < 10)
	    	{
	    		if(i == momtMonat)
	    		{
	    			System.out.print(i+"*  ");
	    		}
	    		else
	    		{	    		
	    			System.out.print(i+"   ");
	    		}
	    	}
	    	
	    	if(i >= 10)
	    	{
	    		if(i == momtMonat)
	    		{
	    			System.out.print(i+"* ");
	    		}
	    		else
	    		{	    		
	    			System.out.print(i+"  ");
	    		}	    		    		
	    	}
	    	if((firstday % 7) == 0)System.out.println();
	    	firstday++;
	    }
	}
}
