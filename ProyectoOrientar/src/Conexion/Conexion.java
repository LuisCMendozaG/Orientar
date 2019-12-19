package Conexion;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.StringWriter;
import java.net.Socket;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author luism
 */
public class Conexion {
//MANDAR JSON

    boolean state = true;

    StringWriter stringWriter = new StringWriter();
    JSONObject jsonUsers = new JSONObject();
    JSONParser user_parser = new JSONParser();
    Socket socket;
    String ip ="localhost";
    int puerto = 8000;

    public void Conexion(String ip,int puerto) {
        try {
            socket = new Socket(ip, puerto);
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            FileInputStream in = new FileInputStream("Pieza.json");
            System.out.println("Conexion exitosa");
            byte[] json = new byte[4096];
            while (true) {
                int len = in.read(json);
                if(len ==-1){
                    break;
                }
                out.write(json,0,len);
            }
            out.close();
            in.close();
            socket.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
    
    public void enviar(String ip, int puerto) throws IOException{
        Socket sc = new Socket(ip, puerto);

        ObjectOutputStream salida = new ObjectOutputStream(sc.getOutputStream());
        FileInputStream enviarArchivo = new FileInputStream("Pieza.json");

        byte[] buf = new byte[4096];
        while (true) {
            int len = enviarArchivo.read(buf);
            if (len == -1) {
                break;
            }

            salida.write(buf, 0, len);
        }
        salida.close();
        enviarArchivo.close();
        sc.close();
    }

}
