// Refer Harsha Swaraj Notes

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
#define int long long int
#define forn(i, n) for (int i = 0; i < n; i++)
#define fore(i, l, r) for (int i = l; i < r; i++)
#define sz(a) (int)((a).size())
#define ll long long
#define ar array
#define to_s(i) to_string(i)

int k;

void offset()
{
  int si = 0, sip = 0, dig = 1, lim = 1;
  while (1)
  {
    for (int i = lim; i < 10 * lim; i++)
    {
      sip = si;
      si += dig;
      if (si >= k)
      {
        int dign = k - sip;
        cout << to_s(i)[dign - 1] - '0' << "\n";
        return;
      }
    }
    lim *= 10;
    dig++;
  }
}

void block()
{
  int ri = 0, si = 0, sip = 0, dig = 1, lim = 1;
  while (1)
  {
    for (int i = lim; i < 10 * lim; i++)
    {
      ri += dig;
      sip = si;
      si = sip + ri;
      if (si >= k)
      {
        k -= sip;
        offset();
        return;
      }
    }
    lim *= 10;
    dig++;
  }
}

void solve()
{
  cin >> k;
  block();
}

int32_t main()
{
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  int t;
  cin >> t;
  while (t-- > 0)
    solve();
}
