package day4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.InputStream;


public class Main
{

	public static void main(String[] args)
	{
		
		
		
		
		

	}
	
	void serverSide() {
		
		
		try (
				
				ServerSocket ss = new ServerSocket(8080);
				//This line will block
				Socket s = ss.accept();
				//Now we have a connection to the client
				InputStream in = s.getInputStream();
				Reader base = new InputStreamReader(in);
				BufferedReader r = new BufferedReader(base);
			) {
			String line = r.readLine();
			
			System.out.println(line);
			
	
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
		
	
	void clientSide() {

		
		try (
			Socket s = new Socket("localhost", 12345);
			//We now have a connection to the server.
			OutputStream out = s.getOutputStream();
			Writer base = new OutputStreamWriter(out);
			Writer w = new BufferedWriter(base);
			) {
			
			w.write("This is a string!");;
			
			//w.close();
			w.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
//		} finally {
//			if (s != null) {
//				try {
//					s.close();
//				} catch (IOException e) {
//					e.printStackTrace();
//			}
//		}
//	}

	}
}
}
