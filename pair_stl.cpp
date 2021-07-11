#include<bits/stdc++.h>
#include<utility>
using namespace std;
void Sort_pair(int a[],char b[],int size){
    pair<int,char> p[size];
    for(int i=0;i<size;i++){
        p[i].first=a[i];
        p[i].second=b[i];
    }
    sort(p,p+size);
    for(int i=0;i<size;i++){
        b[i]=p[i].second;

    }
    for(int i=0;i<size;i++){
        cout<<p[i].first<<" "<<p[i].second<<endl;
    }

}
int main(){
    int size;
    cout<<"Enter the Size of Array "<<endl;
    cin>>size;
    int a[size];
    char b[size];
    cout<<"Enter your first array elements "<<endl;
    for(int i=0;i<size;i++){
        cin>>a[i];
    }
    cout<<"Enter your second array elements(Character)"<<endl;
    for(int i=0;i<size;i++){
        cin>>b[i];
    }
    cout<<"Sorted array "<<endl;

    
    Sort_pair(a,b,size);

    return 0;


}