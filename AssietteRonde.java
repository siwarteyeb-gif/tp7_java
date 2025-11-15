package tp8;

public class AssietteRonde extends Assiette {
	private double rayon;
	public AssietteRonde(int annee,double rayon) {
		super(annee);
		this.rayon=rayon;
	}
	public double calculSurface() {
		return 3.14*rayon*rayon;
	}
	public double calculTotal() {
		return super.calculTotal();}

}
