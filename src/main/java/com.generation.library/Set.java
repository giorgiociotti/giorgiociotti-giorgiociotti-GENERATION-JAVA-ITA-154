package com.generation.library;

import java.util.HashSet;

/**
 * Un set. Un insieme NON ordinato di elementi dello stesso tipo. Duplicati non ammessi.
 * @author Ferdinando
 *
 * @param <K> il tipo degli elementi
 */
public class Set<K> extends HashSet<K>
{
	public Set(K...ks)
	{
		for(K k:ks)
			add(k);
	}

}
