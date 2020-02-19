package hu.me.krz.haladojava;

public class App 
{
    public static void main( String[] args )
    {
    	
		Astronomer galileo = new Astronomer("Galileo");
		Astronomer figaro = new Astronomer("Figaro");
		Astronomer magnifico = new Astronomer("Magnifico");
		galileo.observeTheSky();
		figaro.observeTheSky();
		magnifico.observeTheSky();
    }
}
