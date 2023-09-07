package heranca;

public class ComputadorPedrinho {
    public static void main(String[] args) {

        System.out.println("MSN MESSENGER:");
        MsnMessenger msn = new MsnMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        System.out.println("FACEBOOK MESSENGER:");
        FacebookMessenger fbm = new FacebookMessenger();
        fbm.enviarMensagem();
        fbm.receberMensagem();

        System.out.println("TELEGRAM:");
        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
        tlg.receberMensagem();

    }
}
