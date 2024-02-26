import java.util.*;

public class Demo5 {

    public static void main(String[] args) {
        int n = 2;
        List<String> logs = Arrays.asList("0:start:0", "1:start:3", "1:end:6", "0:end:10");
        

        int[] result = getTotalExecutionTime(n, logs);
        for (int i = 0; i < n; i++) {
            System.out.println(result[i]);
        }
    }

    static int[] getTotalExecutionTime(int n, List<String> logs) {
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        int prevTimestamp = 0;

        for (String log : logs) {
            String[] parts = log.split(":");
            int functionId = Integer.parseInt(parts[0]);
            String action = parts[1];
            int timestamp = Integer.parseInt(parts[2]);

            if (action.equals("start")) {
                if (!stack.isEmpty()) {
                    result[stack.peek()] += timestamp - prevTimestamp;
                }
                stack.push(functionId);
                prevTimestamp = timestamp;
            } else {
                result[stack.pop()] += timestamp - prevTimestamp + 1;
                prevTimestamp = timestamp + 1;
            }
        }

        return result;
    }
}
