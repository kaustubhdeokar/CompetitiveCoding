#include<bits/stdc++.h>
using namespace std;

void addedge(vector<int> adj[],int u,int v){
    adj[u].push_back(v);
    adj[v].push_back(u);
}

void dfsutil(int i,vector<int>adj[],vector<bool>&visited){
    visited[i]=true;
    cout<<i<<" ";
    for(int j=0;j<adj[i].size();j++){
        if(visited[adj[i][j]]==false)
            dfsutil(adj[i][j],adj,visited);
    }

}

void DFS(vector<int> adj[],int v){
    vector<bool> visited(v,false);
    int i;
    for(i=0;i<1;i++){
        if(visited[i]==false)
            dfsutil(i,adj,visited);
    }
}
int main(){
    int V=6;
    vector<int>adj[V];
    addedge(adj, 0, 1); 
    addedge(adj, 0, 4); 
    addedge(adj, 0, 5);
    addedge(adj, 1, 2); 
    addedge(adj, 1, 3); 
    addedge(adj, 1, 4); 
    addedge(adj, 2, 3); 
    addedge(adj, 3, 4);
    addedge(adj, 4, 5); 
    DFS(adj, V); 
    return 0;
}