// Refer : Editorial
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

void solve()
{
  int n;
  cin >> n;
  int a[n];
  int b[n];
  forn(i, n)
          cin >>
      a[i];
  forn(i, n)
          cin >>
      b[i];

  bool flag = false;
  forn(i, n - 1)
  {
    if (b[i] != b[i + 1])
    {
      flag = true;
      break;
    }
  }
  if (!flag)
  {
    forn(i, n - 1)
    {
      if (a[i] > a[i + 1])
      {
        cout << "No\n";
        return;
      }
    }
    cout << "Yes\n";
  }
  else
    cout << "Yes\n";
}
int main()
{
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  int t;
  cin >> t;
  while (t--)
    solve();
}
