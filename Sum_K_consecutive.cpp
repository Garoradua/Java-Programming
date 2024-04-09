#include<iostream>
using namespace std;
int main(){
	int n;
	 cin >> n;
	 int arr[n];
	 for(int i=0; i<n; i++){
	 	cin >> arr[i];
	 }
	 int k;
	 cin >> k;
	 int d;
	 int sum=0, max=0, count=0;
	 for(int i=0; i<=n-k; i++){
	 	d=i;
	 	for(int j=0; j<k; j++){
	 		cout << "Hello";
	 		sum += arr[d];
	 		d++;
	 		cout << sum << " ";
	 	}
	 	cout << endl;
	 	if(sum>max){
	 		max = sum;
	 	}
	 	sum=0;

	 }
	 cout << max;
}