import java.util.ArrayList;
import java.util.List;
public class NoNullArrayList<T> extends ArrayList<T> {
  public NoNullArrayList() {
  }
  public T set(int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException("Invalid element, can't initiate set command");
    }
    return super.set(index, element);
  }
}
