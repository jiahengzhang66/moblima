package moblima;


private float movieTypePriceModifier= 2.0f;//default price 


float movieTypePriceModifier (boolean blockBuster) {
	if (blockBuster==true) {
		return movieTypePriceModifier*2;
	}
	else {
		return movieTypePriceModifier;
	}
}



}
