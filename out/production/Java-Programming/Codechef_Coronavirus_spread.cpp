#include<iostream>
#include <climits>
using namespace std;
int main(){
	int n;
	cin >> n;
	int arr[n]; 
	for(int i=0; i<n; i++){
		cin >> arr[i];
	}
	int min=INT_MAX, max=0;
	int count =1;
	for(int i=1; i<n; i++){
		if((arr[i]-arr[i-1])<=2){
			count ++;
		}else{
			if(min>count)
				min = count;
			if(max<count)
				max = count;
			count = 1;
		}
	}
	if(min>count)
		min = count;
	if(max<count)
		max = count;

	cout << min << " " << max;
}