// Refer: Editorial
#include <iostream>
#include <bits/stdc++.h>
using namespace std;

#define pb push_back
#define vi vector<int>
#define vpii vector<pair<int, int>>
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

int n, k;
const int N = 1e6 + 1;
int sp[21][N];
int numlog[N];
int a[N];
void preprocess()
{
  numlog[1] = 0;
  for (int i = 2; i < N; i++)
    numlog[i] = numlog[i / 2] + 1;

  for (int i = 0; i < n; i++)
    sp[0][i] = a[i];

  for (int i = 1; (1 << i) <= n; i++)
  {
    for (int j = 0; (j + (1 << i)) <= n; j++)
    {
      sp[i][j] = max(sp[i - 1][j], sp[i - 1][j + (1 << (i - 1))]);
    }
  }
}

int query(int l, int r)
{
  int p = numlog[r - l + 1];
  return max(sp[p][l], sp[p][r - (1 << p) + 1]);
}

void solve()
{
  long res = 0;
  forn(i, n)
  {
    int ans = -1;
    int l = i, r = n - 1;
    while (l <= r)
    {
      int mid = l + (r - l) / 2;
      int mx = query(i, mid);
      if (mx - a[i] <= k)
      {
        ans = mid;
        l = mid + 1;
      }
      else
        r = mid - 1;
    }
    res += (long)(ans - i + 1);
  }
  cout << res << endl;
}

int main()
{
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  cin >> n >> k;
  forn(i, n)
          cin >>
      a[i];
  preprocess();
  solve();
}
