import java.util.ArrayList;

public class pairSum2 {
    public static boolean pairSum2(ArrayList<Integer> list, int target) {
        int n = list.size();
        int bp = findBreakingPoint(list, 0, n - 1);

        // Initialize left and right pointers
        int lp = (bp + 1) % n; // smallest
        int rp = bp; // largest

        while (lp != rp) {
            // Case 1: Pair found
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }

            // Case 2: Move pointers to increase the sum
            if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n;
            } else {
                // Case 3: Move pointers to decrease the sum
                rp = (n + rp - 1) % n;
            }
        }

        return false;
    }

    // Helper function to find the breaking point
    private static int findBreakingPoint(ArrayList<Integer> list, int low, int high) {
        if (high <= low) {
            return -1;
        }

        int mid = (low + high) / 2;

        if (mid < high && list.get(mid) > list.get(mid + 1)) {
            return mid;
        }

        if (mid > low && list.get(mid) < list.get(mid - 1)) {
            return mid - 1;
        }

        if (list.get(low) >= list.get(mid)) {
            return findBreakingPoint(list, low, mid - 1);
        } else {
            return findBreakingPoint(list, mid + 1, high);
        }
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        // 11, 15, 6, 8, 9, 10 sorted & rotated array
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 0;
        System.out.println(pairSum2(list, target));
    }
}
