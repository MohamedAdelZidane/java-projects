import java.net.*;  //import .net package to use network operations

import java.io.*;  //import I/O package for using in IO operations


public class MultiThreadServer implements Runnable 
{
    Socket cSocket; //to handle request on a specific socket
    MultiThreadServer (Socket cSocket)
    {
        this.cSocket = cSocket;  //refer to the parameter of the constructor
    } 
    
    @Override
    
    
    public void run() {
        try {
            //create a DataOutputStream object for sending socket streams.
            DataOutputStream output = new DataOutputStream(cSocket.getOutputStream());
            //create a DataInputStream object for reading incoming socket streams.
            DataInputStream input2 = new DataInputStream(cSocket .getInputStream());
            String userInput = input2.readUTF();//read the String from the client
            int x = userInput.length();//store and determine the length of the string in variable called x 
            output.writeInt(x);//send the length of the string to the client
            // When request is done, close the connection and exit
            input2.close();
            output.close();
            cSocket.close();             
            
        }
 
        catch (Exception e)
        {
            System.out.println(e); 
        }
    }
    
    public static void main (String[] args) throws IOException
    {
       ServerSocket sSocket = new ServerSocket (3000);// socket that runs on port 3000
       System.out.println("Server is now CONNECTED");
       while (true)
       {
           Socket S = sSocket.accept();//Wait and accept a connection
    // Get a communication stream associated with the socket
           Thread Client  =  new Thread(new MultiThreadServer(S));
           Client.start();
               
       }
    } 
    
    }
    
