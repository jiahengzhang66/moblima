package moblima;


public class Movie3D extends Movies{
	
	
	private float movieTypePriceModifier = 3.0f;
	
	String typeOfMovie() {
		return "3D";
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
