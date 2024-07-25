#include<iostream>
using namespace std;
int main(){
	int t;
	cin >> t;
	while(t--){
		int n;
		cin >> n;
		int pi[n], si[n];
		for(int i=0; i<n; i++){
			cin >> pi[i] >> si[i];
		}
		int max[9] = {0};
		int larger;
		int number;
		for(int i=0; i<n; i++){
			if(pi[i] > 8){
				continue;
			}
			number = pi[i];
			larger = si[i];
			if(larger > max[number]){
				max[number] = larger;
			}
		}
		int sum=0;
		for(int i=1; i<=8; i++){
			if(max[i]!=0){
				sum += max[i];
			}
		}
		cout << sum;
	}
}