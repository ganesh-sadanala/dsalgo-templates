// Refer : Editorial
// Simple odd+odd=even+even=even , if all the elements are even
// then gcd is always >1 , else it is >=1

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
  vector<int> even;
  vector<int> odd;
  forn(i, n)
  {
    int x;
    cin >> x;
    if (x % 2 == 0)
      even.pb(i + 1);
    else
      odd.pb(i + 1);
  }
  if (odd.size() % 2 != 0)
  {
    odd.pop_back();
    even.pop_back();
  }
  else
  {
    if (odd.size() != 0)
    {
      odd.pop_back();
      odd.pop_back();
    }
    else
    {
      even.pop_back();
      even.pop_back();
    }
  }
  for (int i = 0; i < even.size(); i += 2)
    cout << even[i] << " " << even[i + 1] << endl;
  for (int i = 0; i < odd.size(); i += 2)
    cout << odd[i] << " " << odd[i + 1] << endl;
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
