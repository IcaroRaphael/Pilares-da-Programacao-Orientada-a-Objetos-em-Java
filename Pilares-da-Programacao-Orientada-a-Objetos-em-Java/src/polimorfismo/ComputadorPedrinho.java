package polimorfismo;

import polimorfismo.apps.FacebookMessenger;
import polimorfismo.apps.MsnMessenger;
import polimorfismo.apps.ServicoMensagemInstantanea;
import polimorfismo.apps.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {

        ServicoMensagemInstantanea smi = null;

		/*
		    NÃO SE SABE QUAL APP
		    MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
        String appEscolhido="tlg";

        if(appEscolhido.equals("msn"))
            smi = new MsnMessenger();
        else if(appEscolhido.equals("fbm"))
            smi = new FacebookMessenger();
        else if(appEscolhido.equals("tlg"))
            smi = new Telegram();


        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
