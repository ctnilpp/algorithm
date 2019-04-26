#include<iostream>
#include<cstring>
using namespace std;
char a1[100],b1[100];
int a[100],b[100],c[300],lena,lenb,lenc,i,j;
int main()
{
    gets(a1);
    gets(b1);
    lena = strlen(a1);
    lenb = strlen(b1);
    cout<<"lena"<<lena<<endl;
    cout<<"lenb"<<lenb<<endl;
    for(int i=0;i<lena;i++) a[lena-i] = a1[i]-48;
    for(int i=0;i<lenb;i++) b[lenb-i] = b1[i]-48;
    for(int i=1;i<=lena;i++){
    	for(int j=1;j<=lenb;j++){
    		     c[i+j-1] = c[i+j-1]+a[i]*b[j]+c[i+j-2]/10;
				 c[i+j-2]%=10;    
		}
	}
	lenc = lena+lenb;
		 while(c[lenc]==0&&lenc>1)
		 	 lenc--;
	for(int i=lenc;i>=1;i--){
		 cout<<c[i];
	}
	cout<<endl;
    return 0;
}
