#include <iostream>
#include <stdlib.h>
#include <string>
#include <string.h>
#include <stdio.h>
#include <conio.h>
#include <vector>

#define FORa(i,a,ak) for(i=a;i<=ak;i++)
#define FOR(i,n) for(i=1;i<=n;i++)
#define pf printf
#define sf scanf
using namespace std;


int main(){
	vector <long> baris;
	long i,j,n;
	long s=0;
	long tinggi;
	sf("%ld",&n);
	FOR(i,n){
		sf("%ld",&tinggi);
		baris.push_back(tinggi);
		long index=baris.size()-1;
		while((index>=0)&&(baris[index]<=tinggi)){
			s++;
			index--;
		}
	}
	pf("%ld\n",s);
	return 0;
}
