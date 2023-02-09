package sigaa.usuario;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Usuario {
	private String login;
	private String senha;
	private String email;
	private String nome;
	
	public boolean logar(String senha) {
		return senha.equals(this.senha);
	}
	
	public String getLogin() {
		return this.login;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	private String getNome() {
		return this.nome;
	}
	
	public boolean setSenha(String novaSenha, String senha) {
		if(this.senha == senha) {
			this.senha = novaSenha;
			return true;
		}
		return false;
	}
}
