class Solution {
    private static final int[] DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int aStart = toDay(arriveAlice), aEnd = toDay(leaveAlice);
        int bStart = toDay(arriveBob), bEnd = toDay(leaveBob);

        int start = Math.max(aStart, bStart);
        int end = Math.min(aEnd, bEnd);

        return Math.max(0, end - start + 1);
    }

    private int toDay(String date) {
        int m = (date.charAt(0) - '0') * 10 + (date.charAt(1) - '0');
        int d = (date.charAt(3) - '0') * 10 + (date.charAt(4) - '0');
        int total = d;
        for (int i = 0; i < m - 1; i++) {
            total += DAYS[i];
        }
        return total;
    }
}