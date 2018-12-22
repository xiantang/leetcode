package ArrayList;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class RevealCardsInIncreasingOrder {
    public int[] deckRevealedIncreasing(int[] deck) {
        int N = deck.length;
        Deque<Integer> index = new LinkedList<>();
        // 先创建index
        for (int i = 0; i <N; i++) {
            ((LinkedList<Integer>) index).add(i);
        }
        int[] ans = new int[N];
        // 排序deck
        // 从小到大
        Arrays.sort(deck);
        for (int card:deck
             ) {
            ans[index.pollFirst()] = card;
            if (!index.isEmpty()){
                ((LinkedList<Integer>) index).add(index.pollFirst());
            }
        }
        return ans;
    }
}
