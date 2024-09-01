package model;

import java.util.ArrayList;

public class Estoque {
	private ArrayList<Espaco> espacos;
	private ArrayList<Equipamento> equipamentos;


	public ArrayList<Espaco> getEspacos() {
		return espacos;
	}
	public ArrayList<Equipamento> getEquipamentos() {
		return equipamentos;
	}

	public void setEspacos(ArrayList<Espaco> espacos) {
		this.espacos = espacos;
	}

	public void setEquipamentos(ArrayList<Equipamento> equipamentos) {
		this.equipamentos = equipamentos;
	}
}
