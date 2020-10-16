#include<iostream>
using namespace std;

int main(){
	int n;
	cout<<"Enter number of nodes:\n";
	cin>>n;
	char node[n];
	int status[n];
	cout<<"Enter nodes name:\n";
	for(int i=0;i<n;i++){
	    cin>>node[i];
	    status[i]=1;
	}
	for(int i=0;i<n;i++){
	    cout<<node[i]<<" status: "<<status[i]<<"\n";
	}
	char temp[n],final[n],top=0;
	cout<<"Enter root node:\n";
	char r;
	cin>>r;
	temp[0]=r;
	for(int i=0;i<n;i++){
		if(r==node[i]){
			status[i]=2;
		}
	}
	top++;
	int i=0;
	while(top!=0){
		final[i]=temp[top-1];
		top--;
		int m;
		cout<<"Enter number of adjacent sides of "<<final[i]<<":\n";
		cin>>m;
		for(int j=0;j<m;j++){
			char q;
			cin>>q;
			int flag1=0,flag2=0,l=0,p=0;
            while(l<top){
            	if(q==temp[l]){
            		flag1++;
				}
				l++;
			}
			while(p<i){
            	if(q==final[p]){
            		flag2++;
				}
				p++;
			}
			if((flag1==0)&&(flag2==0)){
				temp[top]=q;
				top++;
			}

		}
		i++;
	}
	for(int u=0;u<i;u++){
		cout<<final[u]<<" ";
	}

}
