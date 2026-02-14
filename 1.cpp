#include<bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    cin >> n;
    vector<long long> a(n);
    const int mod = 1e9+7;

    for(int i=0;i<n;i++){
        cin >> a[i];
    }

    // Prefix sum to get initial total
    long long currSum = 0;
    for(int i=0;i<n;i++){
        currSum = (currSum + a[i]) % mod;
    }

    int q;
    cin >> q;

    long long totalAns = 0;

    while(q--){
        int type,l,r;
        cin >> type >> l >> r;

        l--; r--;   // 0-based

        if(type == 1){
            for(int i=l;i<=r;i++){
                long long oldVal = a[i];
                long long newVal = ((i - l + 1LL) * oldVal) % mod;

                // update running sum
                currSum = (currSum - oldVal + mod) % mod;
                currSum = (currSum + newVal) % mod;

                a[i] = newVal;
            }
        }
        else{
            totalAns = (totalAns + currSum) % mod;
        }
    }

    cout << totalAns << endl;
}


// #include<bits/stdc++.h>
// using namespace std;
// int main()
// {
//     int n;
//     cin>>n;
//     vector<long long> a(n);
//     for(int i=0;i<n;i++){
//         cin>>a[i];
//     }
//     int q;
//     cin>>q;
//     int sum=0;
//     int mod=1e9+7;
//     while(q--){
//         int type, l, r;
//         cin>>type>>l>>r;
//         if(type==1){
//             for(int i=l;i<=r;i++){
//                 a[i]=((i-l+1)*a[i])%mod;
//             }
//         }else{
//             int ans=0;
//             for(int i=0;i<n;i++){
//                 ans=(ans+a[i])%mod;
//             }
//             sum=(sum+ans)%mod;
//         }
        
//     }
//     cout<<sum<<endl;
//         return 0;
// }