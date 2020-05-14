//Name: Sean Mertens
//ZID: Z1630956
//MileageComparator.java
/*Class that assists in sorting Destination objects by 
 * their normal mileage.*/

import java.util.Comparator;

//////////////////////////////////////////////////////////////////////
//Class MileageComparator                                           //
//Compares the "normal miles" data member of two Destination objects//
//Was provided in the assignment documentation                      //
//////////////////////////////////////////////////////////////////////
class MileageComparator implements Comparator<Destination>
{
    public int compare(Destination d1, Destination d2)
    {  
      return(d2.getNormalMiles() - d1.getNormalMiles());
    }        
}