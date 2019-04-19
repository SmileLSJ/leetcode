package JianZhi.L52_hard;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gxy on 2019/3/28.
 */
public class OtherSolution {

    public int totalNQueens(int n) {
        if (n <= 0) {
            return 0;
        }
        dfsHelper(n, 0, new ArrayList<Integer>());
        return result;
    }

    private void dfsHelper(int n, int x, List<Integer> state) {
        if (n == x) {
            result++;
            state.stream().forEach(o-> System.out.printf(" "+o));
            System.out.println("");
            return;
        }
        for (int i = 0; i < n; i++) {
            if (valid(x, i, state)) {
                state.add(i);
                dfsHelper(n, x + 1, state);
                state.remove(state.size() - 1);
            }
        }
    }

    private boolean valid(int x, int y, List<Integer> state) {
        for (int i = 0; i < state.size(); i++) {
            if (y == state.get(i)) {
                return false;
            }
            if (Math.abs(y - state.get(i)) == Math.abs(x - i)) {
                return false;
            }
        }
        return true;
    }

    private int result = 0;
}
