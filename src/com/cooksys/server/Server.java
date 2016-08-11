package com.cooksys.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.InputStream;



public class Server
{

	public static void main(String[] args)
	{
		
			
			try (
					
					ServerSocket ss = new ServerSocket(12345); //This line will block
					Socket s = ss.accept(); //Now we have a connection to the client		
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
	
	

}
