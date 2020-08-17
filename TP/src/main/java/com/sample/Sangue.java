package com.sample;

public class Sangue {
	private long neutrofilos; //Contagem de neutrófilos < 1,5x10^9 / L
	private long plaquetas; //Contagem de plaquetas < 100x10^9 / L
	private double bilirrubina; // Concentração sérica de bilirrubina total > 1,5 x LSN (LSN = Limite	Superior Normal)
	private int creatina; //Creatinina > 120 mcmol / L
	private double FEV1; //Controlo biológico da função pulmonar FEV1 < 1,5 L
	
	public static final long nlim = 1500000000L;
	public static final long plim = 100000000000L;
	public static final double blim = 1.5;
	public static final int clim = 120;
	public static final double flim = 1.5;
	
	public Sangue(long neutrofilos, long plaquetas, double bilirrubina, int creatina, double fEV1) {
		super();
		this.neutrofilos = neutrofilos;
		this.plaquetas = plaquetas;
		this.bilirrubina = bilirrubina;
		this.creatina = creatina;
		FEV1 = fEV1;
	}

	public long getNeutrofilos() {
		return neutrofilos;
	}

	public void setNeutrofilos(long neutrofilos) {
		this.neutrofilos = neutrofilos;
	}

	public long getPlaquetas() {
		return plaquetas;
	}

	public void setPlaquetas(long plaquetas) {
		this.plaquetas = plaquetas;
	}

	public double getBilirrubina() {
		return bilirrubina;
	}

	public void setBilirrubina(double bilirrubina) {
		this.bilirrubina = bilirrubina;
	}

	public int getCreatina() {
		return creatina;
	}

	public void setCreatina(int creatina) {
		this.creatina = creatina;
	}

	public double getFEV1() {
		return FEV1;
	}

	public void setFEV1(double fEV1) {
		FEV1 = fEV1;
	}
	
	
	
}
