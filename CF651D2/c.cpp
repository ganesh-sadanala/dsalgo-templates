// Refer : Editorial
// Learned :
// 1. If a number is a power of two, it has no odd divisors
// 2. To find all the odd divisors(revised)

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

bool prime(int x)
{
  for (int i = 2; i <= (int)sqrt(x); i++)
  {
    if (x % i == 0)
      return false;
  }
  return true;
}
void solve()
{
  int n;
  cin >> n;
  if (n == 1)
    cout << "FastestFinger\n";
  else if (n == 2)
    cout << "Ashishgup\n";
  else
  {
    if (n % 2 != 0)
      cout << "Ashishgup\n";
    else if ((n & (n - 1)) == 0)
      cout << "FastestFinger\n";
    else if (n % 4 == 0)
      cout << "Ashishgup\n";
    else if (prime(n / 2))
      cout << "FastestFinger\n";
    else
      cout << "Ashishgup\n";
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
