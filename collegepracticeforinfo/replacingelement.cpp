#include<bits/stdc++.h>
using namespace std;
int main(){

    int t;
    cin>>t;
    while(t--){
        int n, d;
        cin>>n>>d;
        vector<int>a(n);
        for(int i=0;i<n;i++){
            cin>>a[i];
        }
        sort(a.begin(), a.end());
        if(a[n-1]<=d) cout<<"Yes/n";
        else if(a[0]+a[1]<=d) cout<<"YES/n";
        else cout<<"NO/n";
    }
    

}

// tc : nlogn