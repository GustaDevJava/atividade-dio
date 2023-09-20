package dio_atividade.apple.celular;

import dio_atividade.apple.funcoes.IPod;
import dio_atividade.apple.funcoes.Internet;
import dio_atividade.apple.funcoes.Phone;

public class IPhone implements IPod, Phone, Internet{

	@Override
	public void exibirPagina() {
		System.out.println("Acessando Internet");
	}

	@Override
	public void adiconarNovaAba() {
		System.out.println("Abrindo Nova Pagina");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando Pagina");
	}
	
	@Override
	public void fazerLigacao() {
		System.out.println("Ligando para conhecido");
	}
	
	@Override
	public void atenderLigacao() {
		System.out.println("Atendendo ligação");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Ouvindo correio de voz");
		
	}

	@Override
	public void tocarMusicas() {
		System.out.println("Tocando musicas da playlist");
	}

	@Override
	public void pausarMusicas() {
		System.out.println("Pausar musica");
	}

	@Override
	public void selecionarMusicas() {
		System.out.println("Selecionando musica");
	}

}
