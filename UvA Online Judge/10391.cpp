#include <iostream>
#include <vector>
#include <string>
#include <map>
#include <algorithm>
#include <set>

using namespace std;

int main()
{
    string s;
    vector<string> v;
    
    while(cin>>s)
        v.push_back(s);
    
    map<string,bool> M;
    
    for(int i = 0; i < v.size(); i++) 
		M[v[i]]=true;
    
    set<string> res;
        
    string s1,s2;
        
    for(int i=0;i<v.size();i++)
    {
        for(int j=1;j<v[i].size();j++)
        {
            s1=v[i].substr(0,j);
            s2=v[i].substr(j,v.size()-j);
            if(M[s1] && M[s2]) res.insert(v[i]);
        }
    }
    for(auto i = res.begin(); i != res.end(); i++) 
		cout << *i << endl;

    return 0;
}