#include <bits/stdc++.h>
using namespace std;

int main(){
    long long maxsum;
    int n, minlen;
    cin>>n>>minlen>>maxsum;

    vector<long long> arr(n);
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    long long sum=0, ans=0;
    int left=0;
    for(int right=0;right<n;right++){
        sum+=arr[right];
        while(sum>maxsum){
            sum-arr[left];
            left++;
        }
        int minstart=right-minlen+1;
        if(minstart>=left){
            ans+=minstart-left+1;
        }
    }
    cout<<ans<<endl;
}