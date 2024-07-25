#include<iostream>
using namespace std;
int main(){
	int t;
	cin >> t;
	while(t--){
	int n;
	 cin >> n;
	 int arr[n];
	 for(int i=0; i<n; i++){
	 	cin >> arr[i];
	 }
	 int k;
	 cin >> k;

	 int sum =0, max=-1;
	 for(int i=0; i<k; i++){
	 	sum += arr[i];
	 }
	 max = sum;
	 for(int i=1; i<=n-k; i++){
	 	sum = sum-arr[i-1]+arr[i+k-1];
	 	// cout << sum  << " ";
	 	if(sum  > max){
	 		max = sum;
	 	}
	 } 
	 cout << max;
	}
}