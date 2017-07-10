import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public static int[] twoSum(int[] nums, int target) {
	Map<Integer, List<Integer>> numToIndex = new HashMap<>();
	for (int i = 0; i < nums.length; i++) {
		List<Integer> valueList = numToIndex.getOrDefault(nums[i], new LinkedList<>());
		valueList.add(i);
		numToIndex.put(nums[i], valueList);
	}
	
	int[] result = new int[2];
	for (Entry<Integer, List<Integer>> element : numToIndex.entrySet()) {
		if (numToIndex.containsKey(target - element.getKey())) {
			List<Integer> secondElementIndex = numToIndex.get(target - element.getKey());

			if (secondElementIndex != element.getValue()) {
				return new int[] { element.getValue().get(0), secondElementIndex.get(0) };
			} else {
				return new int[] { element.getValue().get(0), secondElementIndex.get(1) };
			}
		}
	}
	return result;

}