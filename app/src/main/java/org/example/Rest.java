package org.example;

public class Rest {
    private double length; // Duration of the rest
    private String name = "R";

	public String getSyllable(){
		return "";
	}
	
    public Rest(double length){
        this.length = length;
    }

    public double getLength(){
        return this.length;
    }

    public String getName(){
        return this.name;
    }

    public String getLengthName(){
        double l = this.length;

        if(l == 1){
            return "w";
        }
        else if(l == 0.75){
            return "h."; // dotted-half note
        }
        else if(l == 0.5){
            return "h";
        }
        else if(l == 0.375){
            return "q.";
        }
        else if(l == 0.25){
            return "q";
        }
        else if(l == 0.1875){
            return "e.";
        }
        else if(l == 0.125){
            return "e";
        }
        else if(l == 0.0625){
            return "s";
        }
        else{
            return null;
        }   
    }
	
	public static Rest wholeRest(){
		return new Rest(1);
	}
	
	public static Rest dotHalfRest(){
		return new Rest(0.75);
	}
	
	public static Rest halfRest(){
		return new Rest(0.5);
	}
	
	public static Rest dotQuarterRest(){
		return new Rest(0.375);
	}
	
	public static Rest quarterRest(){
		return new Rest(0.25);
	}
	
	public static Rest dotEightRest(){
		return new Rest(0.1875);
	}
	
	public static Rest eighthRest(){
		return new Rest(0.125);
	}
	
	public static Rest sixteenthRest(){
		return new Rest(0.0625);
	}
	
}
