#include<bits/stdc++.h>
using namespace std;
int main(){
    int n, k;
    cin>>n>>k;
    vector<int > a(n);
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    unordered_map<int, int> frq;
    int l = 0;
    int ans=0;
    int dist=0;
    int currsum=0;
    for(int r=0;r<n;r++){
        frq[a[r]]++;
        if(frq[a[r]]==1) dist++;
        currsum+=a[r];
        while(dist>k){
            frq[a[l]]--;
            currsum-=a[l];
            if(frq[a[l]]==0) dist--;
            l++;
        }
        ans=max(ans, currsum);
    }
    cout<<ans<<endl;


}