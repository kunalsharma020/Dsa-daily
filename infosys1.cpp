#include <bits/stdc++.h>
using namespace std;
int main(){
    long long n;
    cin>>n;

    unordered_set<long long> vis;
    long long curr=n;
    while(vis.count(curr)==0){
        vis.insert(curr);
         curr=curr+1;
         while(curr%10==0){
            curr=curr/10;
         }
    }
    cout<<vis.size()<<endl;
    return 0;

}