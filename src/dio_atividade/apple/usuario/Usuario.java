package dio_atividade.apple.usuario;

import dio_atividade.apple.celular.IPhone;

public class Usuario {

	public static void main(String[] args) {
		
		IPhone iPhone = new IPhone();
		
		iPhone.acessarInternet();
		iPhone.fazerLigacao();
		iPhone.tocarMusicas();
	}
}
