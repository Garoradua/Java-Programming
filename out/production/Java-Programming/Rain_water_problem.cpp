#include<iostream>
using namespace std;
int main()
{
	int n,min;
	cin>>n; //9
	int arr[n],w=0;
	for(int i=0; i<n; i++){
		cin>>arr[i]; // 1 2 3 4 5 4 3 2 1
	}
	
	for(int i=1; i<(n-1); i++){
		int lmax=arr[0], Rmax=arr[n-1];
		for(int j=i; j>=0; j--){
			if(arr[j]>lmax)
				lmax = arr[j];
		}
		for(int j=i; j<n; j++){
			if(arr[j]>Rmax)
				Rmax = arr[j];
		}
		if(lmax>Rmax)
			min=Rmax;
		else
			min=lmax;

		w+=min-arr[i];
		cout << w << endl;

	}
	cout<<"water " <<w;
}