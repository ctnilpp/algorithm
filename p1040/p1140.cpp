#include<iostream>
#include<cmath>
using namespace std;
int a[105],b[105],dp[105][105];
int table[5][5]={
   {
   	  5,-1,-2,-1,-3
   },
   {
   	-1,5,-3,-2,-4
   },
   {
   	-2,-3,5,-2,-2
   },
   {
   	-1,-2,-2,5,-1
   },
   {
   	 -3,-4,-2,-1,0
   }
};
int main(){
	int al,bl;
	cin>>al;
	for(int i=1;i<=al;i++){
		char x;
		cin>>x;
		if(x=='A') a[i]=1;
		if(x=='C') a[i]=2;
		if(x=='G') a[i]=3;
		if(x=='T') a[i]=4;
	}
	cin>>bl;
	for(int j=1;j<=bl;j++){
		char y;
		cin>>y;
		if(y=='A') b[j]=1;
		if(y=='C') b[j]=2;
		if(y=='G') b[j]=3;
		if(y=='T') b[j]=4;
	}
//	cout<<endl;
//		for(int j=1;j<=al;j++){
//		cout<<a[j]<<" ";
//	}
//	cout<<endl;
//		for(int j=1;j<=bl;j++){
//		cout<<b[j]<<" ";
//	}
//	cout<<endl;
	return 0;
}
