class Solution {
    public void dfs(List<List<Integer>> rooms, HashSet<Integer> set, int count) {
        for(int neighbor: rooms.get(count)) {
            if(!set.contains(neighbor)) {
                set.add(neighbor);
                dfs(rooms, set, neighbor);
            }
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        HashSet<Integer> set = new HashSet<>();
        set.add(0);
        dfs(rooms, set, 0);
        return rooms.size() == set.size();
    }
}
