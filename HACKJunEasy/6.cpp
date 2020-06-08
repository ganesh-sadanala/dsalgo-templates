// Refer : https://www.youtube.com/watch?v=UEwrQaGBpaU&t=3s
// Learned to utilize particular ds to optimize any code
// string problem solve kare samai ko alphabet yaad rake

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
string s;
vector<int> v[26];
ll sum[26][26];
ll dp[200005];
ll solve(int idx)
{
  if (dp[idx] != -1)
    return dp[idx];

  ll ans = 0;
  for (int i = 0; i < 26; i++)
  {

    auto itr = upper_bound(v[i].begin(), v[i].end(), idx);
    if (itr == v[i].end())
      continue;

    ans = max(ans, solve(*itr) + sum[s[idx] - 'a'][i]);
  }

  return dp[idx] = ans;
}
int main()
{
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  cin >> n >> s >> m;
  forn(i, m)
  {
    char a, b;
    cin >> a >> b;
    ll k;
    cin >> k;
    sum[a - 'a'][b - 'a'] += k;
  }
  forn(i, n)
      v[s[i] - 'a']
          .pb(i);

  ll ans = 0;
  memset(dp, -1, sizeof(dp));
  forn(i, n)
      ans = max(ans, solve(i));
  cout << ans << endl;
}
