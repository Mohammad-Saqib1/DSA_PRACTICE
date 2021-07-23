//Rearrange an array of arr[i] becomes arr[arr[i]] and the size of array elements are o to n-1
#include<bits/stdc++.h>
using namespace std;

//Rearrange function
void rearrange(int arr[],int array_size){
    for(int i=0;i<array_size;i++){
        arr[i]=arr[i]+(arr[arr[i]]%array_size)*array_size;
    }

    for(int i=0;i<array_size;i++){
        arr[i]=arr[i]/array_size;
    }

}



int main(){
    int n;
    cout<<"Enter the size of array "<<endl;
    cin>>n;
    cout<<"Enter the array elements "<<endl;
    cout<<"Array Elements Must belongs 0 to n-1 "<<endl;
    int arr[n];
    //input array elements
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }

    //print before rearrange
    cout<<"Before Rearrange "<<endl;
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
    //rearrange
    rearrange(arr,n);
    cout<<endl;
    //print after rearrange elements
    cout<<"After Rearrange "<<endl;
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }


    return 0;
}