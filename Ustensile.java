package tp8;

abstract class Ustensile {
	protected int annee;
	public Ustensile(int annee) {
		this.annee=annee;
	}
	public double calculTotal() {
		double tot;
		if(2025-annee<50) {
			tot=0;
		}
		else {
			tot=2025-annee-50;
		}
	
	return tot;}
}
