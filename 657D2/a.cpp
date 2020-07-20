// Missed one test case ab?????cabc
// TO check after found one replacing question marks
#include <iostream>
#include <bits/stdc++.h>
using namespace std;

#define pb push_back
#define forn(i, n) for (int i = 0; i < n; i++)
#define ll long long
#define endl "\n"

int n;
string s;
const int N = 2e5 + 5;
int cans = 0;
void isValid(string str)
{
  for (int i = 0; i <= n - 7; i++)
  {
    if ((str[i] == 'a') && (str[i + 1] == 'b') && (str[i + 2] == 'a') && (str[i + 3] == 'c') && (str[i + 4] == 'a') && (str[i + 5] == 'b') && str[i + 6] == 'a')
      cans++;
  }
}
void solve()
{
  cans = 0;
  isValid(s);
  if (cans > 1)
  {
    cout << "No\n";
    return;
  }
  if (cans == 1)
  {
    cout << "Yes\n";
    for (int i = 0; i < n; i++)
    {
      if (s[i] == '?')
        s[i] = 'd';
      cout << s[i];
    }
    cout << endl;
  }
  else
  {
    for (int i = 0; i <= n - 7; i++)
    {
      string str = s;
      if ((str[i] == 'a' || str[i] == '?') && (str[i + 1] == 'b' || str[i + 1] == '?') && (str[i + 2] == 'a' || str[i + 2] == '?') && (str[i + 3] == 'c' || str[i + 3] == '?') && (str[i + 4] == 'a' || str[i + 4] == '?') && (str[i + 5] == 'b' || str[i + 5] == '?') && (str[i + 6] == 'a' || str[i + 6] == '?'))
      {
        str[i] = 'a';
        str[i + 1] = 'b';
        str[i + 2] = 'a';
        str[i + 3] = 'c';
        str[i + 4] = 'a';
        str[i + 5] = 'b';
        str[i + 6] = 'a';
        cans = 0;
        isValid(str);
        if (cans == 1)
        {
          cout << "Yes\n";
          for (int i = 0; i < n; i++)
          {
            if (str[i] == '?')
              str[i] = 'd';
            cout << str[i];
          }
          cout << endl;
          return;
        }
      }
    }
    cout << "No\n";
  }
}
int main()
{
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);
  int t;
  cin >> t;
  while (t--)
  {
    cin >> n;
    cin >> s;
    solve();
  }
}
