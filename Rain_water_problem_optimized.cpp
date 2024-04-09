#include<iostream>
using namespace std;
int main()
{
	int n;
	cin >>n;
	int arr[n];
	for(int i=0; i<n; i++){
		cin >> arr[i];
	}
	int left[n], right[n];
	left[0] = arr[0];
	right[n-1] = arr[n-1];
	for(int i=1; i<n; i++){
		if(arr[i]>left[i-1])
			left[i] = arr[i];
		else
			left[i] = left[i-1];
	}
	for(int i=n-2; i>=0; i--){
		if(arr[i]>right[i+1])
			right[i] = arr[i];
		else
			right[i] = right[i+1];
	}
	int w =0, min=0;
	for(int i=1; i<n-1; i++){
		if(left[i]>right[i]){
			min = right[i];
		}else{
			min = left[i];
		}
		w += min-arr[i];
	}
	cout << w;
}