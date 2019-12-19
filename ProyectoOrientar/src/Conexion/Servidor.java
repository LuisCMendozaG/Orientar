package Conexion;

import static java.awt.SystemColor.menu;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import static java.lang.Math.log;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.parser.ParseException;
import proyectoorientar.Menu;
import proyectoorientar.*;
/**
 *
 * @author luism
 */
  
public class Servidor extends Thread {
     //RECIBIR JSON
    Menu menu = new Menu();
    public static void main(String[] args) {
        boolean state = true;
        System.out.println("Esperando conexion...");
        while (state==true) {
            try {
                ServerSocket socket;
                Socket socket_cli;
                socket = new ServerSocket(8000);
                socket_cli = socket.accept();
                socket_cli.setSoLinger(true,10);
                System.out.println("Conexion Exitosa");
                ObjectInputStream in = new ObjectInputStream(socket_cli.getInputStream());
                FileOutputStream recibir = new FileOutputStream("archivoRecibido.json");
                byte[] json = new byte[4096];
                while (state ==true) {
                    int len = in.read(json);
                    if(len ==-1){
                        break;
                    }
                    recibir.write(json,0,len);
                    state = false;
                }
                in.close();
                recibir.close();
                socket_cli.close();         
                    // llamamos el metodo 
                    new Menu().trabajarPieza("archivoRecibido");
            } catch (IOException e) {
                System.out.println("Conexion fallida");
                System.out.println(e);
            }
        }
    }
    

}