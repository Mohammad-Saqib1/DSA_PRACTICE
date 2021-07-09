#include<iostream>
using namespace std;
int binarySearch(int arr[],int size,int key){
    int left=0;
    int right=size-1;
    while(left<=right){
        int mid=left+(right-left)/2;
        if(arr[mid]==key){
            return mid;
        }
        else if(arr[mid]>key){
            right=mid-1;
        }
         else{
            left=mid+1;
        }
    }
     return -1;

}


int main(){
    int size,key;
    cout<<"Enter the Size of Array "<<endl;
    cin>>size;
    int arr[size];

    cout<<"Enter the Elements  of Array "<<endl;

    for(int i=0;i<size;i++){
        cin>>arr[i];
    }
    cout<<"Enter the Searching Element "<<endl;
    cin>>key;
int result=binarySearch(arr,size,key);
cout<<"Searching Element's Index is "<<result;
    return 0;
}