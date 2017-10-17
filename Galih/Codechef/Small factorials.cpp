#include <iostream>
#include <stdlib.h>
#include <string>
#include <string.h>
#include <stdio.h>
#include <vector>
#include <cmath>
#define FORa(i,a,ak) for(i=a;i<=ak;i++)
#define FOR(i,n) for(i=1;i<=n;i++)
#define pf printf
#define sf scanf
using namespace std;

long long factorial(int n){
	long long hasil=1;
	int i;
	for(i=2;i<=n;i++){
		hasil*=i;
	}
	return hasil;
}
int main(){
	long long hasil[1005];
	int n,t;
	cin>>t;
	int i;
	FOR(i,t){
		cin>>n;
		hasil[i]=factorial(n);
	}
	FOR(i,t){
		cout<<hasil[i]<<endl;
	}
	return 0;
}

