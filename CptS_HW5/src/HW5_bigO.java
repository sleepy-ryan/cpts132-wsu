public class HW5_bigO {

    /**
     * Get the total of the values in an integer list
     * @param nums The list of integers
     * @return The sum of the values
     */
    public int sum_getImple(java.util.List<Integer> nums) {
        int total = 0;
        for(int i = 0; i < nums.size(); i++) {
            total += nums.get(i);
        }
        return total;
    }


    /**
     * Get the total of the values in an integer list
     * @param nums The list of integers
     * @return The sum of the values
     */
    public int sum_iteratorImple(java.util.List<Integer> nums) {
        int total = 0;
        java.util.Iterator<Integer> it = nums.iterator();
        while(it.hasNext()) {
            total += it.next();
        }
        return total;
    }


    /**
     * Remove the even values from a list of integers.
     * The method modifies the parameter list.
     * @param nums The list of integers
     */
    public void removeEvens_getImple(java.util.List<Integer> nums) {
        for(int i = 0; i < nums.size(); i++) {
            if(nums.get(i) % 2 == 0) {
                nums.remove(i);
            }
        }
    }


    /**
     * Remove the even values from a list of integers.
     * The method modifies the parameter list.
     * @param nums The list of integers
     */
    public void removeEvens_iteratorImple(java.util.List<Integer> nums) {
        java.util.Iterator<Integer> it = nums.iterator();
        while(it.hasNext()) {
            int value = it.next();
            if(value % 2 == 0) {
                it.remove();
            }
        }
    }


    /**
     * Double the values in a list of integers.
     * This method modifies the parameter list.
     * @param nums The list of integers
     */
    public void double_getImple(java.util.List<Integer> nums) {
        for(int i = 0; i < nums.size(); i++) {
            int value = nums.get(i);
            nums.set(i, 2 * value);
        }
    }


    /**
     * Double the values in a list of integers.
     * This method modifies the parameter list.
     * @param nums The list of integers
     */
    public void double_iteratorImple(java.util.List<Integer> nums) {
        java.util.ListIterator<Integer> it = nums.listIterator();
        while(it.hasNext()) {
            int value = it.next();
            it.set(2 * value);
        }
    }


    /**
     * Check a list of integers for duplicates
     * @param nums The list of integers
     * @return True, if at least one pair of duplicate
     * values exists in the list
     */
    public boolean hasDupes_getImple(java.util.List<Integer> nums) {
        for(int i = 0; i < nums.size(); i++) {
            int value1 = nums.get(i);
            for(int j = i + 1; j < nums.size(); j++) {
                int value2 = nums.get(j);
                if(value1 == value2) {
                    return true;
                }
            }
        }
        return false;
    }


    /**
     * Check a list of integers for duplicates
     * @param nums The list of integers
     * @return True, if at least one pair of duplicate
     * values exists in the list
     */
    public boolean hasDupes_iteratorImple(java.util.List<Integer> nums) {
        java.util.Iterator<Integer> it1 = nums.iterator();
        int index1 = -1;
        while(it1.hasNext()) {
            index1++;
            int value1 = it1.next();
            java.util.ListIterator<Integer> it2;
            it2 = nums.listIterator(index1 + 1);
            while(it2.hasNext()) {
                int value2 = it2.next();
                if(value1 == value2) {
                    return true;
                }
            }
        }
        return false;
    }
}
