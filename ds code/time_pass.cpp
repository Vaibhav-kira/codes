#include<iostream>
#include<map>
#include<list>
#include<queue>
using namespace std;

class Graph{
map<char,list<char>> g;
public:
Graph(){
}
  void ins(char b){
  cout<<"Enter number of  edges of "<<b<<":\n";
    int m;
    char e;
    cin>>m;
    cout<<"Enter adjacent vertices:\n";
    for(int i=0;i<m;i++){
      cin>>e;
      g[b].push_back(e);
    }
  }

  void bfst(char bfs){
    map<char,bool> temp;
    queue<char> q;
    q.push(bfs);
    temp[bfs]= true;
    while(!q.empty()){
      char t= q.front();
      cout<<t<<" ";
      q.pop();
      for(int neigbour :g[t]){
          if(!temp[neigbour]){
            q.push(neigbour);
            temp[neigbour] = true;
          }
      }
    }
  }
  void print(){


      for(auto key:g){
        cout<<key.first<<"->";
        for(auto value:key.second){
          cout<<value<<"  ";
        }
        cout<<"*end*\n";
      }
    }

};
int main(){
  Graph r;

	int n;
	cout<<"Enter number of vertices:\n";
	cin>>n;
	char b;

	for(int i=0;i<n;i++){
    cout<<"Enter vertex";
		cin>>b;
    r.ins(b);
	}
  cout<<"Adjency list of graph is:\n";
  r.print();
	cout<<"Enter root node:\n";
  char bfs;
  cin>>bfs;
  cout<<"bfs is traversal is:\n";
   r.bfst(bfs);
   return 0;

}
