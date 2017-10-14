#include <bits/stdc++.h>

using namespace std;
//Keunggulan map disini seperti array, namun ia memiliki key dan value
//dimana key ialah index untuk mengakses value nya
//didalam kasus ini kita dapat menggunakannya untuk membuat suatu array yang berindex negatif

#define sf scanf
const int N=5e4+5;
map<int,int>  cX,cY;
map<pair<int,int>,int> marker; 
int main(){
	int n,i,j;
	int x[N],y[N];
	sf("%d",&n);
	for(i=1;i<=n;i++){
		sf("%d %d",&x[i],&y[i]);
		//kelompokkan
		cX[x[i]]++;
		cY[y[i]]++;
		//tandai yang sama
		marker[{x[i],y[i]}]++;
	}
	int maxi=0;
	int current;
	for(i=1;i<=n;i++){
		//karena setiap inputan akan menyumbang dua nilai yaitu x dan y
		current=cX[x[i]]+cY[y[i]]- 2* marker[{x[i],y[i]}];
		maxi=max(maxi,current);
	}
	
	cout<<maxi<<endl;
	
	return 0;
}
