#include <bits/stdc++.h>


#define sf scanf

const int N =1e5+5;
using namespace std;
set<int> kump;
long long data[N];
int main(){
	int n,i;
	long long mini=1e18,maxi=-1e18,total=0;
	sf("%d",&n);
	for(i=1;i<=n;i++){
		sf("%lld",&data[i]);
		mini=min(mini,data[i]);
		maxi=max(maxi,data[i]);
		total+=data[i];
	}
	kump.insert(mini);
	kump.insert(maxi);
	kump.insert(total);
	
	for(i=0; ;i++){
		if(kump.count(i)==0){
			cout<<i<<endl;
			return 0;	
		} 
	}
	
}
