import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T> {
  public NoNullArrayList() {
    super();
  }
  public NoNullArrayList(int startingCapacity) {
    super(startingCapacity);
  }
  public T set(int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException("Invalid element, can't initiate set command");
    }
    return super.set(index, element);
  }
  public boolean add(T element) {
    if (element == null) {
      throw new IllegalArgumentException("Invalid element, can't initiate add command");
    }
    super.add(element);
    return true;
  }
  public void add(int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException("Invalid element, can't initiate add command");
    }
    super.add(index, element);
  }
}
