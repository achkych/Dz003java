import java.util.ArrayList;
import java.util.List;



public class Main2 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList();
        list1.add(5);
        list1.add(15);
        list1.add(0);
        list1.add(14);
        list1.add(-2);
        
        System.out.printf("Первоначальный список %s\n", list1);
        int i = 0;
        while (i < list1.size()) {
            if (list1.get(i) % 2 == 0) {
                list1.remove(i);
            }
            else {
                i++;
            }
        }
        System.out.printf("Список с удаленными четными числами %s", list1);
    }
}
