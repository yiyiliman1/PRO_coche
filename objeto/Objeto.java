package main1;

public class Main1 {

	
	public String matricula;
	public int plaza;
	public int rueda;
	public String modelo;
	public String marca;
	public double deposito;

	public Main1(String matricula, int plaza, int rueda, String modelo, String marca, double deposito) {		
		this.matricula = matricula;
		this.plaza = plaza;
		this.rueda = rueda;
		this.modelo = modelo;
		this.marca = marca;
		this.deposito = deposito;
	}
	
	public void pitar() {
		System.out.println("Pitar");
	}
	public void repostar(double cantidad) {
		if (cantidad > 0) {
			deposito += cantidad;
			
		} 		
	}
	//0.05 1/km
	public void moverse(double km) {
		double consumido = km * 0.05;
		
		if (consumido <= deposito) {
			System.out.println("deplazarse");
			deposito -= consumido;
		} 
	}
}
