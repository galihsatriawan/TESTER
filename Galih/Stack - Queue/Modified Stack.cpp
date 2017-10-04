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
	vector <int> stackku;
	int n,i,j,x,y;
	char perintah[6];
	sf("%d",&n);
	FOR(i,n){
		cin>>perintah;
		if(strcmp(perintah,"add")==0){
			sf("%d %d",&x,&y);
			FOR(j,y){
				stackku.push_back(x);
			}
			cout<<stackku.size()<<endl;
		}else if(strcmp(perintah,"del")==0){
			sf("%d",&y);
			cout<<stackku.at(stackku.size()-1)<<endl;
			FOR(j,y){
				stackku.pop_back();
			}
		}else if(strcmp(perintah,"adx")==0){
			sf("%d",&x);
			FORa(j,0,stackku.size()-1){
				stackku.at(j)+=x;
			}
		}else {
				sf("%d",&x);
			FORa(j,0,stackku.size()-1){
				stackku.at(j)-=x;
			}
		}
	}
	
	
	return 0;
}
