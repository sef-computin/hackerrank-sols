#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int count, queries;
    cin>>count>>queries;
    int** matrix = new int*[count];
    for(int i=0;i<count;i++)
    {
        int len;
        cin>>len;
        matrix[i] = new int[len];
        for(int j=0; j<len; j++) cin>>matrix[i][j];
    }
    for(int i=0; i<queries;i++)
    {
        int choice, index;
        cin>>choice>>index;
        cout<<matrix[choice][index]<<endl;
        
    }
    
    
    for (int i = 0; i < count; ++i) delete[] matrix[i];
    delete[] matrix;

    return 0;
}