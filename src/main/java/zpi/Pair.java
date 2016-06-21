package zpi;

import java.util.HashMap;
import java.util.Map;

public class Pair<K, V> {

	public final K key;
	public final V vaule;
	
	public Pair(K key, V value) {
		super();
		this.key = key;
		this.vaule = value;
	}
	
	public static <K, V> Pair<K, V> pair(K key, V value) {
		return new Pair<K, V>(key, value);
	}
	
	public static <K, V> Map<K, V> mapOf(Pair<K, V>... pairs) {
		Map<K, V> map = new HashMap<>(pairs.length);
		for(Pair<K, V> pair : pairs) {
			map.put(pair.key, pair.vaule);
		}
		return map;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		result = prime * result + ((vaule == null) ? 0 : vaule.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pair<K, V> other = (Pair<K, V>) obj;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		if (vaule == null) {
			if (other.vaule != null)
				return false;
		} else if (!vaule.equals(other.vaule))
			return false;
		return true;
	}
	
}
