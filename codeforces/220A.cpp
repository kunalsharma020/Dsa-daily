#include<bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cin>>n;
    vector<int> arr1(n), arr2(n);
    for(int i=0;i<n;i++){
        cin>>arr1[i];
    }
    arr2=arr1;
    sort(arr2.begin(), arr2.end());
    int c=0;
    for(int i=0;i<n;i++){
        if(arr1[i]!=arr2[i]) c++;
    }
    if(c==0 || c==2) cout<<"YES";
    else cout<<"NO";
}