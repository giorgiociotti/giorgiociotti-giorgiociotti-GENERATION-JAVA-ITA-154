package com.generation.library;

import java.io.IOException;

/**
 * Tool per scrivere su un file. Un oggetto di tipo FileWriter permette di scrivere su un file
 * @author FP80
 *
 */
public class FileWriter 
{
	String filename;
	java.io.FileWriter adaptee;
	
	/**
	 * creo uno strumento per scrivere su file
	 * @param filename il file da aprire
	 */
	public FileWriter(String filename)
	{
		this.filename = filename;
		try
		{
			adaptee = new java.io.FileWriter(filename);
		} 
		catch (IOException e) 
		{
			throw new RuntimeException("Non riesco a creare il file "+filename+". Verificare il percorso. E sì, ho ragione io!:"+e.getMessage());
		}
		
	}

	/**
	 * Scrivo una riga sul file. Non è ancora scritta, bisogna usare "close" per scrivere.
	 */
	
	public void print(Object o) 
	{
		try 
		{
			adaptee.write(o.toString());
		} 
		catch (IOException e) 
		{
			throw new RuntimeException("Non riesco a scrivere sul file "+filename+". Verificare...");
		}
	}

	/**
	 * Termino il lavoro sul file.
	 */
	
	public void close() 
	{
		try 
		{
			adaptee.close();
		} 
		catch (IOException e) 
		{
			throw new RuntimeException("Problemi nel finalizzare il file appena creato: "+filename);
		}
	}
	
	
}
