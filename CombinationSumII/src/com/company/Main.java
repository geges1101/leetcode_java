class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);

        findCombinations(candidates, 0, target, new ArrayList<Integer>(), result);

        return result;
    }

    public void findCombinations(int[] candidates, int idx, int target, List<Integer> curr, List<List<Integer>> result){
        if(target == 0){
            result.add(new ArrayList<>(curr));
            return;
        }

        if(target < 0) return;

        for(int i = idx; i < candidates.length; i++){
            if(i == idx || candidates[i] != candidates[i - 1]){
                curr.add(candidates[i]);
                findCombinations(candidates, i + 1, target - candidates[i], curr, result);
                curr.remove(curr.size() - 1);
            }
        }
    }
}