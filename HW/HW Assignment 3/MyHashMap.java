public class MyHashMap {

  private int[] map;
  private static final int size = 100000;

  // O(N)
  public MyHashMap() {
    map = new int[size];
    for (int i = 0; i < size; i++) {
      map[i] = -1;
    }
  }

  // O(1)
  public void put(int key, int value) {
    map[key] = value;
  }

  // O(1)
  public int get(int key) {
    return map[key];
  }

  // O(1)
  public void remove(int key) {
    map[key] = -1;
  }

  public static void main(String[] args) {
    MyHashMap hashMap = new MyHashMap();
    hashMap.put(1, 1);
    hashMap.put(2, 2);
    hashMap.put(3, 3);
    System.out.println(hashMap.get(1));
    System.out.println(hashMap.get(3));
    hashMap.put(2, 1);
    System.out.println(hashMap.get(2));
    hashMap.remove(2);
    System.out.println(hashMap.get(2));
    System.out.println(hashMap.get(12));
  }
}
