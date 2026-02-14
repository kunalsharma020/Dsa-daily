#include<bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cin>>n;
    int s=0;
    while(n>1){
        if(n%3==0) n/=3;
        else if(n%2==0) n/=2;
        else n=n-1;
        s++;
    }
    cout<<s<<endl;
}