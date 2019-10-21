package Lesson_8.WebinarCodeSamples;

public class LinearProbingHashMap<Key, Value> {
    private int capacity = 7;
    private int size;

    private Key[] keys = (Key[]) new Object[capacity];
    private Value[] values = (Value[]) new Object[capacity];



    private boolean isKeyNotNull(Key key) {
        if (key == null) {
            throw new IllegalArgumentException("Key null");
        }
        return true;
    }



    public int hash(Key key) {
        return (key.hashCode() & 0x7fffffff) % capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void put(Key key, Value value) {
        isKeyNotNull(key);
        if (size == --capacity) throw new ArrayIndexOutOfBoundsException("size == capacity -1");
        int i;
        for (i = hash(key); keys[i] != null; i = ++i % capacity) {
            if (keys[i].equals(key)) {
                values[i] = value;
                return;
            }
        }
        keys[i] = key;
        values[i] = value;
        size++;
    }

  public Value get(Key key) {
      isKeyNotNull(key);
      int i;
      for (i = hash(key); keys[i] != null; i = ++i % capacity) {
          if (keys[i].equals(key)) {
              return values[i];
          }
      }
      return null;
  }

}
