#include<iostream>
#include<unordered_map>
#include <cmath>

using namespace std;

int main()
{
	int t; cin >> t;
	while(t--)
	{
		int numToBeRemoved = 0;
		unordered_map<int, int> list1; // first - value from any list, second it's counter.
		unordered_map<int, int> list2; // first - value from any list, second it's counter.
		int n; cin >> n;
		int m; cin >> m;
		
		//scanning elements of lists
		int temp;
		for( ; n > 0; n--)
		{
			cin >> temp;
			//emplace() returns pair<iterator to element, double isEmplaced>
			if(list1.emplace(temp, 1).second == false) ++list1[temp];
		}
		for( ; m > 0; m--)
		{
			cin >> temp;
			if(list2.emplace(temp, 1).second == false) ++list2[temp];
		}
		//check list1
		for(auto x = list1.begin(); x != list1.end(); )
		{	
			auto t = list2.find(x->first);
			if(t == list2.end())
			{
				numToBeRemoved += x->second;
				int key = x->first;
				++x;
				list1.erase(key);
			}
			else
			{
				numToBeRemoved += abs(x->second - t->second);
				++x;
				
			}
		}
		//chech list2
		for(auto x = list2.begin(); x != list2.end(); ++x ) 
		{
			auto t = list1.find(x->first);
			if(t == list1.end()) numToBeRemoved += x->second;
		}
		
		cout << numToBeRemoved << endl;
	}
	return 0;
}