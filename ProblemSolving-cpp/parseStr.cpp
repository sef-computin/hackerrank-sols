#include <sstream>
#include <vector>
#include <iostream>
using namespace std;

vector<int> parseInts(string str) {
    stringstream ss(str);
    vector <int> integers;
    int i=0;
    char c;
    int l;
    while(ss>>l)
    {
        integers.push_back(l);
        try{ss>>c;}catch(exception){};
    }
    return integers;
	
}

int main() {
    string str;
    cin >> str;
    vector<int> integers = parseInts(str);
    for(int i = 0; i < integers.size(); i++) {
        cout << integers[i] << "\n";
    }
    
    return 0;
}