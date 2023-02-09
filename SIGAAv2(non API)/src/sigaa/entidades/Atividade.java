package sigaa.entidades;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public class Atividade {
	private LocalDate dataPostagem;
	private LocalDate dataEntrega;
	private String descricao;
	
	public void setDataEntrega(LocalDate novaData){
		this.dataEntrega = novaData;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
