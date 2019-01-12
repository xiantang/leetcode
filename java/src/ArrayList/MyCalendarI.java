package ArrayList;



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyCalendarI {
    List<int[]> calendar;
    public MyCalendarI() {
        calendar = new ArrayList<>();

    }

    public boolean book(int start, int end) {
        for (int [] iv: calendar
        ) {
            if (start<iv[1] &&end>iv[0]){
                return false;
            }

        }
        int[] tmp = {start, end};
        calendar.add(tmp);
        return true;
    }
}
