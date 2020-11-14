public class SingleNumberSolution {
	
	public int singleNumber(int[] nums) {
		List<Integer> listUniqueInts = new ArrayList<>();
		
		for (int i : nums) {
			if (listUniqueInts.contains(i)) {
				listUniqueInts.remove(new Integer(i));
			} else {
				listUniqueInts.add(newInteger(i));
			}
		}
		return listUniqueInts.get(0);
	}
}