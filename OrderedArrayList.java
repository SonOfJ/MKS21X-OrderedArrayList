import java.util.ArrayList;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  public OrderedArrayList() {
    super();
  }
  public OrderedArrayList(int startingCapacity) {
    super(startingCapacity);
  }
  private int findIndex(T element) {
    int index = 0;
    for(int i = 0; i < this.size(); i = i + 1) {
      if (this.get(i).compareTo(element) > 0) {
        index = index + 1;
      }
    }
    return index;
  }
  public T set(int index, T element) {
    return super.set(findIndex(element), element);
  }
  public boolean add(T element) {
    super.add(findIndex(element), element);
    return true;
  }
  public void add(int index, T element) {
    super.add(findIndex(element), element);
  }
}
