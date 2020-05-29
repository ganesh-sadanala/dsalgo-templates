// Refer :https://www.youtube.com/watch?v=fgEe-iPdqeI&t=185s

#include <ext/pb_ds/assoc_container.hpp>
#include <ext/pb_ds/tree_policy.hpp>
#include <bits/stdc++.h>
using namespace std;
using namespace __gnu_pbds;

template<size_t>
struct debug{};

template <class T>
ostream& print_tuple(ostream& out, const T& t, debug<1> ) {
    return out << get<tuple_size<T>::value-1>(t);
}

template <class T, size_t idx>
ostream& print_tuple(ostream& out, const T& t, debug<idx> ) {
    out << get< tuple_size<T>::value-idx >(t) << " , ";
    return print_tuple(out, t, debug<idx-1>());
}

template <class... Args>
ostream& operator<<(ostream& out, const tuple<Args...>& t) {
    out << "\n[";
    print_tuple(out, t, debug<sizeof...(Args)>());
    return out << "]\n";
}

template<class T>
using rbTree=tree<T, null_type, less<T>, rb_tree_tag, tree_order_statistics_node_update>;

#define int long long int
#define endl '\n'
#define pb push_back
#define mp make_pair
#define f first
#define s second
#define unmap unordered_map
#define mset multiset
#define pii pair<int,int>
#define vi vector<int>
#define vpii vector<pair<int,int>>
#define vvi vector<vector<int>>
#define mem(u,v) memset(u,v,sizeof(u))
#define all(x) x.begin(),x.end()
#define r_all(x) x.rbegin(),x.rend()
#define dbg(x) cerr<<x<<"\n"
#define bug(x) cout<<"hi"<<x<<endl

const int mod=1e9+7;
double pi=1.0l*acos(-1);

int Madd(int a,int b) {
    return ((a%mod)+(b%mod)+mod)%mod;
}

int Mmull(int a,int b) {
    return ((a%mod)*(b%mod)+mod)%mod;
}

//#define test_cases

 int n;
    const int N=1e6+10;
    int bit[N];
  void update(int inx,int val)
  {
     while(inx<=n)
     {
         bit[inx]+=val;
         inx+=(inx&(-inx));
     }
  }

  int getSum(int inx)
  {
      int res=0;
      while(inx>0)
      {
          res+=bit[inx];
          inx-=(inx&(-inx));
      }
      return res;
  }

  void solve(int val) {

     if(val>0){
       update(val,1);return;}

     val=abs(val);
     int l=1,r=n;
     int ans=0;
     while(l<=r)
     {
        int mid=l+(r-l)/2;
        int cnt=getSum(mid);
        if(cnt>=val)
        {
            ans=mid;
            r=mid-1;
        }
        else
            l=mid+1;
     }

     update(ans,-1);
  }


int32_t main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
     int q;
	 cin>>n>>q;

      for(int i=0;i<n;i++){
          int x;
          cin>>x;
        update(x,1);}

      for(int i=0;i<q;i++){

      int x;
      cin>>x;
        solve(x);

      }

      int val=0;
      for(int i=1;i<=n;i++)
      {
          if(bit[i]>0){
            val=i;break;}
      }
      cout<<(val);
}
