#include<iostream>
using namespace std;
int main(){
	int n;
	cin >> n;
	int arr[n];
	for(int i=0; i<n; i++){
		cin >> arr[i];
	}
	int min;
	for(int i=0; i<n; i++){
		if(arr[i]<min){
			min = arr[i];
		}
	}
	cout << min;
}