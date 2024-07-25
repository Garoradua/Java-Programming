#include<iostream>
using namespace std;

void Reverse(int arr[], int start, int end){
	int temp;
	while(start<end){
		temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		start++;
		end--;
	}
	for(int i=0; i<6; i++){
		cout << arr[i];
	}
	cout << endl;
}

int main(){
	int n;
	cin >> n;
	int arr[n];
	for(int i=0; i<n; i++){
		cin >> arr[i];
	}
	int d;
	cin >> d; 

	Reverse(arr,0,d-1);
	Reverse(arr,d,n-1);
	Reverse(arr,0,n-1);
	for(int i=0; i<n; i++){
		cout << arr[i];
	}
}