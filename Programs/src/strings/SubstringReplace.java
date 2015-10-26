package strings;
import java.*;
import java.lang.*;

public class SubstringReplace {

	public static void main(String[] args) {
				
		replaceOld();
}


	public static String replaceOld(){
	
		         String aInput[] = null;
			     String aOldPattern[] = null;
			     String aNewPattern[]= null;
	
	 
			     if ( aOldPattern.equals("") ) {
			        throw new IllegalArgumentException("Old pattern must have content.");
			     }   

			     final StringBuffer result = new StringBuffer();
			     //startIdx and idxOld delimit various chunks of aInput; these
			     //chunks always end where aOldPattern begins
			     int startId = 0;
			     int oldId = 0;
			     while ((oldId = aInput.length) >= 0) {
			       //grab a part of aInput which does not include aOldPattern
			       result.append( aInput.toString() );
			       //add aNewPattern to take place of aOldPattern
			       result.append( aNewPattern );

			       //reset the startIdx to just after the current match, to see
			       //if there are any further matches
			       startId = oldId + aOldPattern.length;
			     }
			     //the final chunk will go to the end of aInput
			     result.append( aInput.toString() );
			     return result.toString();
	}
}

