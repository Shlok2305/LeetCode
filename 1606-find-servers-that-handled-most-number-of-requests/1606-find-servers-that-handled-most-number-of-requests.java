class Solution {
    public List<Integer> busiestServers(int k, int[] arrival, int[] load) {
        TreeSet<Integer> set = new TreeSet<>();
        int[] count = new int[k];
        PriorityQueue<int[]> busy = new PriorityQueue<>(
            (a, b) -> Integer.compare(a[0], b[0])
        );

        for (int i = 0; i < k; i++) {
            set.add(i);
        }

        for (int i = 0; i < arrival.length; i++) {
            while (!busy.isEmpty() && busy.peek()[0] <= arrival[i]) {
                set.add(busy.poll()[1]);
            }

            if (set.isEmpty()) continue;

            int server = i % k;
            Integer next = set.ceiling(server);

            if (next == null) {
                next = set.first();
            }

            set.remove(next);
            count[next]++;

            busy.offer(new int[]{arrival[i] + load[i], next});
        }

        int max = 0;
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            if (count[i] > max) {
                max = count[i];
                ans.clear();
                ans.add(i);
            } else if (count[i] == max) {
                ans.add(i);
            }
        }

        return ans;
    }
}