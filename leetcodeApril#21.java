// I was able to get AC using H*log(W) time complexity and O(1) space
/*
 * //Algo:
 *
 * return ans; }
 */

void solve()
{ ArrayList<Integer> list=binaryMatrix.dimensions();
  int r=list.get(0);
   int c=list.get(1);
   int ans = c;
   for(int i=0;i<r;i++) {
     int l=0,h=c-1;
     while(l<=h)
     { int m=(l+h)>>>1;
      if(binaryMatrix.get(i,m)==1)
      {
   ans=Math.min(m,ans); h=m-1; }
   else l=m+1; }
   }
   if(ans==c)
   return -1;

   return ans;
  }
// This is what i have learned -> Doing better
// Reference: Errichto channel

void solve()
{
ArrayList<Integer> list=binaryMatrix.dimensions();
int r=list.get(0);
int c=list.get(1);
int ans = c;
for(int i=0;i<r&&ans!=0;i++)
{
  int l=0,h=ans-1;
  if(binaryMatrix.get(i,h)==1){
  while(l<=h)
  {
    int m=(l+h)>>>1;
    if(binaryMatrix.get(i,m)==1)
    {
      ans=Math.min(m,ans);
      h=m-1;
    }
    else
      l=m+1;
  }}
}
if(ans==c)
 return -1;

return ans;
}
// Doing much better -> Linear time using two pointers {O(H+W)}
void solve()
{
ArrayList<Integer> list=binaryMatrix.dimensions();
int r=list.get(0);
int c=list.get(1);
int ans = c;
for(int i=0;i<r&&ans!=0;i++)
{
   while(binaryMatrix.get(i,ans-1)==1)
      ans--;
}
if(ans==c)
  return -1;
  return ans;
}
// Learned -> Try whether binary search can be brought down to two pointer or pointer or sliding window
