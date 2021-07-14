//singly linked_list/forward_list

#include<bits/stdc++.h>
using namespace std;
int main()
{
    forward_list<int> l={10,20,30};
    cout<<"Your Array Elements"<<endl;
    //display list
    for(auto x:l){
        cout<<x<<" ";
    }
    //add elements in list from front

    l.push_front(40);
    l.push_front(60);

    //display list
    cout<<endl<<"After push Operation:"<<endl;
    for(auto x:l){
        cout<<x<<" ";
    }

    //pop element from list from front
    l.pop_front();

    //display list
    cout<<endl<<"After pop Operation "<<endl;
    for(auto x:l){
        cout<<x<<" ";
    }

    //insert_after
    auto iter=l.insert_after(l.begin(),1);
    iter=l.insert_after(iter,{2,5,8});

    //display list
    cout<<endl<<"After insert_after Operation"<<endl;
    for(auto x:l){
        cout<<x<<" ";
    }
    //erase after
    iter=l.erase_after(iter);

    //display list
    cout<<endl<<"After erase_after Operation"<<endl;
    for(auto x:l){
        cout<<x<<" ";
    }
    return 0;
}