/**
 * A simplified map abstract data type for the Map learing activity, minus version.
 * <p>
 * You may sssume that the key argument Is-A Comparable and cast it. This will
 * generate a warning. You may suppress the warning using an annotation.
 * <p>
 * Use a binary search tree to implement this interface.
 *
 * @author Dan
 */
public interface SimpleMap<K, V> {

    /**
     * Associate the given value with the given key in the current map.
     * @param key The key with which the specified value is to be associated.
     * @param value The value to be associated with the specified key.
     * @throws IllegalArgumentException when the key or value is null.
     */
    public void put(K key, V value);

    /**
     * Returns the value to which the specified key is mapped,
     * or <tt>null</tt> if the specified key is not mapped. A null
     * parameter value shall return null.
     * @param key The key whose associated value is to be returned
     * @return The value to which the specified key is mapped,
     * or <tt>null</tt> if the specified key is not mapped.
     */
    public V get(Object key);

    /**
     * Returns true if the current map contains no key-value mappings.
     * @return true if the current map contains no key-value mappings.
     */
    public boolean isEmpty();

    /**
     * Removes all of the mappings from the current map.
     */
    public void clear();

    /**
     * Returns the number of key-value mappings in this map
     * @return The number of key-value mappings in this map
     */
    public int size();

}