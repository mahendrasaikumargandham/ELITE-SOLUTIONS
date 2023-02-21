class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i=0;i<k;i++) {
            queue.offer(nums[i]);
        }

        for(int i=k;i<nums.length;i++) {
            if(queue.peek() < nums[i]) {
                queue.poll();
                queue.offer(nums[i]);
            }
        }
        System.out.println(queue);
        return queue.peek();
    }
}
