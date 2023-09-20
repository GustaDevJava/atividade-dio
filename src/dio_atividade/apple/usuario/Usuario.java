package dio_atividade.apple.usuario;

import dio_atividade.apple.celular.IPhone;

public class Usuario {

	public static void main(String[] args) {

		IPhone iPhone = new IPhone();

		iPhone.exibirPagina();
		iPhone.adiconarNovaAba();
		iPhone.atualizarPagina();
		
		System.out.println("------------------------");
		
		iPhone.fazerLigacao();
		iPhone.atenderLigacao();
		iPhone.iniciarCorreioVoz();
		
		System.out.println("------------------------");
				
		iPhone.tocarMusicas();
		iPhone.pausarMusicas();
		iPhone.selecionarMusicas();
	}
}
