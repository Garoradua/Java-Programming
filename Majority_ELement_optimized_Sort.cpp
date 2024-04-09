#include<iostream>
using namespace std;
int main(){
	int n;
	 cin>> n;
	 int arr[n];
	 for(int i=0; i<n; i++){
	 	cin >> arr[i];
	 }
	 int half = n/2;

	 for(int i=0; i<n-1; i++){
	 	for(int j=i+1; j<n; j++){
	 		if(arr[i]>arr[j]){
	 			int temp = arr[i];
	 			arr[i] = arr[j];
	 			arr[j] = temp;

	 		}
	 	}
	 }
	 int count = 1;
	 for(int i=0; i<n; i++){
	 	if(arr[i] == arr[i+1]){
	 		count ++;
	 		cout << arr[i] << " " << count << endl;
	 	}
	 	if(count> half){
	 		cout << arr[i] << endl;
	 		break;
	 	}
	 	if(arr[i] != arr[i+1]){
	 		count  = 1;
	 	}
	 }
}