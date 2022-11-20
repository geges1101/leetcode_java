public boolean validTree(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i=0; i<n; i++){
        list.add(new ArrayList<>());
        }
        
        for(int[] edge: edges){
        int a = edge[0];
        int b = edge[1];

        list.get(a).add(b);
        list.get(b).add(a);
        }

        HashSet<Integer> visited = new HashSet<>();
        LinkedList<Integer> q = new LinkedList<>();
        q.offer(0);

        while(!q.isEmpty()){
        int head = q.poll();

        if(visited.contains(head)){
        return false;
        }

        visited.add(head);

        ArrayList<Integer> vList = list.get(head);
        for(int v: vList){
        if(!visited.contains(v)){
        q.offer(v);
        }
        }
        }

        if(visited.size()<n){
        return false;
        }

        return true;
        }