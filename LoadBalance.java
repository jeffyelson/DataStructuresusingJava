public class LoadBalance {
    public static RandomQueue<Queue<Integer>> simulate(int m, int n, int s) {
        // TODO: Simulate the process of assigning n items to a set of m servers
        // to add an item to a server, first sample s random servers and
        // then put the item onto the server with the shortest queue.
        RandomQueue<Queue<Integer>> load = new RandomQueue<Queue<Integer>>();
        for (int i = 0; i < m; i++) {
            load.enqueue(new RandomQueue<Integer>());
        }
        for (int j = 0; j < n; j++) {
            Queue<Integer> lowest = load.sample();
            for (int k = 1; k < s; k++) {
                Queue<Integer> queue = load.sample();
                if (queue.size() < lowest.size())
                    lowest = queue;
            }
            lowest.enqueue(j);
        }
        return load;

    }
    
    public static void main(String[] args) {
        int m = 50;
        int n = 500;
        int s = 1;
        
        
        double[] lengths = new double[m];
        RandomQueue<Queue<Integer>> servers = simulate(m, n, s);
        
        // TODO: extracts the actual queue sizes from *servers* into *lengths*
        Queue<Integer> queue = servers.sample();
        
        
        // Prepare Plotting and show a histogram (barplot) 
        // of the servers' working loads
        for(int i=0;i< servers.size();i++){
            lengths[i]= queue.size();
            StdDraw.setYscale(0, 2.0 * n/m);
            StdStats.plotBars(lengths);
        }

    }
}