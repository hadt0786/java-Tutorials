/** Normal quick sort implemented by Arpan Pathak 
 ** Time Complexity for worst cases O(N^2) **/
#include <bits/stdc++.h>
using namespace std;
int partition(int *A,int start,int end)
{
   int pIndex=start;
   for(int i=start;i<end;i++)
       if(A[i]<=A[end])
            swap(A[i],A[pIndex++]);
	
   swap(A[end],A[pIndex]);
   return pIndex;
}
void quick_sort(int *A,int start,int end)
{
    if(start>=end) return;
    int pIndex=partition(A,start,end);
    quick_sort(A,start,pIndex-1);
    quick_sort(A,pIndex+1,end);
}
void seed(){ time_t *t; srand(time(0)); }
main()
{
    seed();
    int arr[]={10,9,8,7,6,5,4,3,2,1};
    quick_sort(arr,0,9);
    for(int i:arr) cout<<i<<" "; // range based for each loop

}
