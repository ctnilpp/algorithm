#include<cstdio>
#include<iostream>
using namespace std;
int n=0,q=0,check[100000005] = {0};
int prime[100000005]={0},cnt=0;
int main(){
	cin>>n>>q;
	for(int i=2;i<=n;i++){
		if(check[i]==0)prime[cnt++]=i;	
		for(int j =0;j<cnt&&i*prime[j]<=n;j++){
			check[i*prime[j]]=1;
			if(i%prime[j]==0)break;
		}
	}
	int now =0;
	for(int i=0;i<q;i++){
		scanf("%d",&now);
		printf("%d\n",prime[now-1]);
	}
	return 0;
}
