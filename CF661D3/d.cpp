// Refer: youtube https://www.youtube.com/watch?v=CNi7gt5swI0
#include <iostream>
#include <bits/stdc++.h>
using namespace std;

#define pb push_back
#define forn(i, n) for (int i = 0; i < n; i++)
#define ll long long
#define endl "\n"

const int N = 1e5 + 1;
void solve()
{
  int n;
  cin >> n;
  string s;
  cin >> s;
  stack<int> sz, so;
  vector<int> ans(n);
  int comp = 0;
  for (int i = 0; i < n; i++)
  {
    if (s[i] == '0')
    {
      if (!so.empty())
      {
        int top = so.top();
        so.pop();
        sz.push(top);
        ans[i] = top;
      }
      else
      {
        comp++;
        ans[i] = comp;
        sz.push(comp);
      }
    }
    else
    {
      if (!sz.empty())
      {
        int top = sz.top();
        sz.pop();
        so.push(top);
        ans[i] = top;
      }
      else
      {
        comp++;
        ans[i] = comp;
        so.push(comp);
      }
    }
  }
  cout << comp << endl;
  for (int i = 0; i < n; i++)
    cout << ans[i] << " ";
  cout << endl;
}
int main()
{
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);
  int t;
  cin >> t;
  while (t--)
    solve();
}
