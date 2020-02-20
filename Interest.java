
public class Interest {
	String name;
	public int SimpleInterest(int p,int r,int t ) { 
		return p*(1+(r*t));
	}
	public int CompundInterset(int p,int r,int  n,int t) {
		return p*(1+r/n)^n*t;
	}

}
