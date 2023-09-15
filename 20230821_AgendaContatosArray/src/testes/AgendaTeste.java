package testes;

import contatos.Agenda;
import contatos.Contato;
import contatos.TipoContato;

public class AgendaTeste {

	public static void main(String[] args) {
		Contato c1 = new Contato("Joao", "334343434", "joao@unisinos.br", TipoContato.PESSOAL);
		Contato c2 = new Contato("Maria", "803458344", "maria@unisinos.br", TipoContato.PROFISSIONAL);
		Contato c3 = new Contato("Pedro", "394903430", "pedro@unisinos.br", TipoContato.PESSOAL);
		Contato c4 = new Contato("Julia", "34534534", "julia@unisinos.br", TipoContato.PROFISSIONAL);
		Contato c5 = new Contato("Thais", "4394934034", "thais@unisinos.br", TipoContato.PESSOAL);
		
		Agenda agendaTelefonica = new Agenda();
		System.out.println("-- adicionando contatos na agenda...");
		System.out.println(agendaTelefonica.adicionaContato(c1));
		System.out.println(agendaTelefonica.adicionaContato(c2));
		System.out.println(agendaTelefonica.adicionaContato(c3));
		System.out.println(agendaTelefonica.adicionaContato(c4));
		System.out.println("-- buscando um contato pela posicao");
		Contato contatoConsultado = agendaTelefonica.consultaContato(0);
		mostra(contatoConsultado);
		
		System.out.println("adicionando contato com outro metodo " + 
		agendaTelefonica.adicionaContato(c5, 6));

		Contato contatoConsultado2 = agendaTelefonica.consultaContato(40);
		if (contatoConsultado2 != null)
			mostra(contatoConsultado2);
		
		agendaTelefonica.adicionaContato(c1);
		
		System.out.println("Linha adicionada para primeiro commit");

		System.out.println("posicao do objeto c1: " + agendaTelefonica.consultaPosicao(contatoConsultado2));
		
		Contato[] lista = agendaTelefonica.getAgenda();
		mostraAgenda(lista);
		
		System.out.println("Conseguiu remover contato? " + agendaTelefonica.removeContato(0));
		System.out.println("Conseguiu remover contato? " + agendaTelefonica.removeContato(50));

		System.out.println("\n\nnumero de contatos na agenda: " + agendaTelefonica.getNumeroContatos());
	}

	private static void mostraAgenda(Contato[] agenda) {
		for (int indx = 0; indx < agenda.length; indx++) {
			Contato c = agenda[indx];
			if ( c != null) {
				mostra(c);
			}
		}
	}

	private static void mostra(Contato c) {
		System.out.println("\r\nNome:" + c.getNome());
		System.out.println("Fone:" + c.getFone());
		System.out.println("email:" + c.getEmail());
		System.out.println("Tipo de Contato:" + c.getTipo().toString());
	}
}
