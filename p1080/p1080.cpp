#include<iostream>
#include<algorithm>
using namespace std;
int n,lena=1,lenb=1,lenm=1,a[100005]={0,1},b[100005]={0,1},m[100005];
struct chen{
	int l,r,l_r;
}c[1005];

bool cmp(chen a,chen b){
	return a.l_r<b.l_r;
}

void cheng(int x){
	int tmp =0;
	for(int i=1;i<=lena;i++){
		a[i] *= x;
	}
	for(int i=1;i<=lena;i++){
		tmp += a[i];
		a[i] = tmp%10;
		tmp/=10;
	}
	while(tmp>0){
		lena++;
		a[lena] = tmp%10;
		tmp/=10;
	}
}

void chu(int x){
	for(int i=0;i<=lena;i++){
		b[i] =0;
	}
	lenb = lena;
	int tmp =0;
	for(int i=lenb;i>=1;i--){
		tmp*=10;
		tmp+=a[i];
		if(tmp>=x){
			b[i] = tmp/x;
			tmp = tmp%x; 
		 } 
	}
	while(b[lenb]==0){
		if(lenb==1)break;
		lenb--;
	} 
}

void max(){
	if(lenb>lenm){
		for(int i=1;i<=lenb;i++){
			m[i] = b[i];
		}
		lenm = lenb;
	}
	else if(lenb==lenm){
		for(int i=lenb;i>=1;i--){
			if(b[i]>m[i]){
				for(int j=1;j<=lenb;j++){
					m[j] =b[j];
				}
				lenm = lenb;
				break;
			}
		}
	}
}

int main(){
	cin>>n;
	for(int i=0;i<=n;i++){
		cin>>c[i].l>>c[i].r;
		c[i].l_r = c[i].l*c[i].r;
	}
	sort(c+1,c+1+n,cmp);
	for(int i=1;i<=n;i++){
		cheng(c[i-1].l);
		chu(c[i].r);
		max();
	}
			for(int i=lenm;i>=1;i--){
		cout<<m[i];
      	}
	cout<<endl;
	return 0;
} 
