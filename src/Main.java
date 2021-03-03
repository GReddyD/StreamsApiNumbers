import java.util.*;

import static java.util.Comparator.naturalOrder;

public class Main {
  public static void main(String[] args) {
    List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
    //Сортируем значения
    Set<Integer> sortedSet = new TreeSet<>(intList);
    Iterator<Integer> itr = sortedSet.iterator();
    while (itr.hasNext()) {
      Integer itrValue = itr.next();
      // удаляем все не положительные и нечетные числа
      if (itrValue <= 0 || itrValue % 2 != 0) {
        itr.remove();
      } else {
        System.out.println(itrValue);
      }
    }
  }
}
