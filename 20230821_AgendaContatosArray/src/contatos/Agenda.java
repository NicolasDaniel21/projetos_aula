package contatos;

/*
 * API da Agenda
 * - adicionar um contato [ok]
 * - adicionar um contato em uma dada posição [ok]
 * - recuperar um contato em uma dada posição [ok]
 * - recuperar uma posição a partir do contato [ok] 
 * - remover um contato pela posicao [ok]
 * - remover um contato pelo objeto 
 * - retornar o tamanho da agenda [ok]
 * - retornar o número de contatos [ok]
 */
public class Agenda {
	private static final int POSICAO_INVALIDA = -1;
	private static final int MAXIMO_ELEMENTOS = 10;
	private Contato[] agenda;
	private int numeroElementos;
	
	public Agenda() {
		this(MAXIMO_ELEMENTOS);
	}
	
	public Agenda(int tamanho) {
		agenda = new Contato[tamanho];
		numeroElementos = 0;
	}
	
	public boolean adicionaContato(Contato contato) {
		if (numeroElementos == agenda.length) 
			return false;

		agenda[numeroElementos++] = contato;
		return true;
	}
	
	public boolean adicionaContato(Contato contato, int posicao) {
		if (!posicaoEhValida(posicao))	return false;
		
		if (agenda[posicao] == null)
			numeroElementos++;
		
		agenda[posicao] = contato;
		
		return true;
	}
	
	public Contato consultaContato(int posicao) {
		if (!posicaoEhValida(posicao))	return null;

		return agenda[posicao];
	}
	
	public int consultaPosicao(Contato contato) {
		for (int indx = 0; indx < agenda.length; indx++) {
			Contato c = agenda[indx];
			if (c != null && c.equals(contato))
				return indx;
		}
		
		return POSICAO_INVALIDA;
	}

	private boolean posicaoEhValida(int posicao) {
		return posicao >= 0 && posicao < MAXIMO_ELEMENTOS;
	}
	
	public int getNumeroContatos() {
		return numeroElementos;
	}
	
	public boolean removeContato(int posicao) {
		if (!posicaoEhValida(posicao))	return false; 

		agenda[posicao] = null;
		numeroElementos--;
		return true;
	}
	
	public Contato[] getAgenda() {
		return agenda;
	}
	
	public int getTamanhoAgenda() {
		return agenda.length;
	}
}
