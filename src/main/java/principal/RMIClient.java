
package principal;

import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

public class RMIClient {

    public static void main(String[] args) throws Exception {
        //Referência para rmiregistry em localhost na porta 1099
        Registry registro = LocateRegistry.getRegistry("localhost");
        //Localiza a referência do objeto remoto
        Object obj = registro.lookup("mensagens");
        RemoteHello hello = (RemoteHello) obj;
        System.out.println("Mensagem recebida: " + hello.getMensagem());
        hello.setMensagem("Fulano esteve aqui!");
    }
}
