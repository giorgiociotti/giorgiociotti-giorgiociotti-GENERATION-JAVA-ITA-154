package com.generation.library;

import java.util.ArrayList;

/**
 * Una lista. Un insieme di elementi dello stesso tipo, di dimensione variabile, ordinata, con duplicati ammessi
 * @author Ferdinando
 *
 * @param <K> il tipo degli elementi
 */
public class List<K> extends ArrayList<K>
{

	public List(K...ks)
	{
		for(K k:ks)
			add(k);
	}
}
