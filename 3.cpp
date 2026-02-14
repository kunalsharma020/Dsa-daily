#include<bits/stdc++.h>
using namespace std;
int main(){
    int n, c;
    cin>>n>>c;

    vector<int> a(n);
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    int p=0, minipref=0, maxipref=0;
    for(int i=0;i<n;i++){
        p+=a[i];
        minipref=min(minipref, p);
        maxipref=max(maxipref, p);


    }

    int x=-minipref;
    if(x+maxipref>c){
        x=c-maxipref;
    }
    cout<<max(x, 0)<<endl;
}