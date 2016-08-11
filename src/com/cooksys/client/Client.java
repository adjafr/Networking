package com.cooksys.client;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;

public class Client
{

	public static void main(String[] args)
	{
		try (
				Socket s = new Socket("10.1.1.143", 12345); //We now have a connection to the server.
				OutputStream out = s.getOutputStream();
				Writer base = new OutputStreamWriter(out);
				Writer w = new BufferedWriter(base);
				) {
				
				w.write("Adam Fraser");;
				
				//w.close();
				w.flush();
				
			} catch (IOException e) {
				e.printStackTrace();

	}
	}
}
