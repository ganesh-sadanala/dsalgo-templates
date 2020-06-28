// Refer: Editorial
// Simple use of conbinatorics
// Even assignment leads to exponential growth
#include <iostream>
#include <bits/stdc++.h>
using namespace std;

#define pb push_back
#define vi vector<int>
#define N 2e5 + 5
#define f first
#define s second
#define all(x) x.begin(), x.end()
#define forn(i, n) for (int i = 0; i < n; i++)
#define ll long long
#define init(arr) memset(arr, 0, sizeof(arr))
#define endl "\n"
#define mp make_pair

void solve()
{
  ll n;
  cin >> n;
  vi cnt(10, 1);
  ll prod = 1;
  int i = 0;
  ll val = 2;
  ll prev = 1;
  while (prod < n)
  {
    if (i == 10)
    {
      i = 0;
      prev = val;
      val++;
    }
    if (i < 10)
    {
      cnt[i]++;
      prod /= prev;
      prod *= cnt[i];
      i++;
    }
  }
  vector<char> ch{'c', 'o', 'd', 'e', 'f', 'o', 'r', 'c', 'e', 's'};
  forn(i, 10)
  {
    while (cnt[i]--)
      cout << ch[i];
  }
}
int main()
{
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);
  solve();
}
