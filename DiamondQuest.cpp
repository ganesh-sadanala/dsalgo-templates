class Solution {
public:
        public:
    int maxJumps(vector<int>& arr, int d)     {
		// Maximum number of reachable nodes from node [i]
        vector<int> maxJumps(arr.size(), -1);

        for(int i = 0; i < arr.size(); ++i)
        {
            Jump(i, d, arr, maxJumps);
        }

        int maxJump = 1;

        for(int i = 0; i < arr.size(); ++i)
        {
            maxJump = max(maxJump, maxJumps[i]);
        }

        return maxJump;
    }


    void Jump(int start, int d, vector<int>& arr, vector<int>& maxJumps)
    {
        if(maxJumps[start] == -1)
        {
			// Number of reachable indices. Initialize to 1 because the node can reach itself.
            int reachIndices = 1;

			// Get max number of reachable nodes to the right
            for(int i = start + 1; i < arr.size() && start + d >= i && arr[start] > arr[i]; ++i)
            {
                Jump(i, d, arr, maxJumps);
                reachIndices = max(reachIndices, 1 + maxJumps[i]);
            }

			// Get max number of reachable nodes to the left
            for(int i = start - 1; i >=0 && start - d <= i && arr[start] > arr[i]; --i)
            {
                Jump(i, d, arr, maxJumps);
                reachIndices = max(reachIndices, 1 + maxJumps[i]);
            }

			// Update memoization table
            maxJumps[start] = reachIndices;
        }
    }

};
