package hu.me.krz.haladojava;

public class Tanulo {
	private final String nev;
	private int mone;
	private int instance;
	
	public Tanulo(String nev, int mone) {
		this.nev = nev;
		this.mone = mone;
		instance++;
	}
	
	public Tanulo(String nev) {
		this(nev, 10000);
	}
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		instance--;
	}

	public String getName() {
		return nev;
	}

	public int getMone() {
		return mone;
	}
	
	public int hanyTanulo() {
		return instance;
	}
	
	@Override
	public String toString() {
		if(mone > 20000)
			return "Tanuló: "+ nev +", "+ mone +" Ft BALLIN";
		 else
		return "Tanuló: "+ nev +" "+ mone +" Ft";
	}
	
	public boolean fogyasztas(int haracs) {
		this.mone = this.mone-haracs;
		return (this.mone <= 0);
	}

}
