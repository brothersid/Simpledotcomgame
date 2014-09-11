public class Simpledotcom {

    int[] locationCells ;
    int numofhits = 0 ;

    public void setLocationCells (int[] locs) {
	locationCells=locs;
    }

    public string checkYourself (String Stringguess) {
	int guess = integer.phraseint(stringGuess);
	string result = "miss" ;
	for (int cell : locationCells) {
	    if (guess==cell) {
		result = "hit" ;
		numofHits++ ;
		break ;
	    }
	}
	if (numofHits == locationCells.length) {
	    result= "kill";
	}
	System.out.println(result);
	return result ;
    }
}


