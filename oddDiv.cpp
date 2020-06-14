// Refer : Discuss
// https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/odd-divisors-1-4939f17d/description/

#include <iostream>
#include <bits/stdc++.h>
using namespace std;

#define pb push_back
#define vi vector<int>
#define vpii vector<pair<int, int>>
#define N (int)2e5 + 5
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
#define mp make_pair

int main()
{
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  int t;
  cin >> t;
  while (t--)
  {
    ll n, m;
    cin >> n >> m;
    ll ans = 0;
    while (n)
    {
      ans = (ans + ((((n / 2 + (n % 2)) % m) * ((n / 2 + (n % 2)) % m)) % m)) % m;
      n /= 2;
    }
    cout << ans << endl;
  }
}
