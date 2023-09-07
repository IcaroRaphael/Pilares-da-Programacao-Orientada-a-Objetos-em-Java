package encapsulamento;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        //abrindo MSN Messenger
        MsnMessenger msn = new MsnMessenger();

        msn.enviarMensagem();

        msn.receberMensagem();
    }
}
