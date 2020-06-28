// Refer: https://www.youtube.com/watch?v=FlE1W00FocE&t=596s
// Awesome idea (a+b)^2>=(a^2+b^2)
// And and Or is actually preserves the number of set bits
// Only shifts a bit from one number to another
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
  int n;
  cin >> n;
  ll a[n];
  forn(i, n)
          cin >>
      a[i];
  if (n == 1)
  {
    cout << a[0] * a[0] << endl;
    return;
  }
  int bit[21];
  init(bit);
  forn(i, n)
  {
    ll val = a[i];
    for (int j = 0; j < 21; j++)
    {
      if ((val >> j) & 1)
        bit[j]++;
    }
  }
  ll ans = 0;
  while (true)
  {
    ll val = 0;
    for (int i = 0; i < 21; i++)
    {
      if (bit[i])
      {
        val += pow(2, i);
        bit[i]--;
      }
    }

    if (val == 0)
      break;
    ans += (val * val);
  }
  cout << ans << endl;
}
int main()
{
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);
  solve();
}
