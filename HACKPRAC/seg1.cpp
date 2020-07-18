// Link:
// https://www.hackerearth.com/practice/data-structures/advanced-data-structures/segment-trees/practice-problems/algorithm/xor-sum-1-af648068/description/

// Solution using BIT
#include <iostream>
#include <bits/stdc++.h>
using namespace std;

#define pb push_back
#define forn(i, n) for (int i = 0; i < n; i++)
#define ll long long
#define init(arr) memset(arr, 0, sizeof(arr))
#define endl "\n"

const int N = 1e5 + 1;
int n, m;
ll bit[43][N];
ll mod = 1e9 + 7;

void update(int i, int inx, int val)
{
    while (inx <= N)
    {
        bit[i][inx] += val;
        inx += (inx & (-inx));
    }
}
ll getSum(int i, int inx)
{
    ll res = 0;
    while (inx > 0)
    {
        res += bit[i][inx];
        inx -= (inx & (-inx));
    }
    return res % mod;
}
void solve()
{
    int n;
    cin >> n;
    ll a[n];
    forn(i, 43)
        forn(j, N)
            bit[i][j] = 0;

    forn(i, n)
    {
        cin >> a[i];
        ll temp = a[i];
        for (int j = 0; j < 43; j++)
        {
            if (((temp >> j) & 1))
                update(j, i + 1, 1);
        }
    }
    int m, dumm;
    cin >> m >> dumm;
    while (m--)
    {
        int l, r;
        cin >> l >> r;
        ll ans = 0;
        for (int i = 0; i < 43; i++)
        {
            ll ai = getSum(i, r) - getSum(i, l - 1);
            ll bi = (r - l + 1) - ai;
            ll temp = 0;
            temp = (temp % mod + (ai * ((bi * (bi - 1) / 2) % mod)) % mod) % mod;
            temp = (temp % mod + ((ai * (ai - 1) * (ai - 2)) / 6) % mod) % mod;
            temp = ((temp % mod) * ((1 << i) % mod)) % mod;
            ans = (ans % mod + temp % mod) % mod;
        }
        cout << (ans + mod) % mod << endl;
    }
}
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    solve();
}
// ------------------------------------------
// Solution using prefix array method is easy -> suitable since there are no updates
#include <iostream>
#include <bits/stdc++.h>
using namespace std;

#define pb push_back
#define forn(i, n) for (int i = 0; i < n; i++)
#define ll long long
#define init(arr) memset(arr, 0, sizeof(arr))
#define endl "\n"

const int N = 1e5 + 1;
int n, m;
ll mod = 1e9 + 7;
ll pref[43][N];
void cal(ll a[])
{
    for (int i = 0; i < 43; i++)
    {
        for (int j = 1; j <= n; j++)
        {
            pref[i][j] = pref[i][j - 1];
            if ((a[j] >> i) & 1)
                pref[i][j]++;
        }
    }
}
void solve()
{
    cin >> n;
    ll a[n + 1];
    forn(i, 43)
        forn(j, n + 1)
            pref[i][j] = 0;
    for (int i = 1; i <= n; i++)
        cin >> a[i];
    cal(a);
    int m, dumm;
    cin >> m >> dumm;
    while (m--)
    {
        int l, r;
        cin >> l >> r;
        ll res = 0;
        for (int i = 0; i <= 42; i++)
        {
            ll ans = 0;
            ll ai = pref[i][r] - pref[i][l - 1];
            ll bi = (r - l + 1) - ai;
            ans += (ai % mod * ((bi * (bi - 1)) / 2) % mod) % mod;
            ans %= mod;
            ans += ((ai * (ai - 1) * (ai - 2)) / 6) % mod;
            ans %= mod;
            ans = (ans % mod * (1 << i) % mod) % mod;
            res = (res + ans) % mod;
        }
        cout << res << endl;
    }
}
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    solve();
}
// Solution using Segment Tree
#include <iostream>
#include <bits/stdc++.h>
using namespace std;

#define pb push_back
#define forn(i, n) for (int i = 0; i < n; i++)
#define ll long long
#define init(arr) memset(arr, 0, sizeof(arr))
#define endl "\n"

const int N = 1e5 + 1;
int n, m;
ll mod = 1e9 + 7;
ll st[43][400005];

void construct(ll a[], int ss, int se, int si)
{
    if (ss == se)
    {
        for (int i = 0; i <= 42; i++)
        {
            if ((a[ss] >> 1) & 1)
                st[i][si] = 1;
        }
        return;
    }

    int mid = ss + (se - ss) / 2;
    construct(a, ss, mid, 2 * si + 1);
    construct(a, mid + 1, se, 2 * si + 2);
    for (int i = 0; i <= 42; i++)
        st[i][si] = st[i][2 * si + 1] + st[i][2 * si + 2];
}
ll query(int ss, int se, int qs, int qe, int si, int idx)
{
    if (qe < ss || qs > se)
        return 0;
    if (qs <= ss && qe >= se)
        return st[idx][si];
    int mid = ss + (se - ss) / 2;
    return query(ss, mid, qs, qe, 2 * si + 1, idx) + query(mid + 1, se, qs, qe, 2 * si + 2, idx);
}
void solve()
{
    cin >> n;
    ll a[n + 1];
    forn(i, 43)
        forn(j, 400005)
            st[i][j] = 0;
    for (int i = 1; i <= n; i++)
        cin >> a[i];
    construct(a, 0, n - 1, 0);
    int m, dumm;
    cin >> m >> dumm;
    while (m--)
    {
        ll res = 0;
        int l, r;
        cin >> l >> r;
        l--;
        r--;
        for (int i = 0; i <= 42; i++)
        {
            ll ans = 0;
            ll ai = query(0, n - 1, l, r, 0, i);
            ll bi = (r - l + 1) - ai;
            ans += (ai % mod * ((bi * (bi - 1)) / 2) % mod) % mod;
            ans %= mod;
            ans += ((ai * (ai - 1) * (ai - 2)) / 6) % mod;
            ans %= mod;
            ans = (ans % mod * (1 << i) % mod) % mod;
            res = (res + ans) % mod;
        }
        cout << res << endl;
    }
}
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    solve();
}
