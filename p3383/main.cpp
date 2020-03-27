#include<iostream>
#include<cstring>
#include<cstdio>
using namespace std;
bool isprime[100000001];
int prime[100000001];
void Eulen_sieve(int n)
{
    memset(isprime,true,sizeof(isprime));
    prime[0]=0;
    for(int i=2;i<=n;i++)
    {
        if(isprime[i])prime[++prime[0]]=i;
        for(int j=1;j<=prime[0] && i*prime[j]<=n;j++)
        {
            isprime[i*prime[j]]=false;
            if(i%prime[j]==0) break;
        }
    }
}
int main()
{
    int n,m;
    cin>>n>>m;
    int i;
    Eulen_sieve(n);
    for(i=0;i<m;i++)
    {
        int k;
        scanf("%d",&k);
        printf("%d\n",prime[k]);
    }
    return 0; 
}
