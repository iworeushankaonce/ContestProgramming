#include<iostream>
#include<unordered_map>
#include <sstream>

using namespace std;

int main()
{
	unordered_map<string,string> mymap;// first - eng, second - other language
	
	string temp, second;
    getline(cin, temp);
    
    while (temp != "")
    {
        stringstream ss(temp);
        
        ss >> temp >> second;
        mymap[second] = temp;
        getline(cin, temp);
    }
    
    while (cin >> temp)
    {
        auto it = mymap.find(temp);
        if (it == mymap.end()) cout << "eh" << endl;
        else cout << it->second << endl;;
    }
	return 0;
}