package dio_atividade.apple.celular;

import dio_atividade.apple.funcoes.IPod;
import dio_atividade.apple.funcoes.Internet;
import dio_atividade.apple.funcoes.Phone;

public class IPhone implements IPod, Phone, Internet{

	@Override
	public void acessarInternet() {
		System.out.println("Acessando Internet");
	}

	@Override
	public void fazerLigacao() {
		System.out.println("Ligando para conhecido");
	}

	@Override
	public void tocarMusicas() {
		System.out.println("Tocando musicas da playlist");
	}
}
