public class SimpleDotComTestDrive {

    public static void main (String[] args){
	Simpledotcom dot = new Simpledotcom();
	int[] locations = {2,3,4};
	dot.setlocationCells(locations);
	String userGuess = "2" ;
	String result = dot.checkYourself(userGuess);
    }
}
