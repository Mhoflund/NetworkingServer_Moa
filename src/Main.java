/* SERVER - may be enchanced to work for multiple clients*/
import java.net.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {

        ServerSocket sever = null;
        Socket client;

        // Deafult port number we are going to use
        int portnumber = 1234;
        if(args.length >= 1){
            portnumber = Integer.parseInt(args[0]);
        }

        // Create Server side socket
        try {
            server = new ServerSocket(portnumber);
        } catch (IOException ie){
            System.out.println("Cannot open socket. " + ie);
            System.exit(1);
        }
        System.out.println("Serversocket is created " + server);
    }

    // Wait for the data from the client and reply
    while(true) {
        try {
            // Listens for a connection to be made to
            // This socket and accepts it. The method blocks until
            // a connection is made
            System.out.println("Waiting fir connect request...");
            client = server.accept();

            System.out.println("Connect request accepted...");
            String clientHost =
                    client.getInetAdress
        }
    }
}