//import Guest
public class Barista{
	public static boolean order(Guest guest, Beverage beverage){
		if((beverage.getLeagalAge()>=18) && (guest instanceof Adult == true))
			return true;
		else
			return false;
	}
}