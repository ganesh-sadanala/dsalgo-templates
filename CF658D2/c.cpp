// Constructive Algorithm
// If i had solved the string from backwards then i would have solved it.
#include <iostream>
#include <bits/stdc++.h>
using namespace std;

#define pb push_back
#define forn(i, n) for (int i = 0; i < n; i++)
#define ll long long
#define endl "\n"
#define zero(arr, n) for (int i = 0; i < n; i++) arr[i] = 0

    void
    solve()
{
  int n;
  cin >> n;
  string a, b;
  cin >> a >> b;
  vector<int> ans;
  int cnt = 0;
  for (int i = n - 1; i >= 0; i--)
  {
    if (a[i] == b[i])
      continue;
    else
    {
      if (i == 0)
      {
        if (a[0] != b[0])
        {
          cnt++;
          ans.pb(1);
          a[0] = (a[0] == '0') ? '1' : '0';
        }
      }
      else if (a[0] != b[i])
      {

        cnt++;
        int len = i + 1;
        for (int j = 0; j <= i; j++)
          a[j] = (a[j] == '0') ? '1' : '0';
        ans.pb(i + 1);

        for (int j = 0; j < len / 2; j++)
        {
          char temp = a[j];
          a[j] = a[i - j];
          a[i - j] = temp;
        }
      }
      else
      {
        ans.pb(1);
        a[0] = (a[0] == '0') ? '1' : '0';
        int len = i + 1;
        cnt += 2;
        ans.pb(i + 1);
        for (int j = 0; j <= i; j++)
          a[j] = (a[j] == '0') ? '1' : '0';
        for (int j = 0; j < len / 2; j++)
        {
          char temp = a[j];
          a[j] = a[i - j];
          a[i - j] = temp;
        }
      }
    }
  }
  cout << cnt << " ";
  for (int i = 0; i < ans.size(); i++)
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
