public class Simpledotcom {

    int[] locationCells ;
    int numofhits = 0 ;

    public void setLocationCells (int[] locs) {
	locationCells=locs;
    }

    public String checkYourself (String Stringguess) {
	int guess = Integer.phraseint(Stringguess);
	String result = "miss" ;
	for (int cell : locationCells) {
	    if (guess==cell) {
		result = "hit" ;
		numofhits++ ;
		break ;
	    }
	}
	if (numofhits == locationCells.length) {
	    result= "kill";
	}
	System.out.println(result);
	return result ;
    }
}


