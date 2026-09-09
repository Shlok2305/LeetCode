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

        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        Iterator<Integer> it = set1.iterator();

        while(it.hasNext()){
            int x = it.next();
            if(set2.contains(x)){
                set2.remove(x);
                it.remove();
            }
        }
        l1.addAll(set1);
        l2.addAll(set2);
        result.add(l1);
        result.add(l2);

        return result;
    }
}