package modelo;

import java.util.List;

public class Estoque {
	private static List<Espaco> espacos;
	private static List<Equipamento> equipamentos;

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
		Estoque.espacos = espacos;
	}

	public void setEquipamentos(List<Equipamento> equipamentos) {
		Estoque.equipamentos = equipamentos;
	}

	public void adicionarEspaco(Espaco espaco){
		espacos.add(espaco);
	}

	public void adicionarEquipamento(Equipamento equip){
		equipamentos.add(equip);
	}

	public void removerEspaco(int id){
        espacos.removeIf(aux -> aux.getId() == id);
	}//remover espacos

	public void removerEquipamentos(int id){
        equipamentos.removeIf(aux -> aux.getId() == id);
	}//remover equipamentos

}
