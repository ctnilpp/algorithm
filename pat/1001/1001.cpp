#include<iostream>
#include<cmath>
using namespace std;
int main(){
	int a,b;
	int c;
	char d[20];
	cin>>a>>b;
	c = a+b;
	itoa(c,d,10);
	cout<<d<<endl;
	return 0;
}
