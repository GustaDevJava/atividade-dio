package dio_atividade.apple.funcoes;

import dio_atividade.apple.IPod;
import dio_atividade.apple.Internet;
import dio_atividade.apple.Phone;

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
