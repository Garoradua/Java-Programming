#include<iostream>
using namespace std;
int main(){
	int t;
	cin >> t;
	while(t--){
	int n, m;
	cin >> n >> m;
	int arr[m];
	for(int i=0; i<m; i++){
		cin >> arr[i];
	}
	int all[n];
	for(int i=0; i<n; i++){
		all[i] = i+1;
	}
	for(int i=0; i<m; i++){
		int x = arr[i];
		all[x-1] = -1;
	}
	int chef[n] = {0}, ass[n]={0};
	int k=0;
				int d=0;
							int j=0;
	for(int i=0; i<n; i++){
		if(all[i]==-1){
			continue;
		}
		k++;
		if(k%2==0){
			ass[d++] = i+1;
		}else{
			chef[j++] = i+1;
		}
	}
	for(int i=0; i<n; i++){
		cout << "chef" ;
		if(chef[i]!=0){
			cout << chef[i] << " ";
		}
	}
	cout << endl;
	for(int i=0; i<n; i++){
		if(ass[i]!=0){
			cout << ass[i] << " ";
		}
	}
}
}