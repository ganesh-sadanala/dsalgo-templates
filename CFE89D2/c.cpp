// Refer: https: //www.youtube.com/watch?v=GIffygJJzEQ

// Greedy Question : check constraints and think whether it is possible=> time and answer bhi

// Learned some hacks about matrices
/*
-> same sum in the cross diagonals
-> No of rows and cols => both even or both odd, you will have odd length palindromes
-> else even length as per the given movements
*/

#include <iostream>
#include <bits/stdc++.h>
using namespace std;

#define pb push_back
#define vi vector<int>
#define vpii vector<pair<int, int>>
#define N 2e5 + 5
#define f first
#define s second
#define all(x) x.begin(), x.end()
#define forn(i, n) for (int i = 0; i < n; i++)
#define fore(i, l, r) for (int i = l; i < r; i++)
#define sz(a) (int)((a).size())
#define ll long long
#define ar array
#define init(arr) memset(arr, 0, sizeof(arr))
#define endl "\n"
#define mp make_pair

int n, m;
int mat[31][31];

void solve()
{
  int ans = 0;
  int ones[n + m - 1], zeros[n + m - 1];
  init(ones);
  init(zeros);
  forn(i, n)
  {
    forn(j, m)
    {
      cin >> mat[i][j];
      if (!mat[i][j])
        zeros[i + j]++;
      else
        ones[i + j]++;
    }
  }
  int v = (n + m - 2) / 2;
  forn(i, v + 1)
  {
    if (v != i || ((m + n) % 2 != 0))
    {
      int a = ones[i] + ones[n + m - 2 - i];
      int b = zeros[i] + zeros[n + m - 2 - i];
      ans += min(a, b);
    }
  }
  cout << ans << endl;
}
int main()
{
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);
  int t;
  cin >> t;
  while (t--)
  {
    cin >> n >> m;
    solve();
  }
}
