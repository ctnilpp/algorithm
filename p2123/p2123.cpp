#include<iostream>
#include<algorithm>
#include<cmath>
using namespace std;
int T,n;
long long Max=0,pro=0,suma=0;
struct chen{
	long long x,y,d;
}c[20005];
bool cmp(chen q,chen w){
	if(q.d!=w.d) return q.d<w.d;
	if(q.d<=0) return q.x<w.x;
	return q.y>w.y;
}
int main(){
	cin>>T;
	for(int i=1;i<=T;i++){
		cin>>n;
		Max=0,pro=0,suma=0;
		for(int i=1;i<=n;i++){
			cin>>c[i].x>>c[i].y;
			if(c[i].x<c[i].y) c[i].d = -1;
			else if(c[i].x>c[i].y) c[i].d = 1;
			else c[i].d = 0;
		}
		sort(c+1,c+1+n,cmp);
		for(int i=1;i<=n;i++){
			long long now = 0;
			 if(i==1) {
			 	now = c[i].x+c[i].y;
			 	suma+=c[i].x;
			 	pro = now;
			 	Max = max(now,Max);
			 }
			 else {
			 	suma+=c[i].x;
			 	now = max(pro,suma)+c[i].y;
			 	pro = now;
			 	Max = max(now,Max);
			 }
		}
		cout<<Max<<endl;
	}
	return 0;
} 
