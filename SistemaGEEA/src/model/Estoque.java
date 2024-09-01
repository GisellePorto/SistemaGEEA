package model;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
	private List<Espaco> espacos;
	private List<Equipamento> equipamentos;


	public List<Espaco> getEspacos() {
		return espacos;
	}
	public List<Equipamento> getEquipamentos() {
		return equipamentos;
	}

	public void setEspacos(List<Espaco> espacos) {
		this.espacos = espacos;
	}

	public void setEquipamentos(List<Equipamento> equipamentos) {
		this.equipamentos = equipamentos;
	}
}
