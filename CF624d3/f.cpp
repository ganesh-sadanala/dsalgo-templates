// Refer ; Editorial Nice question leveraging BIT
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

struct BIT
{
  int sz;
  vi bit;
  BIT(int n)
  {
    sz = n;
    bit.assign(N, 0);
  }
  void update(int inx, int val)
  {
    inx++;
    while (inx <= sz)
    {
      bit[inx] += val;
      inx += (inx & (-inx));
    }
  }
  int query(int inx)
  {
    int res = 0;
    inx++;
    while (inx > 0)
    {
      res += bit[inx];
      inx -= (inx & (-inx));
    }
    return res;
  }
};

void solve()
{
  int n;
  cin >> n;
  BIT f1(n), f2(n);
  vpii a(n);
  for (int i = 0; i < n; i++)
    cin >> a[i].f;
  vi v;
  for (int i = 0; i < n; i++)
    cin >> a[i].s;
  for (int i = 0; i < n; i++)
  {
    cin >> a[i].s;
    v.pb(a[i].s);
  }
  sort(all(a));
  sort(all(v));
  long long ans = 0;
  for (int i = 0; i < n; i++)
  {
    int inx = lower_bound(all(v), a[i].s) - v.begin();
    ans += (f1.query(inx) * a[i].f - f2.query(inx));
    f1.update(inx, 1);
    f2.update(inx, a[i].f);
  }
  cout << ans << "\n";
}

int32_t main()
{
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  solve();

  return 0;
}
