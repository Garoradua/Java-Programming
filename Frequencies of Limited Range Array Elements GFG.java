public static void frequencyCount(int arr[], int N, int P)
    {
        // code here
        for(int i=0; i<arr.length; i++){
            int count = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[j]==i+1){
                    count++;
                }
            }
            arr[i] = count;
        }
    }

