import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public void run() throws Exception {
        int port = 8081;
        ServerSocket socket = new ServerSocket(port);
        socket.setSoTimeout(10000);
        while (true) {
            System.out.println("Server is listing on the port:" + port);
            Socket acceptedconnection = socket.accept();
            System.out.println("Connection accpted from client" + acceptedconnection.getRemoteSocketAddress());
            PrintWriter toClient = new PrintWriter(acceptedconnection.getOutputStream());
            BufferedReader fromClient = new BufferedReader(new InputStreamReader(acceptedconnection.getInputStream()));
            toClient.println("Hello from the server");
            toClient.close();
            fromClient.close();
            acceptedconnection.close();
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        try {
            server.run();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
