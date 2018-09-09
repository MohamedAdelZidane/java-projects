import java.net.*; //import .net package to use network operations.
import java.io.*; //import I/O package for using in IO operations.
import java.util.Scanner; //to take input from the user.



public class Client {
    
    public static void main(String[] args) throws IOException {
     
        Socket s1 = new Socket("localhost",3000); // define a host server and port.
        DataOutputStream output = new DataOutputStream(s1.getOutputStream());//send output file handled
        //by the socket.
        DataInputStream input2 = new DataInputStream(s1.getInputStream());//read input file handled
        //by the socket.
        Scanner input = new Scanner (System.in);//create scanner to obtain input from user
        System.out.println("Please Enter Your Statement and recieve the length of it");
        String userInput = input.nextLine(); //store the input of the user in userInput variable
        output.writeUTF(userInput);//send the input from client side to sever side
        int x = input2.readInt();//return the length of the string from x
        System.out.println("The length is " + x);//display the length in the interface
        // When request is done, close the connection and exit
        input2.close();
        output.close();
        s1.close();        
    }
    
}
