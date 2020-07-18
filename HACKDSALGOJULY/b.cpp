// Medium level pbm of BIT
// Refer Ashish gup answer
// Refer: https://discuss.codechef.com/t/how-to-solve-a-sorted-string-problem-from-hackerearth/71819/2
#include <iostream>
#include <bits/stdc++.h>
using namespace std;

#define pb push_back
#define forn(i, n) for (int i = 0; i < n; i++)
#define ll long long
#define init(arr) memset(arr, 0, sizeof(arr))
#define endl "\n"

const int off = 1e5 + 1;
const int N = 1e5 + 1;
int mod = 1e9 + 7;
ll bit[N + off + 1];
ll getSum(int inx)
{
  ll ans = 0;
  while (inx > 0)
  {
    ans += bit[inx];
    inx -= (inx & (-inx));
  }
  return ans;
}

void update(int inx, int val)
{
  while (inx < (N + off + 1))
  {
    bit[inx] += val;
    inx += (inx & (-inx));
  }
}

int solve()
{
  int n;
  cin >> n;
  string str;
  cin >> str;
  int cnt[n];
  init(cnt);
  forn(i, N + off + 1)
      bit[i] = 0;
  for (int i = 0; i < n; i++)
  {
    if (i != 0)
      cnt[i] = cnt[i - 1];
    if (str[i] == 'a')
      cnt[i] += 1;
    else if (str[i] == 'c')
      cnt[i] -= 1;
  }
  ll res = 0;
  update(off, 1);
  for (int i = 0; i < n; i++)
  {
    res += getSum(cnt[i] - 1 + off);
    res %= mod;
    update(cnt[i] + off, 1);
  }
  cout << res << endl;
}
int main()
{
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);
  solve();
}
