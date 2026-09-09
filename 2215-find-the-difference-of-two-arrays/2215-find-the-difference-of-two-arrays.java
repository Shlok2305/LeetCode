class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        for(int x: nums1){
            set1.add(x);
        }
        HashSet<Integer> set2 = new HashSet<>();
        for(int x: nums2){
            set2.add(x);
        }

        Set<Integer> only1 = new HashSet<>(set1);
        Set<Integer> only2 = new HashSet<>(set2);

        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        only1.removeAll(set2);
        only2.removeAll(set1);

        l1.addAll(only1);
        l2.addAll(only2);
        result.add(l1);
        result.add(l2);

        return result;
    }
}