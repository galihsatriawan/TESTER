#include <iostream>
#include <stdlib.h>
#include <string>
#include <string.h>
#include <stdio.h>
#include <conio.h>
#include <vector>
#include <deque>


#define FORa(i,a,ak) for(i=a;i<=ak;i++)
#define FOR(i,n) for(i=1;i<=n;i++)
#define pf printf
#define sf scanf
using namespace std;


int main(){
	deque<int> stq;
	int n,i;
	string perintah;
	sf("%d",&n);
	FOR(i,n){
		long data;
		getline(cin,perintah);
		if(perintah.empty()){
			getline(cin,perintah);
		}
		if(perintah.find("push_back")<1){
			//ambil nilainya
			perintah.erase(0,9);
			data=atoi(perintah.c_str());
			stq.push_back(data);
		//	cout<<data<<endl;
		}else if(perintah.find("push_front")<1){
			//ambil nilainya
			perintah.erase(0,10);
			data=atoi(perintah.c_str());
			stq.push_front(data);
		//	cout<<data<<endl;
		}else if(perintah.find("pop_back")<1){
			if(stq.size()!=0){
				stq.pop_back();
			}
		}else{
			if(stq.size()!=0){
				stq.pop_front();
			}
		}
	}
	//cout<<"HORE"<<endl;
	FOR(i,stq.size()){
		cout<<stq.at(i-1)<<endl;
	}
	
	
	return 0;
}
