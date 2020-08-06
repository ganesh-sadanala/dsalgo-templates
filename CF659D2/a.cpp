// Refer: Aryan Mittal video
// Constructive Algo.
// easy one -> i went in a wrong direction
#include <iostream>
#include <bits/stdc++.h>
using namespace std;

#define pb push_back
#define forn(i, n) for (int i = 0; i < n; i++)
#define ll long long
#define endl "\n"

const int N = 3501;

void solve()
{
  int n;
  cin >> n;
  int a[n];
  forn(i, n)
          cin >>
      a[i];
  string str;
  for (int i = 0; i < 52; i++)
    str += 'a';
  cout << str << endl;
  for (int i = 0; i < n; i++)
  {
    string s;
    int diff = a[i];
    for (int j = 0; j < diff; j++)
      s += str[j];

    char c = str[diff] == 'a' ? 'b' : 'a';
    for (int j = diff; j < 52; j++)
      s += c;

    cout << s << endl;
    str = s;
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
    solve();
}
