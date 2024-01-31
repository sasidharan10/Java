import java.util.*;

public class dummy {

    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        // if (n == 1)
        // return new int[1]={0};
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && temperatures[i] >= temperatures[st.peek()]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans[i] = 0;
            } else {
                ans[i] = st.peek() - i;
            }
            st.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {73, 74, 75, 71, 69, 72, 76, 73};
        System.out.print("Result: ");
        String str = Arrays.toString(dailyTemperatures(nums));
        // Lsit<Integer> ans = new ArrayList<>(dailyTemperatures(nums)) ;
        System.out.print(str);
    }

}
