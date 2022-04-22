package testJava;

import java.util.Calendar;
import java.util.Locale;

public class test {
	
	public static void main(String[] args) {
		
		 Calendar   thiscal = Calendar.getInstance(Locale.KOREA);
         
         int year     = thiscal.get(Calendar.YEAR); 
         int month = thiscal.get(Calendar.MONTH) +1 ;
         String mont = null;
         String searchDate = null;
         
         if(month < 10) {
             mont = "0"+month;
         }else {
             mont = ""+month;
         }
         
         
         System.out.println("year:"+year);
         System.out.println("mont:"+mont);
         
         String dateStr = "";
         
         
         for(int i=1,len=10;i<=len;i++) {
        	 
        	 thiscal.add ( thiscal.MONTH, -1 );
        	 
        	 dateStr = dateConvet(thiscal,"YM");
        	 
        	 System.out.println(dateStr);
         }
		
		
	}
	
	public static String dateConvet(Calendar cal, String deive) {
		
		String rStr = "";
		
		int year  = cal.get(Calendar.YEAR); 
        int month = cal.get(Calendar.MONTH) +1 ;
        int day = cal.get(Calendar.DAY_OF_MONTH) ;
        String mStr = null;
        String dStr = null;
        
        rStr += year;
        if(deive.indexOf("M")>-1) {
	        if(month < 10) {
	        	mStr = "0"+month;
	        }else {
	        	mStr = ""+month;
	        }
	        rStr += "-" + mStr;
        }
        
        if(deive.indexOf("D")>-1) {
        	if(day < 10) {
        		dStr = "0"+day;
        	}else {
        		dStr = ""+day;
        	}
        	rStr += "-" + day;
        }
		
		return rStr;
		
	}

}
