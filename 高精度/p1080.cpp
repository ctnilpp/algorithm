#include<iostream>
#include<algorithm>
#include<cmath>
using namespace std;
int n,a[10010],b[10010],max[10010],lens=1,lenm=1,lena=1;
struct chen{
	int l;
	int r;
	int l_r;
}c[10005];

bool cmp(chen p,chen n){
	return p.l_r<n.l_r;
}

void cheng(int x){
	for(int i=1;i<=lens;i++){
		
	}
}

void chufa(int x){


}

int main(){
	cin>>n;
	for(int i=0;i<=n;i++){
		cin>>c[i].l>>c[i].r;
		c[i].l_r = c[i].l*c[i].r;
	}
	sort(c+1,c+n+1,cmp);
	for(int i=0;i<=n;i++){
		cout<<c[i].l_r<<endl;
	}
	a[head]=1;
	for(int i=1;i<=n;i++){
		  cheng(c[i-1].l);
		  chufa(c[i].r);
	}
	cout<<endl;
	return 0;
} 
