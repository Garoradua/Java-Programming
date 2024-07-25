#include<iostream>
using namespace std;
int main(){
	int n;
	cin >> n;
	int arr[n];
	for(int i=0; i<n; i++){
		cin >> arr[i];
	}
	int d;
	cin >> d;
	int temp[d];
	for(int i=0; i<n-1-d; i++){
		temp[i] = arr[i];	
	}
	int j=0;
	for(int i=n-1-d; i<n; i++){
		arr[j] = arr[i];
		j++;
	}
	j=0;
	for(int i=n-d; i<n; i++){
		arr[i] = temp[j];
		j++;
	}
	for(int i=0; i<n; i++){
		cout << arr[i];
	}
}