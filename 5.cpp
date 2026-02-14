#include<bits/stdc++.h>
using namespace std;
int main(){
    int n, m;
    cin>>n>>m;
    vector<string> grid(n);
    for(int i=0;i<n;i++){
        cin>>grid[i];
    }
    queue<pair<int, int>> q;
    int e=0;
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(grid[i][j]=='A'){
                q.push({i, j});
            }else if(grid[i][j]=='E') e++;
        }
    }
    if(e==0) {
        cout<<0<<endl;
        return 0;
    }
    int t=0;
    int dx[4]={-1, 1, 0, 0};
    int dy[4]={0, 0, -1, 1};
    while(!q.empty()){
        int sz=q.size();
        bool found=false;
        while(sz--){
            int x=q.front().first;
            int y=q.front().second;
            q.pop();
            for(int k=0;k<4;k++){
                int nx=x+dx[k];
                int ny=y+dy[k];
                if(nx>=0 && nx<n && ny>=0 && ny<m && grid[nx][ny]=='E'){
                    grid[nx][ny]='A';
                    q.push({nx, ny});
                    e--;
                    found=true;
                }

            }
        }
        if(found) t++;
    }
    if(e>0) cout<<-1;
    

}