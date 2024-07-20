class AllPathsSourceToTarget {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> paths = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        path.add(0);
        dfs(graph, 0, paths, path, graph.length);
        return paths;
    }

    private void dfs(int[][] graph, int node, List<List<Integer>> paths, List<Integer>path, int n) {
        if(node== n-1){
            paths.add(new ArrayList<>(path));
            return;
        }

        for(int x : graph[node]){
            path.add(x);
            dfs(graph, x, paths, path, n);
            path.remove(path.size()-1);
        }
    }
}
