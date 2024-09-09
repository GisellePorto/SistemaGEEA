package modelo;

import java.util.List;

public class Estoque {
	private List<Espaco> espacos;
	private List<Equipamento> equipamentos;

	public List<Espaco> getEspacos() {
		return espacos;
	}

	public Espaco getEspaco(int id) {
		for (Espaco aux : espacos) {
			if (aux.getId() == id) {
				return aux;
			}
		} return null;
	}

	public List<Equipamento> getEquipamentos() {
		return equipamentos;
	}

	public Equipamento getEquipamento(int id) {
		for (Equipamento aux : equipamentos) {
			if (aux.getId() == id) {
				return aux;
			}
		} return null;
	}

	public void setEspacos(List<Espaco> espacos) {
		this.espacos = espacos;
	}

	public void setEquipamentos(List<Equipamento> equipamentos) {
		this.equipamentos = equipamentos;
	}

	public void adicionarEspaco(Espaco espaco){
		espacos.add(espaco);
	}

	public void adicionarEquipamento(Equipamento equip){
		equipamentos.add(equip);
	}

	public void removerEspaco(int id){
		for (Espaco aux : espacos){
			if(aux.getId() == id){
				espacos.remove(aux);
			}
		}
	}//remover espacos

	public void removerEquipamentos(int id){
		for (Equipamento aux : equipamentos){
			if(aux.getId() == id){
				equipamentos.remove(aux);
			}
		}
	}//remover equipamentos

}
