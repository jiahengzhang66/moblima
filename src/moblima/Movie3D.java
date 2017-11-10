package moblima;

public class Movie3DMovie extends Movies{
	
	
	private float movieTypePriceModifier = 3.0f;//default price 

	float movieTypePriceModifier (boolean blockBuster) {
		if (blockBuster==true) {
			return movieTypePriceModifier*2;
		}
		else {
			return movieTypePriceModifier;
		}
	}

}

