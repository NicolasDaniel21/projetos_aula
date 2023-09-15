package contatos;

public class Contato {
	private String nome;
	private String fone;
	private String email;
	private TipoContato tipo;

	public Contato(String nome, String fone, String email, 
				TipoContato tipo) {
		this.nome = nome;
		this.fone = fone;
		this.email = email;
		this.tipo = tipo;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public TipoContato getTipo() {
		return tipo;
	}

	public void setTipo(TipoContato tipo) {
		this.tipo = tipo;
	}
}
