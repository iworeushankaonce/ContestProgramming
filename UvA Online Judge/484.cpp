#include<iostream>
#include<unordered_map>
#include <vector>

using namespace std;

int main()
{
	unordered_map<int,int> mymap;
	vector<int> v;
	int x;
	while(cin >> x)
	{
		//emplace() returns pair<iterator to element, double isEmplaced>
		if(mymap.emplace(x, 1).second == false)
		{
			++mymap[x];
		}
		else v.push_back(x);
	}
	
	for(int i = 0; i < v.size(); ++i)
	{
		auto r = mymap.find(v[i]);
		cout << r->first << " " << r->second << endl;
	}
	return 0;
}