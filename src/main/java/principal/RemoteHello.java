/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteHello extends Remote {

    public String getMensagem() throws RemoteException;

    public void setMensagem(String mensagem) throws RemoteException;
}
