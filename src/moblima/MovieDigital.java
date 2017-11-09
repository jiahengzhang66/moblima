package moblima;


public class MovieDigital extends Movies{

	
	
	private float movieTypePriceModifier= 2.0f;//default price
	
	String typeOfMovie() {
		return "digital";
	}
	
	
	float movieTypePriceModifier (boolean blockBuster) {
		if (blockBuster==true) {
			return movieTypePriceModifier*2;
		}
		else {
			return movieTypePriceModifier;
		}
	}

	
	
}
