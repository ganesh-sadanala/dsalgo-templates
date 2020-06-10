// Awesome question hai leveraging pigeon hole principle

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

int n;
ll a[500];
void solve()
{
  ll ans = 0;
  forn(i, n)
      fore(j, i, n)
          fore(k, j, n)
              ans = max(ans, a[i] | a[j] | a[k]);

  cout << ans << endl;
}
int main()
{
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);
  cin >> n;
  forn(i, n)
          cin >>
      a[i];
  solve();
}
